public class Magazine extends Publication {
    protected String publicationFrequency;

    public Magazine() {
        this.publicationFrequency = "weekly";
    }

    public Magazine(String publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    public Magazine(String title, String publisher, int numPages, double price, String publicationFrequency) {
        super(title, publisher, numPages, price);
        this.publicationFrequency = publicationFrequency;
    }

    @Override
    public String generateCopyright() {
        return "TODO: generate Magazine's copyright";
    }

    @Override
    public String toString() {
        return super.toString() + ", " + publicationFrequency;
    }
}