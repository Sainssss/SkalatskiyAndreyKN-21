import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int rows = 4, cols = 4;
        double[][] matrix = new double[rows][cols];
        Random random = new Random();

        System.out.println("Початкова матриця:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + random.nextDouble() * 9; // [1, 10)
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nМодифікована матриця:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 != 0 || j % 2 != 0) {
                    matrix[i][j] = Math.sqrt(matrix[i][j]);
                }
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
