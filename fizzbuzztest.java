public class fizzbuzztest 
{
    public static void main(String []args)
    {
        int fizznum = 1;
        System.out.println();
        fizzer(fizznum);
        System.out.println("Program complete.");

    }  

    private static int fizzer(int i)
    {
        int num = i;
        boolean buzzed = false;
        if((num % 3) == 0)
        {
            System.out.println("Fizz");
            if((num % 5) == 0)
            {
                buzzed = true;
                System.out.println("Buzz");
            }
        }

        if(!buzzed && ((num % 5) == 0))
        {
            System.out.println("Buzz");
        }

        if(((num % 3) != 0) && ((num % 5) != 0))
        {
            System.out.println(num);
        }

        if (num>=100) 
        {

            return 0;
        }
        else
        {
            num++;
            return fizzer(num);
        }
    }

}
