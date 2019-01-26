public class MethodOverloading {
    public static void main(String[] args) {
        addition();
        addition(10,10);
        addition(90.19,78);
    }
    private static void addition() {
        int a=10,b=20;
        System.out.println("addition(): "+(a+b));
    }
    private static void addition(int a,int b) {
        System.out.println("addition(10,10): "+(a+b));
    }
    private static void addition(double a,int b) {
        System.out.println("addition(90.19,78): "+(a+b));
    }
}
