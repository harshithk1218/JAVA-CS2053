package Lab007;
// 2.	Find the mid element of a square matrix.
public class middle_element {
	public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = a.length;
        int mid = n / 2;

        System.out.println("Matrix:");
        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }

        System.out.println("\nMiddle Element = " + a[mid][mid]);
    }

}
 