public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        a = a+b; // a = 649
        b = a-b; // b = 123
        a = a-b; // a = 526
        System.out.println(a);
        System.out.println(b);
    }
}
