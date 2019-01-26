import java.util.Scanner;

public class IfElse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a programming language: ");
        String input = sc.next();
        if(input.equalsIgnoreCase("Java"))
        {
            System.out.println("It's JAVA");
        }
        else
        {
            System.out.println("It's not JAVA");
        }
    }
}
