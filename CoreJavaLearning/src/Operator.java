public class Operator {
    public static void main(String[] args) {
        int a=10;
        a++;
        System.out.println(a);
        int b=5;
        b--;
        System.out.println(b);
        if(a<=10) {
            System.out.println("double digit");
        }
        else {
            System.out.println("single digit");
        }
        boolean isMobile=true;
        if (isMobile) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        boolean isSingleDigit= (a<10)? true : false;
        System.out.println(isSingleDigit);
    }
}
