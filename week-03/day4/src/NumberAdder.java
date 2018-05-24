public class NumberAdder {
    public static void main(String[] args) {
        int n = 10;
        int sum = numberAdder(n);
        System.out.println(sum);
    }
    public static int numberAdder(int n){
        if(n == 1){
           return 1;
        }else {
            return n + numberAdder(n - 1);
        }
    }
}
