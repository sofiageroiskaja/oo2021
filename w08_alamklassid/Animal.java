public abstract class Animal{
    public String name = "default";
    public int age = 3;
    public String owner = "Sofia";

    public Animal(String name, int age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    public void myInfo(){
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nOwner: " + this.owner);
    }
    public void rightNowIam(){
        System.out.println("Right now " + this.name + " is sleeping");
    }
    public void favouriteHobbyIs(String hobby){
        System.out.println(this.name + "'s favourite hobby is " + hobby);
    }
    public void iMostlyDo(){
        System.out.println(this.name + " sleeps most of the time");
    }
    public abstract void play();
    public abstract void talk();
}
