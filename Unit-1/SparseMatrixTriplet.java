public class SparseMatrixTriplet {
    public static void main(String[] args) {
        int[][] a = {{0, 0, 3}, {0, 4, 0}, {5, 0, 0}};
        int nonZero = 0;
        for (int[] row : a) for (int v : row) if (v != 0) nonZero++;
        int[][] t = new int[nonZero + 1][3];
        t[0][0] = a.length; t[0][1] = a[0].length; t[0][2] = nonZero;
        int k = 1;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] != 0) { t[k][0] = i; t[k][1] = j; t[k++][2] = a[i][j]; }
        System.out.println("Row Column Value");
        for (int[] row : t) System.out.println(row[0] + "   " + row[1] + "   " + row[2]);
    }
}
