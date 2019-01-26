interface InterfaceDemo
{
    int a = 10;

    void display();
}

class InterfaceExample implements InterfaceDemo
{
    public void display()
    {
        System.out.println("It's interface example");
    }

    public static void main (String[] args)
    {
        InterfaceExample ie = new InterfaceExample();
        ie.display();
        System.out.println(a);
    }
}
