public class Dog implements Animal{
    private String dogName;
    
    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String speak() {
        return "woof woof wooooooooof woof woof";
    }

    @Override
    public void eat() {
        String[] dogFood = new String[]{"Meat", "Fish", "Vegetables", "Salami", "Cheese"}; 
        System.out.println(dogName + "`s favorite food:");
        for(int i = 0; i < dogFood.length; i++){
        System.out.println(i+1 + ": " + dogFood[i]);
        }
    }

    @Override
    public void sleep() {
        System.out.println("\nDo not disturb! " + dogName + " is having a nice dream");        
    }

    @Override
    public void beSneaky() {
        System.out.println(dogName + " is caught in the act. He spilled the water");        
    }

    @Override
    public void lookAround() {
        System.out.println(dogName + " looks around to find its human");
    }

    @Override
    public void attack() {
        String[] enemies = new String[]{"cat", "toy", "chair", "humans hand", "humans leg"}; 
        System.out.println(dogName + " attacks a " + enemies[1]);
    }

    @Override
    public void defend() {
        String[] who = new String[]{"itself", "its human", "its friend", "its puppies"}; 
        System.out.println(dogName + " defends " + who[3]);
    }
    
}
