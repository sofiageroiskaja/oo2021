import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        //create
        HashSet<String> cars = new HashSet<String>();

        //add
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);

        //check
        System.out.println(cars.contains("Mazda"));

        //remove
        cars.remove("Volvo");
        System.out.println(cars);
        //cars.clear();

        //size
        System.out.println(cars.size());

        //loop through
        for (String i : cars) {
            System.out.println(i);
        }

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for(int i = 1; i <= 10; i++) {
        if(numbers.contains(i)) {
            System.out.println(i + " was found in the set.");
        } else {
            System.out.println(i + " was not found in the set.");
        }
    }
        //Treeset
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Sofia");
        ts.add("Sofi");
        ts.add("Sofja");
        System.out.println(ts);
        
        //check
        String check = "Sofi"; 
        System.out.println("Contains " + check 
                            + " " + ts.contains(check)); 

        //get
        System.out.println("First Value " + ts.first()); 
        System.out.println("Last Value " + ts.last()); 
  
        //higher / lower
        String val = "Sofi"; 
        System.out.println("Higher " + ts.higher(val)); 
        System.out.println("Lower " + ts.lower(val)); 

        //remove
        //ts.remove("Sofia"); 

        ts.pollFirst(); 
        ts.pollLast(); 
  
        System.out.println("After removing last " + ts); 
    }
}
