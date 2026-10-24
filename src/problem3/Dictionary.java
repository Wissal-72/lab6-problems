package problem3;

public class Dictionary extends Document {

     private String language;

     public Dictionary(String title , String language){
          super(title);
          this.language = language;
     }

     @Override
     public String toString(){

          return String.format("***************************"+
                          "\nType : Dictionary"+
                          "\nTitle : %s"+
                          "\nRecord number : %d "+
                          "\nLanguage : %s"+
                          "\n***************************",
                  title, numRec, language
          );
     }
}
