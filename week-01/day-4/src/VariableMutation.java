public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        // make it bigger by 10


        System.out.println(a);


        int b = 100;
        b -= 7;
        // make it smaller by 7


        System.out.println(b);


        int c = 44;
        c *= 2;
        // please double c's value


        System.out.println(c);


        int d = 125;
        d /= 5;
        // please divide by 5 d's value


        System.out.println(d);


        int e = 8;
        e = e * e * e;
        // please cube of e's value


        System.out.println(e);


        int f1 = 123;
        int f2 = 345;
        boolean answer = f1 > f2;

        System.out.println("Is f1 bigger than f2? " + answer);


        // tell if f1 is bigger than f2 (print as a boolean)


        int g1 = 350;
        int g2 = 200;
        boolean answer2 = (g2 * 2) > g1;

        System.out.println("Is the double of g2 bigger than g1? " + answer2);
        // tell if the double of g2 is bigger than g1 (print as a boolean)


        int h = 135798745;
        int divisor = 11;
        boolean answer3 = (h % divisor) == 0;

        System.out.println("Is 11 is a divisor for 135798745? " + answer3);

        // tell if it has 11 as a divisor (print as a boolean)


        int i1 = 10;
        int i2 = 3;
        boolean answer4 = (i1 > (i2 *= 2) && (i1 < (i2 * i2 * i2)));

        System.out.println("Is 10 higher than 3 squared and smaller than 3 cubed? " + answer4);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)


        int j = 1521;
        int divisor3 = 3;
        int divisor5 = 5;
        boolean answer5 = (j % divisor3 == 0) || (j % divisor5 == 0);
        System.out.println("Is 1521 dividable by 3 or 5? " + answer5);
        // tell if j is dividable by 3 or 5 (print as a boolean)


        String k = "Apple";
        k = k + k + k + k;
        //fill the k variable with its cotnent 4 times


        System.out.println(k);
    }
}
