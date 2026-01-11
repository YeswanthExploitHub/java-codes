import java.util.Scanner;

public class EnhancedSwitches 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the Week: ");
        String day = scanner.nextLine().toLowerCase();
        
        // before going to 'switch' operation every element is changed to lowercase
        // e.g. MoNdAy will be changed to monday.
        // to avoid case senstivity.

        switch (day) 
        {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> 
                System.out.println("This is a weekday");

            case "saturday", "sunday" -> 
                System.out.println("It's a weekend");

            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }
}
