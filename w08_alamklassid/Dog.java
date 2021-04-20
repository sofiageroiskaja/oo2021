public class Dog extends Animal{
    
    public Dog(String name, int age, String owner){
        super(name, age, owner);
    }
    
    @Override
    public void play() {
        System.out.println(this.name + " wants to play");
    }

    @Override
    public void iMostlyDo(){
        System.out.println(this.name +" eats most of the time");
    }

    @Override
    public void rightNowIam(){
        System.out.println("Right now " + this.name + " is eating");
    }

    @Override
    public void talk() {
        System.out.println("Woof woof!");
    }

}
