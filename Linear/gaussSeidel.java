public class gaussSeidel {
    static final double TOLERANCE = 1e-10;
    static final int MAX_ITERATIONS = 1000;

    public static void main(String[] args) {
        double[][] A = {
            {4, -1, 0, 0},
            {-1, 4, -1, 0},
            {0, -1, 4, -1},
            {0, 0, -1, 3}
        };

        double[] b = {15, 10, 10, 10};
        double[] x = {0, 0, 0, 0};

        gaussSeidel(A, b, x);
        
        System.out.println("Solution:");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x" + (i + 1) + " = " + x[i]);
        }
    }

    public static void gaussSeidel(double[][] A, double[] b, double[] x) {
        int n = A.length;
        for (int k = 0; k < MAX_ITERATIONS; k++) {
            double[] x_new = x.clone();
            for (int i = 0; i < n; i++) {
                double sum = b[i];
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        sum -= A[i][j] * x[j];
                    }
                }
                x_new[i] = sum / A[i][i];
            }
            
            // Check for convergence
            boolean converged = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(x_new[i] - x[i]) > TOLERANCE) {
                    converged = false;
                    break;
                }
            }
            
            x = x_new;
            if (converged) break;
        }
    }
}
