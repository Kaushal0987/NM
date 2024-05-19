import java.util.Scanner;

public class EulersMethod {

    // Function representing the differential equation y' = f(x, y)
    public static double f(double x, double y) {
        return x * Math.exp(-x) - y; // Example: y' = x * e^(-x) - y
    }

    // Euler's Method implementation
    public static void eulerMethod(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;
        
        System.out.printf("Step %d: x = %.5f, y = %.5f%n", 0, x, y);
        
        for (int i = 1; i <= n; i++) {
            y = y + h * f(x, y);
            x = x + h;
            System.out.printf("Step %d: x = %.5f, y = %.5f%n", i, x, y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial value x0: ");
        double x0 = scanner.nextDouble();

        System.out.print("Enter initial value y0: ");
        double y0 = scanner.nextDouble();

        System.out.print("Enter step size h: ");
        double h = scanner.nextDouble();

        System.out.print("Enter number of steps n: ");
        int n = scanner.nextInt();

        eulerMethod(x0, y0, h, n);
        
        scanner.close();
    }
}
