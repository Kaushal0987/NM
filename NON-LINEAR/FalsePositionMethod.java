public class FalsePositionMethod {
    public static void main(String[] args) {
        double a = 1.0; // Left endpoint of the interval
        double b = 2.0; // Right endpoint of the interval
        double tolerance = 0.001; // Tolerance for convergence
        double root = falsePositionMethod(a, b, tolerance);
        System.out.println("Approximate root using False Position Method: " + root);
    }

    public static double falsePositionMethod(double a, double b, double tolerance) {
        double fa = function(a);
        double fb = function(b);

        if (fa * fb >= 0) {
            throw new IllegalArgumentException("Function does not change sign within the interval.");
        }

        while (Math.abs(b - a) > tolerance) {
            double c = (a * fb - b * fa) / (fb - fa);
            double fc = function(c);

            if (fc == 0) {
                return c;
            } else if (fa * fc < 0) {
                b = c;
                fb = fc;
            } else {
                a = c;
                fa = fc;
            }
        }

        return (a * fb - b * fa) / (fb - fa);
    }

    public static double function(double x) {
        // Define your function here, e.g., return x^2 - 2;
        return 2*x*x+4*x-10;
    }
}
