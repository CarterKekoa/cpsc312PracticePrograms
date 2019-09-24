public class Book extends Publication {
    // not all Publications have authors
    // but a Book does
    protected String author;

    // constructors
    public Book() {
        // implicitly the super class constructor is being called
        // can explicitly call super class constructor
        super(); // DVC of Publication
        // initialize book specific stuff
        this.author = "BlANK AUTHOR";
    }

    public Book(String author) {
        super(); // optional
        this.author = author;
    }

    public Book(String title, String publisher, int numPages, double price, String author) {
        super(title, publisher, numPages, price);
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + author; // super is not a reference, it is a keyword
    }

    @Override
    public String generateCopyright() {
        return "TODO: insert Book copyright here";
    }
}