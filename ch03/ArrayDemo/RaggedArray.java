package pepperabbit.ArrayDemo;

public class RaggedArray {
    public static void main(String[] args) {
        final int MAX = 10;
        int[][] raggedArray = new int[MAX][];
        for (int i = 0; i < MAX; i++) {
            raggedArray[i] = new int[i + 1];
            for (int j = 0; j < raggedArray[i].length; j++) {
                raggedArray[i][j] = j;
            }
        }

        for (int[] row : raggedArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
