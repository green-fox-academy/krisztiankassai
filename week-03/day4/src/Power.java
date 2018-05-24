public class Power {
    public static void main(String[] args) {
        int n = 2;
        int base = 3;
        int result = power(n, base);
        System.out.println(result);
    }
    public static int power(int n, int base){
        if(base == 0){
            return 1;
        }else {
            return n * power(base,n-1);
        }
    }
}
