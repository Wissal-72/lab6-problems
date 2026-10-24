package problem3;

public class Document {

    protected static int numRec =0 ;
    protected String title ;
    private Library lib;

    public Document(){}

    public Document( String title){
        this.title = title;
        numRec++;
    }

    public void setLibrary(Library lib){
        this.lib = lib;
    }


    @Override
    public String toString(){

        return String.format("***************************"+
                "\nType : Document"+
                "\nTitle : %s"+
                "\nRecord number : %d "+
                "\n***************************",
                title, numRec
        );
    }

}
