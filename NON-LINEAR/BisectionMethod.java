public class BisectionMethod {
    public static void main(String[] args) {
        double a = 1.0; // Left endpoint of the interval
        double b = 2.0; // Right endpoint of the interval
        double tolerance = 0.001; // Tolerance for convergence
        double root = bisectionMethod(a, b, tolerance);
        System.out.println("Approximate root using Bisection Method: " + root);
    }

    public static double bisectionMethod(double a, double b, double tolerance) {
        double fa = function(a);
        double fb = function(b);

        if (fa * fb >= 0) {
            throw new IllegalArgumentException("Function does not change sign within the interval.");
        }

        while ((b - a) > tolerance) {
            double c = (a + b) / 2;
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

        return (a + b) / 2;
    }

    public static double function(double x) {
        // Define your function here, e.g., return x^2 - 2;
        return x*x*x-x*x-2;
    }
}
