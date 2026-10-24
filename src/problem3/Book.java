package problem3;

public class Book extends Document implements HasAuthor {
    protected String author;
    protected int numPages ;

    public Book(){}

    public Book(String title , String author, int numPages){
         super(title);
         this.author = author;
         this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString(){

        return String.format("***************************"+
                        "\nType : Book"+
                        "\nTitle : %s"+
                        "\nRecord number : %d "+
                        "\nAuthor : %s"+
                        "\n***************************",
                title, numRec, author
        );
    }

}
