public class Bunny1 {
    public static void main(String[] args) {
        int bunny = 8;
        int ears = 2;
        int numbOfEars = earcounter(bunny,ears);
        System.out.println(numbOfEars);
    }
     public static int earcounter(int bunny, int ears){
        if (bunny == 0){
            return 0;
        }else{
            return ears + earcounter(bunny -1, ears);
        }
     }
}
