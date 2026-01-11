import java.util.Scanner;

public class LogicalOperator 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String username;

        for(int i =0; i < 6; i++)
        {

        System.out.print("Enter the username: ");
        username = scanner.nextLine();

        if(username.length() > 4 && username.length() < 32)
        {
            System.out.println("Hello "+ username);
        }
        else if(username.contains(" ") || username.contains("_"))
        {
            System.out.println("its a good practice to maintain User Names without spaces "+ username);
        }
        else
        {
            System.out.println("invalid username");
        }

    }

    scanner.close();
    
    }
}
