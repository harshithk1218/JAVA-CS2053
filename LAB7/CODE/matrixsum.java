package Lab007;
//In java Find the sum of elements of upper diagonal, lower diagonal and diagonal element of the matrix.
public class matrixsum {
	public static void main(String[] args) {
	int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = a.length;
        int upper = 0, lower = 0, diag = 0 ;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i == j) diag += a[i][j];
                else if (i < j) upper += a[i][j];
                else lower += a[i][j];

        System.out.println("Matrix:");
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }

        System.out.println("\nDiagonal Sum = " + diag);
        System.out.println("Upper Sum = " + upper);
        System.out.println("Lower Sum = " + lower);
    }

} 