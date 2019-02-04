
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingMallMain
{
    public static void main (String[] args)
    {
      ArrayList<Items> cart = new ArrayList<Items>();

      String store;
      String itemName;
      int quantity;

      Scanner scan = new Scanner(System.in);

      String keepShopping = "y";
      ShoppingCart cart1 = new ShoppingCart();
      do
          {
            System.out.print ("What store would you like to visit?");
            store = scan.next();

            System.out.print ("What item would you like to purchase?");
            itemName = scan.next();

            System.out.print ("What quantity of the item woudl you like?");
            quantity = scan.nextInt();

          
            cart1.addToCart(itemName, quantity);



       
            System.out.println(cart1);

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
          }
      while (keepShopping.equals("y"));

    }
}