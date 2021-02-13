import java.util.ArrayList;
import java.util.Collections;

public class ListArray{
    public static void main(String[] args){
        //create
        ArrayList<String> animals = new ArrayList<String>();

        //add
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        System.out.println(animals);

        //access
        animals.get(1);

        //change
        animals.set(0, "horse");

        //remove
        animals.remove(2);
        /*remove all
        animals.clear();*/

        //size
        animals.size();

        //loop through
        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }
        for (String i : animals){
            System.out.println(i);
        }

        //integer
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(3);
        for (int i : numbers) {
            System.out.println(i);
        }

        //sort
        Collections.sort(animals);
        for (String i : animals) {
           System.out.println(i);
        }
        Collections.sort(numbers);
        for (int i : numbers) {
         System.out.println(i);
        }
    }   
}