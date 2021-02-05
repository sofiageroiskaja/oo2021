public class First {
    public static void main(String[] args){
        //System.out.println(args.length);
        int[] numberArray = new int[5];
        int numbeerArray[] = new int[5];

        String stringArray[] = new String[5];
        String greetingsArray[] = new String[]{ "Hello", "world", "!"}; //algvaartustamisega

        String name = "Sofia";
        int year = 2021;
        long myLong = Long.MAX_VALUE;
        byte bait = Byte.MAX_VALUE;
        short myShort =Short.MAX_VALUE;
        double doubleNumber = 3.4;
        float floatNumber = 3.4f;
        boolean flag = true;
        char character = 'F';
//for tsukkel
        for (int i = 0; i < greetingsArray.length; i++){
            System.out.println(args[i]);
        }

//foreach tsukkel
        for (String text : greetingsArray){
            System.out.println(text);
        }

//while tsukkel
        int lenght = greetingsArray.length;
        while(lenght > 0){
            lenght --;
            System.out.println("Inside while");
        }

        if(year == 2021){
            System.out.println(year + "is equal to 2021");
        } else if(year > 2021){
            System.out.println(year + "is larger than 2021");
        } else{
            System.out.println(year + "is not equal or larger than 2021");
        }

        System.out.println("Hello world!");
        System.out.print("\n");
        String hello = "Hello world!";
    }
}