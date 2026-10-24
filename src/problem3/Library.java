package problem3;

import java.util.ArrayList;

public class Library {

    private  int capacity;
    private int numDocs= 0;
    private ArrayList<Document> documents = new ArrayList<>();

    public Library(int capacity){
        this.capacity = capacity;
    }

    public void displayDocuments(){
        for(Document doc : documents)
            System.out.println(doc);
    }

    public boolean add(Document doc){
        for(Document document : documents)
            if(doc.numRec== document.numRec)
                return true;

        if( numDocs >= capacity) return false;

        else documents.add(doc);
        numDocs++;
        doc.setLibrary(this);
        return true;


    }

    public boolean delete(Document doc){
        for(Document document : documents) {
            if (doc.numRec== document.numRec) {
                documents.remove(doc);
                doc.setLibrary(null);
                return true;
            }
        }
        return false;
    }

    public Document document(int numRec){
        for(Document doc : documents)
            if (doc.numRec== numRec)
                return doc;

        return null;
    }

    public void displayAuthors(){
        for(Document doc : documents)
            if (doc instanceof HasAuthor)
                System.out.println("- "+ doc.title+ " by " + ((HasAuthor) doc).getAuthor());
    }

    @Override
    public String toString(){

        return "===LIBRARY===\nCapacity : " + capacity+ "\nCurrently holds : "+ numDocs+" documents" ;
    }
}
