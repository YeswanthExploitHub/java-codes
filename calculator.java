import java.util.Scanner;

public class calculator 
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

    double num1;
    double num2;
    char operator;
    double result = 0;
    boolean validOperation = true;

    for(int i =0 ; i < 2; i++)
    {
    System.out.print("Enter the num1: ");
    num1 = scanner.nextInt();

    System.out.print("Enter the num2: ");
    num2 = scanner.nextInt();

    System.out.print("Enter the operator(+, -, *, /, ^): ");
    operator = scanner.next().charAt(0); // when user types something just give the first character

        switch (operator) 
        {
            case '+' -> result = num1+num2;

            case '-' -> result = num1-num2;

            case '*' -> result = num1*num2;

            case '/' -> 
            {
                if(num2 ==0 )
                {
                    System.out.println("cannot divide by '0' ");
                    validOperation = false;
                }
                else
                {
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);

            default -> System.out.print("Invalid operator: ");
        }

        if(validOperation)
        {
            System.out.println(result);
        }
    
    }
    scanner.close();
    }
}

