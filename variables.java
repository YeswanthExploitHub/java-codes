public class variables 
{
    public static void main(String[] args) 
    {
        
        int age = 30;
        int year = 2025;
        double price = 19.99;
        char grade = 'A';
        boolean forSale = true;
        boolean forShow=true;
        String car = "Mustang";
        String color = "Red";

        System.out.println(age);
        System.out.println(year);
        System.out.println(grade);

        if(forSale)
        {
            System.out.println("The " + car + " is for Sale & the price and the color are: " + price + " " + color);
        }
        else
        {
            System.out.println("The " + car + " is Not for sale");
        }
        
        if(forShow)
        {
            System.out.println("This is a " + color + year + car + " and it is for Show not for sale");
        }

    }
}
