public class Matrix {
    static void rotateMatrix(int matrix[][], int count) {

        for (int i = count; i >= 0; i--) {
            for (int j = count; j >= 0; j--)
                System.out.print(matrix[i][j] + " ");

            System.out.println();
        }
    }

}

