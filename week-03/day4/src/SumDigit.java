public class SumDigit {
    public static void main(String[] args) {
        int digits = 1234;
        int sum = digitAdder(digits);
        System.out.println(sum);
    }
    public static int digitAdder(int digits){
        if (digits < 10) return digits;
        return (digits % 10) + digitAdder(digits / 10);
    }
}
