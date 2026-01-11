import java.util.Random;

public class RandomNumbers 
{
    public static void main(String[] args)
    {
        Random random = new Random();
        
        double number;
        boolean isHeads;

        number = random.nextDouble(1, 7);

        System.out.println(number);
        
        isHeads = random.nextBoolean();

        if(isHeads)
        {
            System.out.println("Heads");
        }
        else
        {
            System.out.println("Tails");
        }
    }
}
