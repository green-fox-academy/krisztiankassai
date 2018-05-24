public class Bunny2 {
    public static void main(String[] args) {
        int bunny = 3;
        int result = bunnyEarCounter(bunny);
        System.out.println(result);

    }
    public static int bunnyEarCounter(int bunny){
        if (bunny == 0){
            return 0;
        }else if ((bunny % 2) == 0){
            System.out.println(2);
            return 2 + bunnyEarCounter(bunny -1);
        }else{
            System.out.println(3);
            return 3 + bunnyEarCounter(bunny -1);
        }
    }
}
