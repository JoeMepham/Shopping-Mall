import java.text.NumberFormat;

public class ShoppingCart
{

    private Items[] cart;
    private double totalPrice;  


  
    public void addToCart(String itemName, String price, int quantity)
    { 

        Items temp = new Items(itemName, price, quantity);
        totalPrice += (price * quantity);
  
    } 
            

  
    public String toString()
    {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String contents = "\nShopping Cart\n";
      contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
      contents += "\nTotal Price: " + fmt.format(totalPrice);
      contents += "\n";

      return contents;
    }

}  