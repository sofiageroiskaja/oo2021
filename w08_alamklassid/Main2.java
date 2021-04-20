public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Adam", 3, "Sofia");
        dog.myInfo();
        dog.talk();
        dog.rightNowIam();
        dog.favouriteHobbyIs("traveling with his owner");
        dog.iMostlyDo();
        dog.play();

        Cat cat = new Cat("Iris", 5, "Sofia");
        System.out.println("\n");
        cat.myInfo();
        cat.talk();
        cat.rightNowIam();
        cat.favouriteHobbyIs("sleeping and destroying the house");
        cat.iMostlyDo();
        cat.play();
    }
}
