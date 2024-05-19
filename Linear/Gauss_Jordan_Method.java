public class Gauss_Jordan_Method {

    public static void gaussJordan(double[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            // Make the diagonal element 1
            double diagElement = matrix[i][i];
            for (int j = 0; j < columns; j++) {
                matrix[i][j] /= diagElement;
            }

            // Make the other elements in the current column 0
            for (int k = 0; k < rows; k++) {
                if (k != i) {
                    double factor = matrix[k][i];
                    for (int j = 0; j < columns; j++) {
                        matrix[k][j] -= factor * matrix[i][j];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example system of equations
        double[][] matrix = {
            {2, 1, -1, 8},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };

        gaussJordan(matrix);

        // Print the solution
        System.out.println("The solution is:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("x" + (i + 1) + " = " + matrix[i][matrix[0].length - 1]);
        }
    }
}
