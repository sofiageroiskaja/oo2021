public abstract class Parent{
    public String name = "default";
    public int age;
    public String dream;

    public Parent(String name, int age, String dream){
        this.name = name;
        this.age = age;
        this.dream = dream;
    }
    public void myInfo(){
        System.out.println(this.name + " " + this.age + " " + this.dream);
    }
    public void favouriteHobbyIs(String hobby){
        System.out.println(this.name + "'s favourite hobby is " + hobby);
    }
    public void firstThingIDo(){
        System.out.println("I brush my teeth");
    }
    public abstract void howISpendMyEvenings();
}
