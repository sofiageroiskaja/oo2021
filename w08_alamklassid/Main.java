public class Main{
    public static void main(String[] args) {
        Child child = new Child("Sofia", 18, "Web Designer");
        child.myInfo();
        child.favouriteHobbyIs("table tennis");
        child.firstThingIDo();
        child.howISpendMyEvenings();

        Child2 child2 = new Child2("Nika", 16, "Web Developer");
        child2.myInfo();
        child2.favouriteHobbyIs("singing");
        child2.firstThingIDo();
        child2.howISpendMyEvenings();
    }
}
