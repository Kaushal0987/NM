public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        double initialGuess = 2.0;
        double tolerance = 0.001;
        double root = newtonRaphson(initialGuess, tolerance);
        System.out.println("Approximate root using Newton-Raphson Method: " + root);
    }

    public static double newtonRaphson(double initialGuess, double tolerance) {
        double x0 = initialGuess;
        double x1;

        do {
            double fx = function(x0);
            double fpx = derivative(x0);

            x1 = x0 - fx / fpx;

            if (Math.abs(x1 - x0) < tolerance) {
                break;
            }

            x0 = x1;
        } while (true);

        return x1;
    }

    public static double function(double x) {
        // Define your function here, e.g., return x^2 - 2;
        return x*x+4*x-9;
    }

    public static double derivative(double x) {
        // Define the derivative of your function here.
        // This method should return the derivative of the function at point x.
        return 2*x+4;
    }
}
