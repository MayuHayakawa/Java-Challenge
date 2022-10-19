public class Fiction extends Book {
    
    public Fiction(String title) {
        // this.title = title;
        super(title);
    }

    @Override
    public double setPrice(double price) {
        return 24.99;
    }
    
    // @Override
    // public double getPrice() {
    //     setPrice(24.99);
    //     return price;
    // }

    // @Override
    // public String getTitle() {
    //     return title;
    // }

}
