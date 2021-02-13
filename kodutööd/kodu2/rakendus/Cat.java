package rakendus;

public class Cat {
    public int head = 1;
    public int eyes = 2;
    public int paws = 4;
  
    public String name = "";
  
    public Cat(String name){
      this.name = name;
    }
  
    public static void sayMeow(){
      System.out.println("Meow!!!");
    }
}