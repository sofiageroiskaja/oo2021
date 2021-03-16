public class Cat implements Animal{
    private String catName;
    
    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String speak() {
        return "Meow meow meoooooooooooooooowwwwwww meow";
    }

    @Override
    public void eat() {
        String[] catFood = new String[]{"Salmon", "Tuna", "Chicken", "Turkey", "Beef"}; 
        System.out.println(catName + "`s favorite food:");
        for(int i = 0; i < catFood.length; i++){
        System.out.println(i+1 + ": " + catFood[i]);
        }
    }

    @Override
    public void sleep() {
        System.out.println("\nDo not disturb! " + catName + " is having a nice dream");        
    }

    @Override
    public void beSneaky() {
        System.out.println(catName + " is caught in the act. Sneaky thief busted");        
    }

    @Override
    public void lookAround() {
        System.out.println(catName + " looks around");
    }

    @Override
    public void attack() {
        String[] enemies = new String[]{"bird", "dog", "couch", "humans hand", "humans leg"}; 
        System.out.println(catName + " attacks a " + enemies[2]);
    }

    @Override
    public void defend() {
        String[] who = new String[]{"itself", "its human", "its friend", "its kittens"}; 
        System.out.println(catName + " defends " + who[1]);
    }
    
}