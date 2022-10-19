public class NonFiction extends Book {

    public NonFiction(String title) {
        // this.title = title;
        super(title);
    }

    @Override
    public double setPrice(double price) {
        return 37.99;
    }
    
    // @Override
    // public double getPrice() {
    //     setPrice(37.99);
    //     return price;
    // }

    // @Override
    // public String getTitle() {
    //     return title;
    // }

}
