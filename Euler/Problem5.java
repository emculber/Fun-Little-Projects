public class Problem5 {
  public static void main(String[] args) {
    new Problem5();
  }

  public Problem5() {
    int smallestNumber = 0;
    int count = 0;
    while(smallestNumber == 0) {
      count+= 20;
      boolean found = true;
      for(int i = 1; i < 21; i++) {
        System.out.print("Checking " + count + " % " + i + "               \r");
        if(count % i != 0) {
          found = false;
          break;
        }
      }
      if(found) {
        smallestNumber = count;
      }
    }
    System.out.println("\nThe smallest number evenly divisible by all the number from 1 to 20 : " + smallestNumber);
  }
}
