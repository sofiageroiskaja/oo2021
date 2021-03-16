import java.util.HashMap;

public class Apple implements Fruit{
    private String name;
    
    public Apple(String name) {
        this.name = name;
    }

    @Override
    public String contains() {
        return "antioxidants, vitamins, dietary fiber, and a range of other nutrients";
    }

    @Override
    public void typeInfo() {
        HashMap<String, String> typeInfo = new HashMap<String, String>();
        typeInfo.put("McIntosh", "juicy, with tender, tangy flavor");
        typeInfo.put("Red delicious", "crisp and juicy");
        typeInfo.put("Fuji", "has firm, sweet flesh");
        System.out.println("\n" + name + " types and info: ");
        typeInfo.forEach((key, value) -> {
            System.out.print(key + ":" + value + "\n");
        });
        }

    @Override
    public void benefits() {
        System.out.println(name + " benefits are:");
        System.out.println( "Benefit health and help neutralize free radicals..");
    }

    @Override
    public void nutrition() {
        HashMap<String, Integer> nutrientAmount = new HashMap<String, Integer>();
        nutrientAmount.put("Energy", (int) 94.6);
        nutrientAmount.put("Fiber", (int) 4.4);
        nutrientAmount.put("Calcium", (int) 10.9);
        nutrientAmount.put("Magnesium", (int) 9.1);
        nutrientAmount.put("Vitamin C", (int) 8.37);
        System.out.println("\nNutrition info:");
        nutrientAmount.forEach((key, value) -> {
            System.out.print(key + ":" + value + "\n");
        });   
    }
}
