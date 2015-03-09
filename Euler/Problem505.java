import java.lang.Math;

public class Problem505
{
  public static void main(String[] args) {
    new Problem505();
  }

  long opened = 0;
  long closed = 0;
  long startTime = 0;
  double hour = 0;
  double min = 0;
  double second = 0;
  double millisecond = 0;

  public Problem505() {
    startTime = System.currentTimeMillis();
    double test = x(2);
    System.out.println("\nx(2)     : " + test);

    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = x(3);
    System.out.println("\nx(3)     : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = x(4);
    System.out.println("\nx(4)     : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = y(4,4);
    System.out.println("\ny4(4)    : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = y(4,3) - (2<<60);
    System.out.println("\ny4(3)    : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = y(4,2) - (2<<60);
    System.out.println("\ny4(2)    : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = y(4,1);
    System.out.println("\ny4(1)    : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(10) - (2<<60);
    System.out.println("\nA(10)    : 2^60" + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 3));
    System.out.println("\nA(10^3)  : " + test); 
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 4));
    System.out.println("\nA(10^4)   : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 5));
    System.out.println("\nA(10^5)   : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 6));
    System.out.println("\nA(10^6)   : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 7));
    System.out.println("\nA(10^7)   : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 8));
    System.out.println("\nA(10^8)   : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 9));
    System.out.println("\nA(10^9)   : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 10));
    System.out.println("\nA(10^10)   : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 11));
    System.out.println("\nA(10^11)   : " + test);
    
    opened = closed = 0;
    startTime = System.currentTimeMillis();
    test = A(Math.pow(10, 12));
    System.out.println("\nA(10^12)   : " + test);
    
    long estimatedTime = System.currentTimeMillis() - startTime;
    System.out.println("\nElapsedTime : " + estimatedTime);
  }

  private double x(double f) {
    opened++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
    System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
    if(f == 0 || f == 1) {
      closed++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
      System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
      return f;
    }
    if(f % 2 == 0 && f >= 1) {
      double k = f/2;
      double floorHalfk = Math.floor(k/2);
      double part1 = 3 * x(k);
      double part2 = 2 * x(floorHalfk);
      double part3 = part1 + part2;
      double temp = part3 % (2 << 60);
      closed++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
      System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
      return temp;
    }
    else if (f >= 1) {
      double k = ((f-1)/2);
      double floorHalfk = Math.floor(k/2);
      double part1 = 2 * x(k);
      double part2 = 3 * x(floorHalfk);
      double part3 = part1 + part2;
      double temp = part3 % (2 << 60);
      closed++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
      System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
      return temp;
    }
    closed++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
    System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
    return 0;
  }

  private double y(double n, double k) {
    opened++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
    System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
    if(k >= n) {
      double temp = x(k);
      closed++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
      System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
      return x(k);
    }
    if(k < n) {
      double max = Math.max(y(n, 2*k), y(n, (2*k + 1)));
      double temp = (2<<60) - 1 - max;
      closed++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
      System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
      return temp;
    }
    closed++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
    System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
    return 0;
  }

  private double A(double n){
    opened++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
    System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
    double temp = y(n, 1);
    closed++;
    millisecond = System.currentTimeMillis() - startTime;
    second = Math.floor(millisecond / 1000);
    min = Math.floor(second / 60);
    hour = Math.floor(min / 60);
    System.out.print("Opened=" + opened + " :: Closed=" + closed + " :: Unclosed=" + (opened - closed) + " :: Time=" + hour + ":" + min + ":" + second + ":" + millisecond  + "                  \r");
    return temp;
  }
}
