public class SecantMethod {
    public static void main(String[] args) {
        double x0 = 1.0; // Initial guess 1
        double x1 = 2.0; // Initial guess 2
        double tolerance = 0.001; // Tolerance for convergence
        double root = secantMethod(x0, x1, tolerance);
        System.out.println("Approximate root using Secant Method: " + root);
    }

    public static double secantMethod(double x0, double x1, double tolerance) {
        double fx0 = function(x0);
        double fx1 = function(x1);

        double x2;
        double fx2;

        do {
            x2 = x1 - ((fx1 * (x1 - x0)) / (fx1 - fx0));
            fx2 = function(x2);

            x0 = x1;
            fx0 = fx1;
            x1 = x2;
            fx1 = fx2;
        } while (Math.abs(fx2) > tolerance);

        return x2;
    }

    public static double function(double x) {
        // Define your function here, e.g., return x^2 - 2;
        return 2*x*x+4*x-10;
    }
}
