package problem3;

public class Textbook extends Book{

    public String level;

    public Textbook(String title , String author, int n, String level){
        super(title, author, n);
        this.level = level;
    }


    @Override
    public String toString(){

        return String.format("***************************"+
                        "\nType : TextBook"+
                        "\nTitle : %s"+
                        "\nRecord number : %d "+
                        "\nAuthor : %s"+
                        "\nLevel : %s"+
                        "\n***************************",
                title, numRec,author, level
        );
    }
}
