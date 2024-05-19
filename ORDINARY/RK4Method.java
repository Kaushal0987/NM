import java.util.Scanner;

public class RK4Method {

    // Function representing the differential equation y' = f(x, y)
    public static double f(double x, double y) {
        return x * Math.exp(-x) - y; // Example: y' = x * e^(-x) - y
    }

    // Runge-Kutta 4th Order Method implementation
    public static void rk4Method(double x0, double y0, double h, int n) {
        double x = x0;
        double y = y0;
        
        System.out.printf("Step %d: x = %.5f, y = %.5f%n", 0, x, y);
        
        for (int i = 1; i <= n; i++) {
            double k1 = f(x, y);
            double k2 = f(x + h / 2.0, y + h / 2.0 * k1);
            double k3 = f(x + h / 2.0, y + h / 2.0 * k2);
            double k4 = f(x + h, y + h * k3);
            
            y = y + h / 6.0 * (k1 + 2 * k2 + 2 * k3 + k4);
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

        rk4Method(x0, y0, h, n);
        
        scanner.close();
    }
}
