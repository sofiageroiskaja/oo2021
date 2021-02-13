import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args){
        LinkedList<String> flowers = new LinkedList<String>();
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Orchid");
        System.out.println(flowers);
    
        /*The LinkedList class has all of 
        the same methods as the ArrayList + */

        flowers.addFirst("Hyacinth");
        flowers.addLast("Chrysanthemum");
        System.out.println(flowers);

        flowers.removeFirst();
        flowers.removeLast();
        System.out.println(flowers);

        System.out.println(flowers.getFirst());
        System.out.println(flowers.getLast());
    }
}
