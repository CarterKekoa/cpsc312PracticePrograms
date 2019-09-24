public class Book {
    //OOP
    //class: a collection of state and behavior that completely describes something
    //state: fields (AKA attributes)
    //behavior: methods

    //object: an instance of a class
    //class as a blueprint and an object as a realization of that blueprint

    //Book describes a book in real life (simplified)

    //fields

    private String title;
    private String author;
    private int numPages;

    //constructors
    //for free, we get a default value constructor (DVC)
    //we can start making books!

    //once we define the constructor we lose our free DVC
    //explicit value constructor (EVC)
    public Book(String title, String paramAuthor, int paramNumPages){
        //title, author, and numPages are fields of the new object created
        //this object is referenced using this.
        this.title = title; //shadowing.. title the parameter shadoes title the field
        author = paramAuthor;
        numPages = paramNumPages;
    }

    public Book(){
        title = "BLANK TITLE";
        author = "BLANK AUTHOR";
        numPages = -1;
    }

    //toString()
    //every class direclty or inderectly inherits from object
    // we can override toString and any other method inherited from object

    //ANNOTATIONS
    //metadata about code used by compiler in IDEA
    //@Override @SupressWarnings @Depricated
    @Override
    public String toString(){
        //returns a string representation of the invoking object (this.)
        String bookStr = "";
        bookStr += title + " by " + author;
        return bookStr;
    }

    //recall access modifiers
    //1. public (accesable anywhere in this package)
    //2. package-private (accesable anywhere in this package)
    //3. protected (package-private plus accessable from any subclass even outside package
    //4. private (only accessible in this class)

    //getters and setters
    //expose functionality as needed
    //getter (AKA accessor)
    public String getTitle(){
        return title;
    }

    //task1: add a getter for author and numPages
    public String getAuthor(){
        return author;
    }

    public int getNumPages(){
        return numPages;
    }

    //setter (AKA mutator)
    public void setTitle(String newTitle) {
        //this refers to the invoking object ex: BookTester main() bookOne.setTitle("hello");
        //then this refers to the same object that bookOne refers to
        //______.______()
        title = newTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    //task 2: still in this project, create a point class and pointTester class
    //Point represents a point in 2D space (x, y)
    //toString() (0, 0) for origin
    //PointTester excersizes some constructors and methods of Point
}
