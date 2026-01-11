import java.util.Scanner;

public class WeightConvertor 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double weight;
        double newWeight;

        System.out.println("weight converting program");

        System.out.println("Choose option 1 to convert lbs to kgs");
        System.out.println("Choose option 2 to convert kgs to lbs");
        System.out.print("choose the option: ");
        choice = scanner.nextInt();

        if(choice == 1)
        {
            System.out.print("Enter the lb to convert: ");
            weight = scanner.nextInt();
            newWeight = weight * 0.453592;
            System.out.printf("the converted kg is: %.2f", newWeight);
        }
        else if(choice == 1)
        {
            System.out.print("Eneter the kg to convert: ");
            weight = scanner.nextInt();
            newWeight = weight * 2.20462;
            System.out.printf("the converted lb is: %.2f", newWeight);
        }
        else
        {
            System.out.println("Invalid Option Niggaaaa");
        }
        
        scanner.close();
    }
}
