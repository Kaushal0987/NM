public class SimpsonsRule {

    // Function to be integrated
    public static double f(double x) {
        return Math.sin(x); // Example function: f(x) = sin(x)
    }

    // Simpson's 1/3 Rule for a single interval [a, b]
    public static double simpsonsRule(double a, double b) {
        double c = (a + b) / 2.0;
        return (b - a) / 6.0 * (f(a) + 4 * f(c) + f(b));
    }

    // Composite Simpson's 1/3 Rule
    public static double compositeSimpsonsRule(double a, double b, int n) {
        if (n % 2 != 0) {
            throw new IllegalArgumentException("n must be even");
        }

        double h = (b - a) / n;
        double sum = f(a) + f(b);

        for (int i = 1; i < n; i += 2) {
            sum += 4 * f(a + i * h);
        }

        for (int i = 2; i < n; i += 2) {
            sum += 2 * f(a + i * h);
        }

        return (h / 3.0) * sum;
    }

    public static void main(String[] args) {
        double a = 0; // Start of interval
        double b = Math.PI; // End of interval
        int n = 100; // Number of subintervals (must be even)

        double result = compositeSimpsonsRule(a, b, n);

        System.out.println("Approximate integral: " + result);
    }
}
