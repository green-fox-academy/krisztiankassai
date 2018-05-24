public class Counter {
    public static void main(String[] args) {
        int counter = counterFunction(10);
        System.out.println(counter);
    }
    public static int counterFunction(int n){
        if (n == 1){
            return 1;
        }else{
            System.out.println(n);
            return  counterFunction(n-1);
        }
    }
}
