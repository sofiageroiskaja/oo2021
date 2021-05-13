import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.util.stream.Collectors;
 
public class LastLetter {
  public static void main(String[] args) throws IOException {
 
    File file = new File("tekst.txt");
    Scanner input = new Scanner(file);
    ArrayList<Character> lastCharacters = new ArrayList<>();
    Map<Character, List<String>> words = new HashMap<>();
 
    //Leian sõnade viimased tähed ja lisan neid arraylisti
    while(input.hasNext()) {
      String word  = input.next();
      word = removePunctuation(word);
      Character lastCharacter = word.charAt(word.length() - 1);
      lastCharacters.add(lastCharacter);
      if (!words.containsKey(lastCharacter)) {
        words.put(lastCharacter, new ArrayList<>());
      }
      words.get(lastCharacter).add(word);
    }
    input.close();
 
    //Trükin välja sõnade viimased tähed (arraylist)
    System.out.println("Sõnalõputähed:");
    System.out.println(lastCharacters + "\n");
 
    //Leian erinevate sõnalõputähtede esinemissagedust
    System.out.println("Sõnalõputähed ja nende esinemissagedus:");
    printLetterFrequencies(lastCharacters);
 
    // loon iga tähe jaoks faili koos nende sõnadega
    createLetterFiles(words);
 
    // loon HTML lehe viidetega
    createIndexFile(words);
  }
 
  private static String removePunctuation(String word) {
    char last  = word.charAt(word.length()-1);
    if(last == '.' || last == ',' || last == '!' || last == '?' || last == '"'){
      return word.substring(0, word.length() - 1);
    }
    return word;
  }
 
  private static void printLetterFrequencies(ArrayList<Character> lastCharacters) {
    Map<Character, Long> frequency = lastCharacters.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    frequency.entrySet().stream()
        .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
        .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
  }
 
  private static void createLetterFiles(Map<Character, List<String>> words) throws IOException {
    if (Files.notExists(Paths.get("output"))) {
      Files.createDirectory(Paths.get("output"));
    }
    Files.deleteIfExists(Paths.get("output", "*.html"));
    words.keySet().forEach(c -> {
      try {
        String html = "<html><body>";
        String letters = words.get(c).stream().map(w -> "<p>" + w + "</p>").collect(Collectors.joining(System.lineSeparator()));
        html = html + letters + "</body></html>";
        Files.write(Paths.get("output" , c + ".html"), html.getBytes());
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
  }
 
  private static void createIndexFile(Map<Character, List<String>> words) throws IOException {
    String html = "<html><body>";
    String links = words.keySet().stream().sorted()
        .map(c -> "<p><a href='" + c + ".html'>" + c + " (" + words.get(c).size() + ")</a></p>")
        .collect(Collectors.joining(System.lineSeparator()));
    html = html + links + "</body></html>";
    Files.write(Paths.get("output" , "index.html"), html.getBytes());
  }
}
