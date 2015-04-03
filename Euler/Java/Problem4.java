public class Problem4 {
  public static void main(String[] args) {
    new Problem4();
  }

  public Problem4() {
    int max = 0;
    for(int i = 100; i  < 1000; i++) {
      for(int x = 100; x < 1000; x++) {
        int input = i * x;
        int reversedNum = 0;
        while (input != 0) {
          reversedNum = reversedNum * 10 + input % 10;
          input = input / 10;   
        }
        input = i*x;
        if(max < input && reversedNum == input) {
          max = input;
        }
      }
    }
    System.out.println("The largest palindrome made from two 3-digit numbers : " + max);
  }
}
