public class ExceptionExample {
    public static void main(String args[]){

        int a = 1;
        int b = 0;

        try
        {
            int i = a/b;

        }

        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
