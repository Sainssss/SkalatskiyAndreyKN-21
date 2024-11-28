import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмір матриці:");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Введіть рядок і стовпець для мінору:");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] minor = getMinor(matrix, row, col);
        System.out.println("Мінор:");
        for (int[] r : minor) {
            for (int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMinor(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int[][] minor = new int[n - 1][n - 1];
        for (int i = 0, mi = 0; i < n; i++) {
            if (i == row) continue;
            for (int j = 0, mj = 0; j < n; j++) {
                if (j == col) continue;
                minor[mi][mj++] = matrix[i][j];
            }
            mi++;
        }
        return minor;
    }
}
