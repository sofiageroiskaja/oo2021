import java.util.HashMap;

public class Pear implements Fruit{
    private String name;
    
    public Pear(String name) {
        this.name = name;
    }

    @Override
    public String contains() {
        return "Rich in folate, vitamin C, copper, and potassium. A good source of polyphenol antioxidants";
    }

    @Override
    public void typeInfo() {
        HashMap<String, String> typeInfo = new HashMap<String, String>();
        typeInfo.put("Forelle Pear", " small size, ovalish shape, smooth skin, sweet and delicate");
        typeInfo.put("Bosc Pear", "rough texture, sweet, crisp, and firm to the touch");
        typeInfo.put("Bartlett Pear", "a delicate thin skin, a sweet taste, and a bite that's juicy and soft");
        System.out.println("\n" + name + " types and info: ");
        typeInfo.forEach((key, value) -> {
            System.out.print(key + ":" + value + "\n");
        });
    }

    @Override
    public void benefits() {
        System.out.println(name + "benefits are:");
        System.out.println("Highly nutritious. May promote gut health. Contain beneficial plant compounds.");
        System.out.println("THave anti-inflammatory properties. May offer anticancer effects.");
    }

    @Override
    public void nutrition() {
        HashMap<String, Integer> nutrientAmount = new HashMap<String, Integer>();
        nutrientAmount.put("Calories", (int) 101);
        nutrientAmount.put("Protein g", (int) 1);
        nutrientAmount.put("Carbs g", (int) 27);
        nutrientAmount.put("Fiber g", (int) 6);
        nutrientAmount.put("Vitamin C % of the DV", (int) 12);
        System.out.println("\nNutrition: ");    
        nutrientAmount.forEach((key, value) -> {
            System.out.print(key + ":" + value + "\n");
        });
    }
}

