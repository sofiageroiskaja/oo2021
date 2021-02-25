public class Main{

    private Book total;
    public static void main(String[] args) {
        
        Client esimene = new Client("John", "Peterson", "male", 24);
        Book bookInfo = new Book("It", 30, "Stephen King");

        Client teine = new Client("Mary", "Johnson", "female", 16);
        Book secondBook = new Book("Life", 21, "Lary Larson");

        Client kolmas = new Client("Arthur", "Lao", "male", 57);
        Book thirdBook = new Book("Logic", 34, "Master");

        System.out.println("23.02.2020 clients of the day:");
        System.out.println("Name: " + esimene.getName() + "   Age: " + esimene.getAge());
        System.out.println("Book title: " + bookInfo.getTitle() + "   Price: " + bookInfo.getPrice());
        
        secondBook.setPrice(18);
        System.out.println("Name: " + teine.getName() + "   Age: " + teine.getAge());
        System.out.println("Book title: " + secondBook.getTitle() + "   Price: " + secondBook.getPrice());

        thirdBook.setTitle("Logic of the world");
        System.out.println("Name: " + kolmas.getName() + "   Age: " + kolmas.getAge());
        System.out.println("Book title: " + thirdBook.getTitle() + "   Price: " + thirdBook.getPrice());
    }
    public Main() {
        total.addTitle("It");
        total.addTitle("Life");
        total.addTitle("Logic of the world");
      }
}