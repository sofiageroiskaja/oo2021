public class Main {
    public static void main(String[] args) {
      EstonianID estid = new EstonianID("50103150830");
      FinnishID finid = new FinnishID("150301A232K");
      Cat cat = new Cat("Luna");
      Dog dog = new Dog("Adam");
      Apple apple = new Apple("Apple");
      Pear pear = new Pear("Pear");


      System.out.println("Data obtained from Estonian ID:");
      System.out.println("Gender: " + estid.getGender());
      System.out.println("Date of birth: " + estid.getDOB());
      System.out.println("Age: " + estid.getAge());
      System.out.println("Year of birth: " + estid.getFullYear());
      System.out.println("Month of birth: " + estid.getMonth());
      System.out.println("Day of birth: " + estid.getDay());

      System.out.println("\nData obtained from Finnish ID:");
      System.out.println("Gender: " + finid.getGender());
      System.out.println("Date of birth: " + finid.getDOB());
      System.out.println("Age: " + finid.getAge());
      System.out.println("Year of birth: " + finid.getFullYear());
      System.out.println("Month of birth: " + finid.getMonth());
      System.out.println("Day of birth: " + finid.getDay());
    
      System.out.println("\nCat:");
      System.out.println("A cat says: " + cat.speak());
      cat.eat(); cat.sleep();
      cat.beSneaky(); cat.attack(); cat.defend();

      System.out.println("\nDog:");
      System.out.println("A dog says: " + dog.speak());
      dog.eat(); dog.sleep();
      dog.beSneaky(); dog.attack(); dog.defend();

      System.out.println("\nApple:");
      System.out.println("Apple contains: " + apple.contains());
      apple.typeInfo(); apple.benefits();
      apple.nutrition();

      System.out.println("\nPear:");
      System.out.println("Pear contains: " + pear.contains());
      pear.typeInfo(); pear.benefits();
      pear.nutrition();
    }
}