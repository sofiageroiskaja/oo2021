import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
 
public class LastLetter {
  public static void main(String[] args) throws IOException {
 
    File file = new File("tekst.txt");
    Scanner input = new Scanner(file); 
    int count = 0;
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
    count = count + 1;
    }
    //Trükin välja sõnade viimased tähed (arraylist)
    System.out.println("Tähed:");
    System.out.println(last_ch);
    //Trükin välja letters cont (seda polnud ülesandes, tegin lihtsalt enda jaoks)
    System.out.println("Tähtede arv: " + count);

    //Leian erinevate sõnalõputähtede esinemissagedust ja trükin neid esinemissageduse järjekorras
    System.out.println("Sõnalõputähtede esinemissagedus:");
    Set<Character> uniguech = new HashSet<Character>(last_ch);
    for(Character i : uniguech){
      System.out.println(i + ": " + Collections.frequency(last_ch, i));
    }
    input.close();
    }
}