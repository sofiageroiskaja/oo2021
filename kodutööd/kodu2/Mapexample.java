import java.util.HashMap;

public class Mapexample {
    public static void main(String[] args){
        Cars();
    }
    public static void Cars(){
        HashMap<String, Integer> OwnerCar = new HashMap<String, Integer>();

        OwnerCar.put("Sofia", 2);
        OwnerCar.put("Jennifer", 3);
        OwnerCar.put("Stacy", 20);
        OwnerCar.put("John", 4);

        for (String i : OwnerCar.keySet()) {
            System.out.println(i + " omab " + OwnerCar.get(i) + " autot");
        } 
    }
    
}
