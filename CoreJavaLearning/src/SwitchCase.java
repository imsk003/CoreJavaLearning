public class SwitchCase {
    public static void main(String[] args) {
        int a = 27, b = 31, c = 10;
        int status;
        if (a > b && a > c) {
            status = 1;
        } else if (b > c) {
            status = 2;
        } else {
            status = 3;
        }
        switch (status) {
            case 1:
                System.out.println("a is the greatest");
                break;
            case 2:
                System.out.println("b is the greatest");
                break;
            case 3:
                System.out.println("c is the greatest");
                break;
            default:
                System.out.println("Cannot be determined");
        }
    }
}
