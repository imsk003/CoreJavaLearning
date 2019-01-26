class Outer {
    class Inner {
        void display() {
            System.out.println("In a nested class method");
        }
    }
}
class InnerClassExample {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.display();
    }
}