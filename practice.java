import java.util.Random;

public class practice 
{
    public static void main(String[] args)
    {
        Random random = new Random();
        boolean isStudent;
        boolean isSenior;
        double price = 9.99;

        isStudent = random.nextBoolean();

        isSenior = random.nextBoolean();

        if(isSenior)
        {
            System.out.println("He/she is a senior");
        }else{
            System.out.println("He/she is not a senior");
        }

        if(isStudent)
        {
            System.out.println("He/she is a student");
        }else{
            System.out.println("He/she is not a student ");
        }
        
        if(isStudent)
        {
            if(isSenior)
            {
                System.out.println("u r both student and a senior so you'll get 30% discount");
                price *= 0.7;
            }
            else
            {
            System.out.println("as you r a student you'll gte 20% discount!");
            price *= 0.8;
            }
        }
        else
        {
            if(isSenior)
            {
                System.out.println("u r a senior so you'll get 10% discount!");
                price *= 0.7;
            }
            else
            {
            System.out.println("you r not a student as well as a senior so regular price!!");
            price *= 1;
            }
        }

        System.out.printf("The Price of the ticket is: %.2f ", price);
    }
}
