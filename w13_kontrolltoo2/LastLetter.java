import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
 
public class LastLetter {
  public static void main(String[] args) throws IOException {
 
    File file = new File("tekst.txt");
    Scanner input = new Scanner(file); 
    int count = 0;
    ArrayList last_ch = new ArrayList<>();
  
    //esimene punkt
    while(input.hasNext()) {
      String word  = input.next();
      char last  = word.charAt(word.length()-1);
    if(last == '.' || last == ',' || last == '!' || last == '?'){
        System.out.println(word.charAt(word.length()-2));
        last_ch.add(word.charAt(word.length()-2));
    }else{
        System.out.println(last);
        last_ch.add(last);
    }
    count = count + 1;
    }
    System.out.println("Letters: " + count + "\n\n");
    System.out.println(last_ch);
    input.close();
    }
}