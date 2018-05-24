public class Fibonacci {
    public static void main(String[] args) {
        int fibonacciNumb = 11;
        int result  =  fibonacci(fibonacciNumb);
        System.out.println(result);
    }
    public static int fibonacci(int fibonacciNumb){
        if(fibonacciNumb == 0){
            return 0;
        }else if(fibonacciNumb == 1) {
            return 1;
        }else {
            return fibonacci(fibonacciNumb -1) + fibonacci(fibonacciNumb -2);
        }
    }
}
