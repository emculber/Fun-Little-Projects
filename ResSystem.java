import java.util.Scanner;

public class ResSystem
{
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  private static ResSystem resSystem;
  private inputChecker input;
  private boolean seats[];
  private boolean firstClassFull = false;
  private boolean economicClassFull = false;
  private int firstClassSeats = 5;
  private int economicSeats = 5;
  private int numberOfSeats = firstClassSeats + economicSeats;
  private int lastAssaignedSeat = 0;
  
  public static void main(String[] args) {
    resSystem = new ResSystem();
  }

  public ResSystem() {
    seats = new boolean[numberOfSeats];
    input = new inputChecker();

    int command = 0;
    String menu = "Please Enter Desired Seat\n1) First Class\n2) Economy class\n-1) To Exit\n";
    while(command != -1) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
      displaySeats();
      command = input.getInputInt(menu);
      command = checkSeats(command);
      String sCommand = "";
      if(command == 2) {
        sCommand = input.getInputString("Sorry but First Class is Currently full, Would you like to be placed in Economy Section?(y/n)");
      }
      if(command == 1) {
        sCommand = input.getInputString("Sorry but Economy Class is Currently full, Would you like to be placed in First Class?(y/n)");
      }
      if(sCommand.contains("y")) {
        command = checkSeats(command);
      }
      if(sCommand.contains("n")) {
        command = -1;
        System.out.print("Next flight leaves in 3 hours.\n");
      }
      if(command == 3) {
        System.out.print("All seats are full, Next flight leaves in 3 hours.\n");
      }
    }
  }

  private int checkSeats(int seatCheckType) {
    if(seatCheckType == 1 && !firstClassFull) {
      firstClassFull = true;
      for(int i = 0; i < firstClassSeats; i++) {
        if(!seats[i]) {
          seats[i] = true;
          firstClassFull = false;
          lastAssaignedSeat = i+1;
          seatCheckType = 0;
          break;
        }
      }
    }
    if(seatCheckType == 2 && !economicClassFull)  {
      economicClassFull = true;
      for(int i = firstClassSeats; i < economicSeats + firstClassSeats; i++) {
        if(!seats[i]) {
          seats[i] = true;
          economicClassFull = false;
          lastAssaignedSeat = i+1;
          seatCheckType = 0;
          break;
        }
      }
    }
    if(firstClassFull) {
      seatCheckType = 2;
    }
    if(economicClassFull) {
      seatCheckType = 1;
    }
    if(economicClassFull &&  firstClassFull) {
      seatCheckType = 3;
    }
    return seatCheckType;
  }

  private void displaySeats() {
    int rowNum = 2;
    int colNum = 2;
    int currentSeat = 1;
    int currentCol = 1;
    for(int i = 0; i < numberOfSeats; i+=2)
    {
      for(int j = 0; j < rowNum; j++)
      {
        String ansiValue;
        if((i+j < numberOfSeats)) {
          if(!seats[i+j]) {
            ansiValue = ANSI_GREEN;
          }            
          else {
            ansiValue = ANSI_RED;
          }
        }
        else {
          break;
        }

        if((i+j) < firstClassSeats && (i+j) < numberOfSeats) {
          System.out.print(ansiValue + "F" + (i+j+1) + ANSI_RESET);
        }
        else if((i+j) < numberOfSeats) {
          System.out.print(ansiValue + "E" + (i+j+1) + ANSI_RESET);
        }
      }
      if(currentCol != colNum) {
        System.out.print("  ");
        currentCol++;
      }
      else {
        System.out.print("\n");
        currentCol = 1;
      }
    }
    System.out.print("\nYour are assigned seat " + lastAssaignedSeat + " and you are in fist class\n");
  }
}
