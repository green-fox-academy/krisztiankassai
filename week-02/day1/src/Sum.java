public class Sum {
    public static void main(String[] args) {

        int valtozo = 8;

        System.out.println(sum(valtozo));

    }
    public static int sum(int a){
        int sum1 = 0;
        for (int i = 0; i < a; i++) {
            sum1 += i;
        }
        return sum1;
    }
}
