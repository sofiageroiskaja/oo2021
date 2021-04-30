import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three");
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Character> characters = Arrays.asList('a', 'b', 'c');
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
        List<String> emptyStrings = new ArrayList<>();

        System.out.println(
            Generics.getFirst(strings) + " " +
            Generics.getFirst(integers) + " " +
            Generics.getFirst(characters) + " " +
            Generics.getFirst(doubles) + " " +
            Generics.getFirst(emptyStrings)
        );

        Generics.printList(strings);
        System.out.println("Sum of integers is: " + Generics.sumOfList(integers));

        Generics.lowerBound(integers);

        SimplePair<Integer, String> pair = new SimplePair<Integer,String>(5, "Sofia");
        System.out.println(pair.getKey() + " " + pair.getValue());

        System.out.println(
            Generics.getType(1) + " " +
            Generics.getType("Sofia") + " "
        );

        String[] stringArray = {"Hello", "everyone", "i", "am", "Sofia"};
        Integer[] integerArray = {1, 2,3 ,4};

        Generics.printArray(stringArray);
        Generics.printArray(integerArray);

        SimpleGenerics<String> sg = new SimpleGenerics<>();
        sg.set("Sofia");
        System.out.println(sg.get());
        System.out.println(sg.getType());
    }
}