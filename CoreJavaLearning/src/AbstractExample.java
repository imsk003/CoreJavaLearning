abstract class AbstractDemo
{
   abstract void display();

    void display2() {
        System.out.println("Method display2() is called");
    }
}

class AbstractExample extends AbstractDemo
{
    public void display()
    {
        System.out.println("It's abstract class example");
    }

    public static void main (String[] args)
    {
        AbstractExample ae = new AbstractExample();
        ae.display();
        ae.display2();
    }
}
