public class Problem1
{
  public static void main(String[] args) {
    int count = 0;
    for(int i = 1; i < 10; i++) {
      if(i % 3 == 0 || i % 5 == 0) {
        count += i;
      }
    }
    System.out.println("The sum of all the multiples of 3 or 5 below 10 : " + count);
    count = 0;
    for(int i = 1; i < 1000; i++) {
      if(i % 3 == 0 || i % 5 == 0) {
        count += i;
      }
    }
    System.out.println("The sum of all the multiples of 3 or 5 below 1000 : " + count);
  }
}
