import java.util.*;
class LagransInterpolation{
 public static void main (String[]args){

  Scanner in = new Scanner(System.in);

  System.out.print("Enter the no of data: ");
  int n = in.nextInt();

  double [] x1 = new double[n];
  double [] y1 = new double[n];
  
  System.out.print("Enter the values of x1: ");
  for(int i=0 ; i<n ; i++){
   x1[i] = in.nextDouble();   
  }

  System.out.print("Enter the values of y1: ");
  for(int i=0 ; i<n ; i++){
   y1[i] = in.nextDouble();   
  }

  System.out.print("Enter the value of independent variable xp: ");
  double xp = in.nextDouble();

  double yp = 0;
  for(int i=0; i<n; i++){
   double p = 1;
   for(int j=0; j<n; j++){
    if(i!=j){
     p = p * (xp-x1[j])/(x1[i]-x1[j]);
    }
   }
   yp = yp + p*y1[i];
  }

  System.out.print("Solution: "+yp);   
 }
}