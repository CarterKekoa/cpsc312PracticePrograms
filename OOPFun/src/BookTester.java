public class BookTester {
    public static void main(String[] args) {
        //Booktester is a tester AKA driver program
        //exersize methods and constructers in our book class
        Book bookOne = new Book("red fish blue fish", "Dr. Seuss", 60);
        System.out.println(bookOne); //will print hashcode that comes from toString
        //whenever a string representation is needed

        Book bookTwo = new Book();
        System.out.println(bookTwo);
        System.out.println(bookTwo.getTitle());

        bookOne.setTitle("one fish two fish red fish blue fish");
        System.out.println(bookOne.getTitle());
    }
}
