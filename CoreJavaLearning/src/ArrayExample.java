public class ArrayExample {
    public static void main(String[] args) {
        int[] num = new int[10];
        num[3] = 30;
        System.out.println("Index No.3 of num = "+num[3]);
        int[] num2 = {9,8,7,6,5,4,3,2,1,0};
        System.out.println("Index No.3 of num2 = "+num2[6]);
        int len = num2.length;
        System.out.println("Length of num2 = "+len);
    }
}
