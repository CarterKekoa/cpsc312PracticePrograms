public abstract class Publication implements Comparable<Publication>{
    // inheritance: a relationship between 2 classes where one class
    // includes ("inherits") the state AND behavior of the other class
    // Publication is too general to instantiate
    // abstract means cannot be instantiated
    // means we need to subclass Publication
    // and instantiate subclass objects

    // fields
    protected String title;
    protected String publisher;
    protected int numPages;
    protected double price;

    // DVC
    public Publication() {
        title = "BLANK TITLE";
        publisher = "BLANK PUBLISHER";
        numPages = 0;
        price = 0.0;
    }

    // EVC
    public Publication(String title, String publisher, int numPages, double price) {
        this.title = title;
        this.publisher = publisher;
        this.numPages = numPages;
        this.price = price;
    }

    // toString()
    @Override
    public String toString() {
        return title + ", " + publisher + ", " + numPages + ", " + price;
    }

    @Override
    public int compareTo(Publication o) {
        //compare first by title then by publisher
        if(this.title.compareTo(o.title) != 0){
            //let the string compareTo do the heavy lifting for me
            return this.title.compareTo(o.title);
        }
        //titles are the same, compareTo() return 0
        return this.publisher.compareTo(o.publisher);
    }

    // abstract method: a method without a body that has to be overridden
    // in a subclass
    // good preview of interfaces...
    // lets say every subclass of publication has to have a generateCopyright() method
    public abstract String generateCopyright();
}