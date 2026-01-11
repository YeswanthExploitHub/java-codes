import java.util.Scanner;

public class IfElse 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int age;
        boolean isStudent;
        boolean isEmployee = true;

        System.out.print("Enter your Name: ");
        name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student: ");
        isStudent = scanner.nextBoolean();

        // checking whether credentials are uploaded
        if(name.isEmpty())
        {
            System.out.println("Your name was not entered!!");
        } 
        else
        {
            System.out.println("Hello " + name);
        }

        // output according to age
        if(age >= 60)
        {
            System.out.println("you are a senior citizen!");
        }
        else if(age >= 40)
        {
            System.out.println("you are a middle aged person");
        }
        else if(age >= 19)
        {
            System.out.println("you are an adult!");
        }
        else
        {
            System.out.println("you are a teenager");
        }

        // check whether the person is Student/Employee
        if(isStudent)
        {
            System.out.println(name + " is a student.");
        }
        else
        {
            if(isEmployee)
            {
                System.out.println(name + " is an employee!");
            }
            else
            {
                System.out.println("you are not a student or an employee then what r u!!");
            }
        }

        scanner.close();
    }    
}
