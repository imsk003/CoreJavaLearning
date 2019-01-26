public class ParsingFromString {
    public static void main(String[] args) {

        String num="3000";
        System.out.println("String: "+num);

        int number=Integer.parseInt(num);
        System.out.println("Integer: "+number);

        num +=1;
        number +=1;

        System.out.println("String: "+num);
        System.out.println("Integer: "+number);
    }
}
