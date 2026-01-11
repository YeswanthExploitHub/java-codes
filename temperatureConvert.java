import java.util.Scanner;

public class temperatureConvert
{
    public static void main(String[] args)
    {
        //c = temp - 32 * 5/9
        //f = temp *5/9 + 32

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Farenheit: ");
        unit = scanner.next();

        newTemp = (unit.equalsIgnoreCase("c")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        // if the enter unit is C or F giving output accordingly

        if(unit.equalsIgnoreCase("c"))
        {
            System.out.printf("The converted Temperature is %.2f F", newTemp);
        }
        else if(unit.equalsIgnoreCase("f"))
        {
            System.out.printf("The converted Temperature is %.2f C", newTemp);
        }
        else
        {
            System.out.println("The Enters element is not a C or F");
        }

        scanner.close();
        
    }
}