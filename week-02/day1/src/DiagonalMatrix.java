public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length ; i++) {
            System.out.println("");
            for (int j = 0; j < matrix.length ; j++) {
                if (i == j){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }

        }

    }
}