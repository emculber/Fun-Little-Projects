public class Problem2 
{
  public static void main(String[] args) {
    new Problem2();
  }
  int total = 0;
  int upperBound = 4000000; 
  public Problem2() {
    Fibonacci(1, 2);
    System.out.println("Sum  of the even term Fibonacci Seqence less then four million : " + total);
  }
  public void Fibonacci(int k, int n) {
    if(n%2 == 0)
      total += n;
    if(n < upperBound)
      Fibonacci(n, k+n);
  } 
}
