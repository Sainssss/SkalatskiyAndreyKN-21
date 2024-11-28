public class Task1 {
    public static void main(String[] args) {
        int[][] pyramid = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        System.out.println("Звичайний порядок:");
        for (int[] ints : pyramid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗворотній порядок:");
        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int j = pyramid[i].length - 1; j >= 0; j--) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}