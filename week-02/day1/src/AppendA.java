public class AppendA {
    public static void main(String[] args) {
        String am = "kuty";

        System.out.println(appendA(am));
    }
    public static String appendA(String text){
        text += "a";
        return text;
    }
}
