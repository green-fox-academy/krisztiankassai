public class Refactorio {
    public static void main(String[] args) {
        int number = 4;
        int result = factorio(number);
        System.out.println(result);
    }
    public static int factorio(int number){
        if(number ==0){
            return 1;
        }else {
            return number * factorio(number -1);
        }
    }
}
