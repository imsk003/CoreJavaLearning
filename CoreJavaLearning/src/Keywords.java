public class Keywords {
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);

            if(i == 6)
            {
                break;
            }
        }

        try
        {
            int j = Integer.parseInt("hi");
        }
        catch(NumberFormatException exp)
        {
            System.out.println(exp);
        }
        finally
        {
            System.out.println("This will execute at the end");
        }
    }
}
