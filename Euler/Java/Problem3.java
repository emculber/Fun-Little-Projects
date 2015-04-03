import java.lang.Math;

public class Problem3 {

  public static void main(String[] args) {
    new Problem3();
  }

  long number = 600851475143L;
  long sqrtNumber = 0;
  long found = 0;
  public Problem3() {
  sqrtNumber = (long)Math.sqrt(number);
    for(long i = 1; i < sqrtNumber; i+=2)
    {
      System.out.print("Checking " + i + "               \r");
      if(number%i == 0){
        if(isPrime(i))  {
          found = i;
        }
      }
    }
          System.out.println("\nThe largest Prime Factor of " + number + " : " + found);
  }

  public boolean isPrime(long n) {
    if (n <= 3) {
      return n > 1;
    } else if (n % 2 == 0 || n % 3 == 0) {
      return false;
    } else {
      double sqrtN = Math.floor(Math.sqrt(n));
      for (int i = 5; i <= sqrtN; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
          return false;
        }
      }
      return true;
    }
  }
}
