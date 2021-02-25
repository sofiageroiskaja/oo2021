public class Osa2 {
    
    public static void main(String[] args)
    {
        StringBuffer minustring = new StringBuffer("SofIa GeroISkaja");

        convert(minustring);
        System.out.println(minustring);
    }

    static void convert(StringBuffer minustring)
    {
        int stringipikkus = minustring.length();
 
        for (int i = 0; i < stringipikkus; i++) {
            Character mingi = minustring.charAt(i);
            if (Character.isLowerCase(mingi)){
            minustring.replace(i, i + 1, Character.toUpperCase(mingi) + "");
        }
            else{
            minustring.replace(i, i + 1, Character.toLowerCase(mingi) + "");
        }
        }
    }
}