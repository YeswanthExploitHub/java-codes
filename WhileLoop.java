import java.util.Scanner;

public class WhileLoop 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q"))
        {
            System.out.println("Until you press Q there is no stop");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("Its over.....");

        scanner.close();
    }
}

