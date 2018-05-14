public class PrintParams {
    public static void main(String[] args) {
        String first = "First";
        String second = "Second";
        printparam(first, second);
    }
    public static void printparam(String... text){
        for (int i = 0; i < text.length ; i++) {
            System.out.println(text[i]);
        }
    }
}
