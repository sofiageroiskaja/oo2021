import java.util.HashSet;

public class Setexample {
    public static void main(String[] args) {
        NewHome();
    }
    public static void NewHome(){
        HashSet<String> cats = new HashSet<String>();
        cats.add("Luna");
        cats.add("Bella");
        cats.add("Lily");

        if(cats.contains("Luna")){
            System.out.println("Luna leidis uut kodu");
            cats.remove("Luna");
        }else{
            System.out.println("Luna ei leidnud uut kodu");
        }
        System.out.println("Uut kodu otsivad: " + cats);
}}
