public class Cat extends Animal{
    public Cat(String name, int age, String owner){
        super(name, age, owner);
    }
    
    @Override
    public void play() {
        System.out.println(this.name + " does not want to play");
    }

    @Override
    public void iMostlyDo(){
        System.out.println(this.name +" talks most of the time");
    }

    @Override
    public void talk() {
        System.out.println("Meow meow!");
    }

}
