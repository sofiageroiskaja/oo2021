public class Averageofarray {
        public static void main(String[] args) {   
         
               int[] numbers = new int[]{1, 2, 3, 4, 15, 78, 45, 17};
 
               int sum = 0;
               for(int i=0; i < numbers.length ; i++)
               sum = sum + numbers[i];

                double average = sum / numbers.length;
                System.out.println("Keskmine: " + average); 
           }
        }