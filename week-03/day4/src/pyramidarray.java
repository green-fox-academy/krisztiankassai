public class pyramidarray {
    public static void main(String[] args) {
      get2DPyramidArray(4);


    }
    public static String[][] get2DPyramidArray(int height){
        String[][] pyramid = new String [height][];
        for (int i = 0; i < height ; i++) {
         String[] pyramidRow =  createPyramidRow(height, i);
         pyramid[i] = pyramidRow;
        }
      return pyramid;
    }
    public static String[] createPyramidRow(int height, int rowIndex){
        int rowLimit = height * 2 - 1;
        String[] pyramidRow = new String[rowLimit];
        for (int i = 1; i <= rowLimit  ; i++) {
            int spaceAmount = height - rowIndex;
            int starAmount = rowIndex * 2 - 1;
            for (int spaceounter = 0; spaceounter < spaceAmount ; spaceounter++) {
                pyramidRow[spaceounter] = " ";
            }
            for (int starcounter = spaceAmount; starcounter < starAmount  ; starcounter++) {
                pyramidRow[spaceAmount + starcounter] = "*";
            }
        }
        return pyramidRow;
    }
}
