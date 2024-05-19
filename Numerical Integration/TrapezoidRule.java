public class TrapezoidRule {

    // Function to be integrated
    public static double f(double x) {
        return Math.sin(x); // Example function: f(x) = sin(x)
    }

    // Trapezoid rule for a single interval [a, b]
    public static double trapezoid(double a, double b) {
        return (b - a) * (f(a) + f(b)) / 2.0;
    }

    // Composite Trapezoid Rule
    public static double compositeTrapezoid(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            sum += 2 * f(a + i * h);
        }

        return (h / 2) * sum;
    }

    public static void main(String[] args) {
        double a = 0; // Start of interval
        double b = Math.PI; // End of interval
        int n = 100; // Number of subintervals

        double result = compositeTrapezoid(a, b, n);

        System.out.println("Approximate integral: " + result);
    }
}
