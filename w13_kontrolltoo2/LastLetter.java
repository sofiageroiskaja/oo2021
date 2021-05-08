import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;
 
public class LastLetter {
  public static void main(String[] args) throws IOException {
 
    File file = new File("tekst.txt");
    Scanner input = new Scanner(file); 
    ArrayList<Character> last_ch = new ArrayList<Character>(); 

    //Leian sõnade viimased tähed ja lisan neid arraylisti
    while(input.hasNext()) {
      String word  = input.next();
      char last  = word.charAt(word.length()-1);
    if(last == '.' || last == ',' || last == '!' || last == '?' || last == '"'){
        last_ch.add(word.charAt(word.length()-2));
    }else{
        last_ch.add(last);
      }
    }

    //Trükin välja sõnade viimased tähed (arraylist)
    System.out.println("Sõnalõputähed:");
    System.out.println(last_ch + "\n");

    //Leian erinevate sõnalõputähtede esinemissagedust
    String s = freqSort(arrayToString(last_ch));
    int[] freq = new int[s.length()];    
    int i;
    int j; 
    char string[] = s.toCharArray();

    for(i = 0; i < s.length(); i++){    
      freq[i] = 1;    
      for(j = i + 1; j < s.length(); j++){    
        if(string[i] == string[j]){    
          freq[i]++;    
          string[j] = '0';    
        }
      }
    }

    //trükin välja sõnalõputähed esinemissageduse järjekorras
    System.out.println("Sõnalõputähed ja nende esinemissagedus:");  

    for(i = 0; i < freq.length; i++){    
      if(string[i] != '0'){   
      System.out.println(string[i] + ": " + freq[i]);   
      }
    }  
    input.close();
  }

  //teen sõnalõputähtede arraylistist stringi
  public static String arrayToString(ArrayList<Character> list){    
    StringBuilder b = new StringBuilder(list.size());
    for(Character c : list){
      b.append(c);
    }
    return b.toString();
  }

  //sorteerin saadud stringi esinemissageduse järgi
  public static String freqSort(String s){    
    List<Set<Character>> cByFreq = new ArrayList<>();
    Map<Character, Integer> freqMap = new HashMap<>(); 
    cByFreq.add(null); 

    for(char c : s.toCharArray()){
      Character ch = c;
      int oldFreq = freqMap.getOrDefault(c, 0);

      if(oldFreq != 0){
        cByFreq.get(oldFreq).remove(ch);
      }
      
      int newFreq = oldFreq + 1;

      if(newFreq >= cByFreq.size()){
        cByFreq.add(new TreeSet());
      }

      cByFreq.get(newFreq).add(ch);
      freqMap.put(ch, newFreq);
    }

    StringBuilder result = new StringBuilder();
    for(int i = 1; i < cByFreq.size(); i++){ 
      Set<Character> chSet = cByFreq.get(i); 
      for(Character c : chSet){ 
        for (int j = 0; j < i; j++) result.append(c);
      }
    }
    result.reverse();
    return result.toString();
  }
}
