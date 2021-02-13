import java.util.Random;

public class Listexample{    
  	public static void main(String[] args){        
        RandomNumber();
    }
    public static void RandomNumber(){
        String[] arr={"Sofia", "Maria", "Anna", "Lisa", "Laura"};
      	Random random = new Random();        
      	int rnumber = random.nextInt(arr.length);
      	System.out.println("Tahvli ees hakkab vastama: " + arr[rnumber]);
    }
}
