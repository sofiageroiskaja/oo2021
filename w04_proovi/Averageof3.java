public class Averageof3 {

 public static void main(String[] args)
    {
        int num1 = 13;
        int num2 = 3;
        int num3 = 1;
        System.out.print("Aritmeetiline keskmine: " + average(num1, num2, num3) );
    }

  public static double average(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}