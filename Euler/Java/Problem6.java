public class Problem6 {
  public static void main(String[] args) {
    new Problem6();
  }
  public Problem6() {
    int squareNumber = 0;
    int squareSum = 0;
    for(int i = 1; i < 101; i++) {
      squareNumber += (i*i);
      squareSum += i;
    }
    squareSum *= squareSum;
    System.out.println("The Diffrence of the Sum of the squares and the square of the sum of the first 100 number : " + (squareSum - squareNumber));
  }
}
