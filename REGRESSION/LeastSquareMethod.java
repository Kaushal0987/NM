import java.util.Scanner;
public class LeastSquareMethod{
 public static void main (String[]args){

  Scanner in = new Scanner(System.in);

  System.out.print("Enter the no of data: ");
  int n = in.nextInt();
 
  double x[] = new double[n];
  double y[] = new double[n];
  double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

  System.out.print("Enter the values of x: ");
  for(int i=0; i<n; i++){
   x[i] = in.nextDouble();
  }

  System.out.print("Enter the values of y: ");
  for(int i=0; i<n; i++){
   y[i] = in.nextDouble();
  }

  for(int i=0; i<n; i++){
   sumX = sumX + x[i];
   sumY = sumY + y[i];
   sumXY = sumXY + (x[i]*y[i]);
   sumX2 = sumX2 + (x[i]*x[i]);
  }

  double b = (n*sumXY - sumX*sumY)/(n*sumX2 - sumX*sumX);
  double a = (sumY - b*sumX)/n;

  System.out.println("The equation of the regression line is y = " + a + " + " + b + "x");
  
 }
}