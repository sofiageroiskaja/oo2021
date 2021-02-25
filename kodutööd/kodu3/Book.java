import java.util.ArrayList;

public class Book {

    private String title;
    private double price;
    private String author;

    private ArrayList<String> titles;
    
    public void addTitle(String title){
        this.titles.add(title);
    }
    public ArrayList<String> getList() {
        return titles;
    }
    
    public Book(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

}