public class Printf 
{
    public static void main(String[] args)
    {
        // %[special-characters] [.precision] [flags] [width] \n

        // [special-characters]
        // string = %s
        // char = %c
        // int = %d
        // double = %f
        // boolean = %b

        String name = "Yesh";
        char firstLetter = 'Y';
        double height = 173.5;
        int age = 20;
        boolean isEmployed = true;

        System.out.printf("The name is: %s\n", name);
        System.out.printf("the first letter of my name is: %c\n", firstLetter);
        System.out.printf("The age is %d and the height is %f\n", age, height);
        System.out.printf("Employed: %b\n", isEmployed);

        // [.precision]
        // %.1f = no of digit after a decimal point also rounds the value

        double price1 = 9.99;
        double price2 = 10000.15;
        double price3 = -54.01;

        System.out.printf("The price1 is %.1f\n", price1);

        // [flags]
        // + - add symbol infront of the number
        // ( - removes the negative symbol and add paranthesis for negative numbers
        // , - comma grouping separators
        // _(space) - adds space to positive numbers, minus if negative
        
        System.out.printf("The price1 is: %+f\n", price1);
        System.out.printf("The price2 is: %,f\n", price2);
        System.out.printf("The price 3 is: %(f\n", price3);
        System.out.printf("% f\n", price1);
        System.out.printf("% f\n", price2);
        System.out.printf("% f\n", price3);

        // [width]
        // 0 - zero padding
        // number - right justified padding
        // negative number - left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // zero padding
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        
        // right padding
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
        
        // left padding
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
        


    }
}
