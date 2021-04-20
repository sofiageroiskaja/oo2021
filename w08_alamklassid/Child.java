public class Child extends Parent{
    
    public Child(String name, int age, String dream){
        super(name, age, dream);
    }

    @Override
    public void firstThingIDo(){
        super.firstThingIDo();
        System.out.println("I go to the toilet");
    }

    @Override
    public void howISpendMyEvenings(){
        System.out.println("I do stuff i like");
    }
}
