public class Child2 extends Parent{
    
    public Child2(String name, int age, String dream){
        super(name, age, dream);
    }

    @Override
    public void firstThingIDo(){
        super.firstThingIDo();
        System.out.println("I brush my hair");
    }

    @Override
    public void howISpendMyEvenings(){
        System.out.println("I sing songs");
    }
}
