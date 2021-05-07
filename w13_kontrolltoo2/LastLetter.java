import java.util.Scanner;
import java.io.*;
 
public class LastLetter {
  public static void main(String[] args) throws IOException {
 
    File file = new File("tekst.txt");
    Scanner input = new Scanner(file); 
 
    int count = 0;
    while(input.hasNext()) {
      String word  = input.next();
      char last  = word.charAt(word.length()-1);
    if(last == '.' || last == ',' || last == '!' || last == '?'){
        System.out.println(word.charAt(word.length()-2));
    }else{
        System.out.println(last);
    }
    count = count + 1;
    }
    System.out.println("Letters: " + count);
    input.close();
  }
}