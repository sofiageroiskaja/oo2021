public class Second {
    
    public static void main(String[] args){
        System.out.println(myName());
        System.out.println(add(5, 10));
        System.out.println(fullName("Sofia", "Geroiskaja"));
        System.out.println(checkEqual(5, 10));
        System.out.println(notEqual(5, 5));

        myMath();
        myLogical();
        areStringsEqual();
    }
    public static String myName(){
        return "Sofia";
    }
    public static int add(int number1, int number2){
        return number1 + number2;
    }
    public static String fullName(String firstName, String lastName){
        return firstName + " " +lastName + "!";
    }
    public static boolean checkEqual(int number1, int number2){
        return number1 == number2;
    }
    public static boolean notEqual(int number1, int number2){
        return number1 != number2;
    }
    public static void myMath(){
        System.out.println(Math.pow(5, 2));

        int number = (int) Math.pow(5,2); //casting
        System.out.println(number);

        System.out.println(Math.sqrt(9));
    }
    public static void myLogical(){
        System.out.println(5 < 10 && 5 > 4);
        System.out.println(6 > 8 || 3 == 3);
    }
    public static void areStringsEqual(){
        String name1 = "Sofia";
        String name2 = "Sofia";

        System.out.println(name1 == name2);

        String newname1 = new String("Sofia"); //uus objekt
        String newname2 = new String("Sofia");

        System.out.println(name1 == name2);
    }
}
