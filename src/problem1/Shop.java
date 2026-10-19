package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
// *** create a new item and add it to the cart
            cart.add(new Item(itemName, itemPrice, quantity));
            // *** print the contents of the cart object using println
            System.out.println("Default Display : \n"+ cart);
            System.out.println("======================================");
            System.out.println("Formated Display :\n");
            float total = 0 ;
            for(Item item : cart){
                System.out.printf("Item Name : %s"
                                  +"\nPrice : %.2f"
                                  +"\nQuantity : %d"
                                  +"\n**************************\n",
                                  item.name(), item.price(), item.quantity()
                );
                total+= item.quantity()* item.price();
            }
            System.out.printf("TOTAL : %.2f\n\n",total);
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
