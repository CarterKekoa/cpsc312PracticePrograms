public class PublicationTester {
    public static void main(String[] args) {
        // task: define a Publication class
        // Publication represents a general publication
        // Publication has a title, publisher, number of pages, price
        // toString(): comma separated list of fields values
        // no getters or setters
        // DVC and EVC

        // test your Publication class
//        Publication p1 = new Publication();
//        System.out.println(p1);

        Book b1 = new Book();
        System.out.println(b1);
        Book b2 = new Book("some author");
        System.out.println(b2);
        Book b3 = new Book("title", "publisher", 4, 7.99, "author");
        System.out.println(b3);
        System.out.println(b3.generateCopyright());

        // task: create a Magazine subclass of Publication
        // Magazine has a publication frequency (e.g. weekly or monthly etc.)

        // make some Magazine objects
        Magazine m1 = new Magazine();
        System.out.println(m1);
        Magazine m2 = new Magazine("monthly");
        System.out.println(m2);

        // lets declare an array of Publication references
        Publication p1 = b1;
        p1 = m1;

        Publication[] pubs = new Publication[4];
        pubs[0] = b1;
        pubs[1] = p1; // m1
        pubs[2] = m1;
        pubs[3] = m2;

        System.out.println();
        // polymorphism: same code, different behavior
        for (Publication pub : pubs) {
            System.out.println(pub); // dynamic binding
            // at runtime, the type of the object that pub refers to is determined
            System.out.println(pub.generateCopyright());
            System.out.println(pub.getClass());
            System.out.println("**");

        }

        // rest of java crash course
        // interfaces: also used for subtyping (note: not subclassing)
        // another example of polymorphism
        // packages
        // exceptions
    }
}