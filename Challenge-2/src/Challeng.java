public class Challeng {

    public static void main(String[] args) throws Exception {

        //make array(bookList) of fiction and nonfiction classes's instance
        Book[] bookList = new Book[2];

        //make instances and store references to array
        bookList[0] = new Fiction("Harry Potter");
        bookList[1] = new NonFiction("Calculus");

        // int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        // for(int number: numbers) { //increase 1 by 1, this is same with for (int number = 0; 0 <= numbers.length; number++)
        //     System.out.println("Number is " + number);
        // }
        
        for (Book book : bookList) { //For each Loop
            System.out.println("Title of " + book.getClass().getSimpleName() + " book:");
            System.out.println(book.getTitle());
            System.out.println(book.getTitle() + " Cost-$" + book.getPrice());
        }
        
        // System.out.println("Title of fiction book:\n" + bookList[0].getTitle());
        // System.out.println("Title of non fiction book:\n" + bookList[1].getTitle());
        // for(int i = 0; i < bookList.length; i++) {
        //     System.out.println("Title-" + bookList[i].getTitle() + " Cost-$" + bookList[i].getPrice());
        // }
    }
}
