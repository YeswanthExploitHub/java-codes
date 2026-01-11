import java.util.Scanner;

public class Substring 
{
    public static void main(String[] args)
    {
        // to extract a portion of the string
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter you Email: ");
        email = scanner.nextLine();

        if(email.contains("@"))
        {
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);

        }
        else
        {
            System.out.print("Emails must contain @");
        }

        scanner.close();
    }
}
