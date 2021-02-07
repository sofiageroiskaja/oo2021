import java.util.Scanner;

class EvenOdd{
  public static void main(String args[])
  {
    int number;
    System.out.println("Sisesta int number:");

    try{
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if ( number % 2 == 0 )
        System.out.println(number + " on paaris number");
     else
        System.out.println(number + " on paaritu number");
  } catch (Exception e) {
    System.out.println("Midagi läks valesti");
  }}}