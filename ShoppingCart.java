import java.util.Scanner;

public class ShoppingCart 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total = 0;

        System.out.print("what do you like to have: ");
        item = scanner.nextLine();

        System.out.print("The price of the item is: ");
        price = scanner.nextDouble();

        System.out.print("How many do you want: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("The item you chose is " + item + " and the price is " + currency + price);
        System.out.println("The total price is: " + total);
        
        scanner.close();
    }    
}
