package problem3;

public class Novel extends Book {
    public double price ;

    public Novel(String title , String author , int numPages , double price){
        super(title, author, numPages);
        this.price = price;
    }

    @Override
    public String toString(){

        return String.format("***************************"+
                        "\nType : Novel"+
                        "\nTitle : %s"+
                        "\nRecord number : %d "+
                        "\nAuthor : %s"+
                        "\n***************************",
                title, numRec, author
        );
    }

}
