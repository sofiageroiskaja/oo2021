package rakendus;

public class Main {
    private static CatCharacter cat2;
    private static CatCharacter cat1;

    public static void main(String[] args) {
    Cat.sayMeow();
    CatCharacter cat1 = new CatCharacter("Luna");

    cat1.setInfo("I can jump very high");
    cat1.setWork(5);
    
    System.out.println(cat1.name + ": " + cat1.getInfo());
    System.out.println("I work for " + cat1.getWork() + " years");
    
    CatCharacter cat2 = new CatCharacter("Kitty");
    cat2.setWork(3);

    System.out.println(cat2.name + ": " + cat2.getInfo());
    System.out.println("I work for " + cat2.getWork() + " years");
    
    if(cat1.getWork() < cat2.getWork()){
        System.out.println(cat2.name + " will go on a mission");
    }else{
        System.out.println(cat1.name + " will go on a mission");
    }
}
}
