package problem2;

public class Main {

    public static  void main(String[] args){
        Customer c1 = new Customer("Wissal");
        Customer c2 = new Customer("Anass");

        Bank bank = new Bank("Bank");

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        System.out.println("Customers list : ");
        System.out.println(bank.getCustomers());

        bank.addTransaction("Anass", Double.valueOf(2000));
        bank.addTransaction("Anass" , Double.valueOf(-150));
        bank.addTransaction("Wissal", Double.valueOf(1500));
        bank.addTransaction("Wissal" , Double.valueOf(100));



        System.out.println("Their summaries : ");

        for(Customer c : bank.getCustomers())
            c.printSummary();
    }
}
