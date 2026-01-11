public class Nestedif 
{
    public static void main(String[] args)
    {
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

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

        System.out.println("The Price of the ticket is: " + price);
    }
}
