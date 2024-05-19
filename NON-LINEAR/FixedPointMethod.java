public class FixedPointMethod {
    public static void main(String[] args) {
        double initialGuess = 1.0; // Initial guess
        double tolerance = 0.01; // Tolerance for convergence
        double root = fixedPointMethod(initialGuess, tolerance);
        System.out.println("Approximate fixed point: " + root);
    }

    public static double fixedPointMethod(double initialGuess, double tolerance) {
        double currentApproximation = initialGuess;
        double nextApproximation = g(currentApproximation);

        while (Math.abs(nextApproximation - currentApproximation) > tolerance) {
            System.out.println(Math.abs(nextApproximation - currentApproximation));
            currentApproximation = nextApproximation;
            nextApproximation = g(currentApproximation);
        }

        return nextApproximation;
    }

    public static double g(double x) {
        // Define your function g(x) here
        return x*x-5*x+8; // Example function
    }
}
