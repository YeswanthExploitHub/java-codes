public class StringMethods {
    public static void main(String[] args)
    {
        String name = "Yeshwanth";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(0);
        System.out.println(letter);

        int index = name.indexOf("e");
        System.out.println(index);

        int lastIndex = name.lastIndexOf("h");
        System.out.println(lastIndex);

        String name1 = name.toUpperCase();
        System.out.println(name1);

        String name2 = name.toLowerCase();
        System.out.println(name2);

        String namee = "    yesh    ";
        String name3 = namee.trim();
        System.out.println(name3);

        String name4 = name.replace("e", "a");
        System.out.println(name4);

        
        if (name.isEmpty())
        {
            System.out.println("The name can't be empty");
        }
        else{
            System.out.println("hello " + name);
        }

        if(name.contains("e"))
        {
            System.out.println("u r name has char e");
        }
        else
        {
            System.out.println("u r name doesn't have char 'e' ");
        }

        if(name.equals("passsword"))
        {
            System.out.println("u r name can't be password");
        }
        else
        {
            System.out.println("hello " + name);
        }

        if(name.equalsIgnoreCase("yeshwanth"))
        {
            System.out.println("hello " + name);
        }
        else
        {
            System.out.println("who r you");
        }

        if(name.equalsIgnoreCase("yeshwanth"))
        {
            System.out.printf("i am not %s im 'YESWANTH'", name);
        }
        else
        {
            System.out.println("hello " + name);
        }
    }
}
