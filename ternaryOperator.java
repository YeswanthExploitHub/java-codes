import java.util.Scanner;

public class ternaryOperator 
{
    public static void main(String[] args)
    {
        int age;

        // String teenOrAdult = (age > 19) ? "Adult" : "Teenager";

        // System.out.println(teenOrAdult);

        //user input

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Age: ");

        age = scanner.nextInt();

        String teenOrAdult = (age > 19) ? "Adult" : "Teenager";

        System.out.println(teenOrAdult);

        scanner.close();

    }
}
