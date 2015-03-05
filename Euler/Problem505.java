import java.lang.Math;

public class Problem505
{
  public static void main(String[] args) {
    new Problem505();
  }

  public Problem505() {
    System.out.println("x(2)    : " + x(2));
    /*
    System.out.println("x(3)    : " + x(3));
    System.out.println("x(4)    : " + x(4));
    System.out.println("y4(4)   : " + y(4,4));
    System.out.println("y4(3)   : " + y(4,3));
    System.out.println("y4(2)   : " + y(4,2));
    System.out.println("y4(1)   : " + y(4,1));
    System.out.println("A(10)   : " + A(10));
    System.out.println("A(10^3) : " + A(Math.pow(10, 3)));
    System.out.println("A(10^12): " + A(Math.pow(10, 12)));*/
  }

  private double x(double f) {
    System.out.println("Running x(" + f + ")");
    if(f == 0) {
      System.out.println("x1)Return " + f);
      return f;
    }
    if(f == 1) {
      System.out.println("x2)Return " + f);
      return f;
    }
    if(f % 2 == 0 && f >= 1) {
      double k = f/2;
      double temp = (3 * x(k) + 2 * x(Math.floor(k/2)) % Math.pow(2, 60));
      System.out.println("x3)Return " + temp);
      return temp;
    }
    else if (f >= 1) {
      double k = (f/2 - 1);
      double temp = (2 * x(k) + 3 * x(Math.floor(k/2)) % Math.pow(2, 60));
      System.out.println("x4)Return " + temp);
      return temp;
    }
    System.out.println("Should never Reach this point. Return " + f);
    return f;
  }

  private double y(double n, double k) {
    System.out.println("Running y" + n + "("+k+")");
    if(k >= n) {
      double temp = x(k);
      System.out.println("1y)Return " + temp);
      return x(k);
    }
    if(k < n) {
      double temp = Math.pow(2, 60) - 1 - Math.max(y(n, 2*k), y(n, (2*k + 1)));
      System.out.println("2y)Return " + temp);
      return temp;
    }
    System.out.println("Should never Reach this point. Return " + 0);
    return 0;
  }

  private double A(double n){
    System.out.println("Running A(" + n + ")");
    return y(n, 1);
  }
}
