public class Factorio {
    public static void main(String[] args) {
        int number = 31;
        System.out.println(factorio(number));
    }
    public static int factorio(int a){
        int factor = 1;
        for (int i = a; i > 0 ; i--) {
            factor *= i;
        }
        return factor;
    }
}
