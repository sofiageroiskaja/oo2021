import java.util.ArrayList;

public class Hulknurk {
  public static void main(String[] args) {
    ArrayList<Integer> x = new ArrayList<Integer>();
    ArrayList<Integer> y = new ArrayList<Integer>();
    ArrayList<Integer> z = new ArrayList<Integer>();
    x.add(1); x.add(2); x.add(7); x.add(9);
    y.add(4); y.add(3); y.add(15); y.add(23);
    z.add(7); z.add(34); z.add(25); z.add(8);

    for (int i = 0; i < x.size(); i++) {
        int sum = 0;
        sum += x.get(i) + y.get(i) + z.get(i);
        System.out.println("x: " + x.get(i) + " y: " + y.get(i) + " z: " + z.get(i));
        System.out.println("Ümbermõõt: " + sum);

      }
  }
}