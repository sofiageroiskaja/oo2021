import java.util.ArrayList;
import java.util.Scanner;

public class Algarvud{
    public static void main(String[] args) {
        
        DividedBy();
        IsPrime();
        PrimeArray();

    }

    
    static void DividedBy(){
    
    try{

        System.out.print("Kontrollime kas sinu arv jagub 2-ga, 3-ga, 5-ga või 7-ga:\n");

        int n;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Sisesta mingi arv: ");
        n = user_input.nextInt();
        if(n % 2 == 0 && n % 3 == 0 && n % 5 == 0 && n % 7 == 0){
            System.out.println(n + " jagub kahega, kolmega, viiega ja seitsmega");
        }
        else if(n % 2 == 0 && n % 3 == 0 && n % 5 == 0){
            System.out.println(n + " jagub kahega, kolmega ja viiega");
        }
        else if(n % 2 == 0 && n % 3 == 0 && n % 7 == 0){
            System.out.println(n + " jagub kahega, kolmega ja seitsmega");
        }
        else if(n % 3 == 0 && n % 5 == 0 && n % 7 == 0){
            System.out.println(n + " jagub kolmega, viiega ja seitsmega");
        }
        else if(n % 2 == 0 && n % 5 == 0 && n % 7 == 0){
            System.out.println(n + " jagub kahega, viiega ja seitsmega");
        }
        else if(n % 2 == 0 && n % 3 == 0){
            System.out.println(n + " jagub kahega ja kolmega");
        }
        else if(n % 2 == 0 && n % 5 == 0){
            System.out.println(n + " jagub kahega ja viiega");
        }
        else if(n % 2 == 0 && n % 7 == 0){
            System.out.println(n + " jagub kahega ja seitsmega");
        }
        else if(n % 3 == 0 && n % 5 == 0){
            System.out.println(n + " jagub kolmega ja viiega");
        }
        else if(n % 3 == 0 && n % 7 == 0){
            System.out.println(n + " jagub kolmega ja seitsmega");
        }
        else if(n % 5 == 0 && n % 7 == 0){
            System.out.println(n + " jagub viiega ja seitsmega");
        }
        else if(n % 2 == 0){
            System.out.println(n + " jagub kahega");
        }
        else if(n % 3 == 0){
            System.out.println(n + " jagub kolmega");
        }
        else if(n % 5 == 0){
            System.out.println(n + " jagub viiega");
        }
        else if(n % 7 == 0){
            System.out.println(n + " jagub seitsmega");
        }
        else{
            System.out.println(n + " ei jagu kahega, kolmega, viiega ega seitsmega");
        }
    }
    catch (Exception e){
        System.out.println("Midagi läks valesti, proovi uuesti");
    }
}

    static void IsPrime(){

        System.out.print("\nKontrollime kas sinu arv on algarv või mitte:\n");

        int n;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Sisesta mingi arv: ");
        n = user_input.nextInt();

        if (n == 2 || n == 3) {
            System.out.println(n + " on algarv");
        } else if (n == 5 || n == 7) {
            System.out.println(n + " on algarv");
        } else if (n % 5 == 0 || n % 7 == 0) {
            System.out.println(n + " ei ole algarv");
        } else if (n % 2 == 0 || n % 3 == 0) {
            System.out.println(n + " ei ole algarv");
        } else {
            System.out.println(n + " on algarv");
        }
}

    static void PrimeArray(){
        ArrayList<Integer> primeNums = new ArrayList<Integer>();        
        int num = 2;
        int i = 0;
        while(i < 1000) {
            if(checkPrime(num) == true){
                primeNums.add(num);
                i++;
            }
            num++;
        }

        ArrayList<Integer> bigNums = new ArrayList<Integer>(); 
        int lastNum = primeNums.get(999);
        int max = 0;

        for(int n = lastNum * lastNum; max < 10; n --){
            for(int d = 0; d <= 999; d ++){
                
                if(d == 999){
                    max ++;
                    bigNums.add(n);
                }
                if(n % primeNums.get(d) == 0){
                    break;
                }
            }
        }
            System.out.println(bigNums);
    }

    public static boolean checkPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}