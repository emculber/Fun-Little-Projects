public class Problem7 {
  public static void main(String[] args) {
    new Problem7();
  }

  public Problem7() {
    int count = 0;
    int index = 0;
    while(count != 10001) {
      index++;
      if(isPrime(index)) {
        count++;
      }
    }
    System.out.println("The 10001st prime number : " + index);
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
