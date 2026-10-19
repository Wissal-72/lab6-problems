package problem2;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Customer {
    private String name ;
    private ArrayList<Double> transactions;

    public Customer(String name){
        this.name = name;
        transactions = new ArrayList();
    }

    public void printSummary(){
        System.out.printf("\n==Customer %s's Summary=="+
                "\nTransactions : \n", name);

        for(Double t : transactions){
            if(t>0)
            System.out.printf("\n  +%.2f $", t.doubleValue());
            else System.out.printf("\n  %.2f $", t.doubleValue());
        }
    }

    public void addTransaction(Double amount){
        transactions.add(amount);
    }

    public String getName(){ return name; }
}
