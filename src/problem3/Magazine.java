package problem3;

public class Magazine extends Document {
    private String month;
    private int year;

    public Magazine(String title , String month , int year){
        super(title);
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString(){

        return String.format("***************************"+
                        "\nType : Magazine"+
                        "\nTitle : %s"+
                        "\nRecord number : %d "+
                        "\n %s of %d"+
                        "\n***************************",
                title, numRec, month , year
        );
    }
}
