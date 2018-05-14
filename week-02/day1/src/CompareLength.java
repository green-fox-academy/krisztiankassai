public class CompareLength {
    public static void main(String[] args) {

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5,};

        if (counter(p1) > counter(p2)){
            System.out.println("P1 has more elements");
        }else {
            System.out.println("P2 has more elements or they are equal");
        }
        System.out.println(p1.length);
    }
    public static int counter(int[] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count += i;
        }
        return  count;
    }
}


