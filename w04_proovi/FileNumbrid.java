import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class FileNumbrid {

    public static void main(String[] args) throws IOException {
        File numbrid = new File("numbrid.txt");
        File numbridWrite = new File("outnumbrid.txt");

        FileReader fr = new FileReader(numbrid);
        BufferedReader br = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter(numbridWrite);
        
        String line = br.readLine();
        int sum = 0;
        while (line != null){
            sum += Integer.parseInt(line);
            line = br.readLine();
        }
        pw.println("Sum is " + sum);

        br.close();
        pw.close();
    }
}