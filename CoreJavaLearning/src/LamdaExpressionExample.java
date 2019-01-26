interface FunctionalInterface {

    int increment(int a);
}
public class LamdaExpressionExample {

    public static void main(String[] args) {

        FunctionalInterface f = (num) -> num+3;
        System.out.println(f.increment(7));
    }
}
