public class Methods {
    public static void main(String[] args)
    {
        addition();
        subtraction(20,10);
        int val = multiplication();
        System.out.println("Mul: "+val);
    }

    private static void addition(){
        int a=10,b=10,c;
        c=a+b;
        System.out.println("Add: " + c);
    }

    private static void subtraction(int a,int b){
        System.out.println("Sub: " + (a-b));
    }

    private static int multiplication() {
        int a=10,b=10;
        return a*b;
    }
}
