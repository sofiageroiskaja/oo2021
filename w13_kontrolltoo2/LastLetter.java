import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LastLetter{
    public static void main(String[] args) throws IOException{
        File file = new File("tekst.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        System.out.println(line);

        br.close();
    }
}