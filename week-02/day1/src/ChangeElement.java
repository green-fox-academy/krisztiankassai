public class ChangeElement {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 8, 5, 6};

        s[3] = 4;

        System.out.println(s[3]);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i] + " ");
        }
    }
}
