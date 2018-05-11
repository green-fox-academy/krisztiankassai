public class SwapTemp {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int temp = a; // temp = 123
        a = b; // a = 526
        b = temp; // b = 123

        System.out.println(a);
        System.out.println(b);
    }
}

