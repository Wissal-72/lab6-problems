package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
        customers = new ArrayList();
    }


    public void addCustomer(Customer customer){
       for(Customer c : customers)
           if(c.getName().equals(customer.getName())) return;

       customers.add(customer);
    }

    public ArrayList<Customer> getCustomers(){ return customers;}
    public void addTransaction(String name , Double amount){
        for(Customer c : customers)
            if(c.getName().equals(name)) c.addTransaction(amount);
    }
}
