abstract public class Book {

    // //use protected access modify to use these field in other classes.
    // protected String title;
    // protected double price;

    private String title;
    private double price;

    public Book(String title) {
        this.title = title;
        this.price = setPrice(price);
    }
    
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    //abstract method
    public abstract double setPrice(double price);

}