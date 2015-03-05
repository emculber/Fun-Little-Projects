import java.util.Scanner;

public class inputChecker {
	// Variables----------------------------------------------------------------------------------------------------------------------------------------------------------------
	private Scanner input;

	private byte inputByte = 0;
	private short inputShort = 0;
	private int inputInt = 0;
	private long inputLong = 0;
	private float inputFloat = 0;
	private double inputDouble = 0;

	private boolean inputBoolean = false;

	private String inputString = "";

	// Variables----------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Constructor--------------------------------------------------------------------------------------------------------------------------------------------------------------
	public inputChecker() {
		input = new Scanner(System.in);
	}

	// Constructor--------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Get-Byte-Input-----------------------------------------------------------------------------------------------------------------------------------------------------------
	public byte getInputByte(String Message, int numberOfTries) {
		int tries = 0;
		while (tries <= numberOfTries) {
			System.out.print(Message);
			if (input.hasNextByte()) {
				inputByte = input.nextByte();
				System.out.println("");
				input.nextLine();
				return inputByte;
			} else {
				System.out.println("Your input is invalid! Please enter a whole number that is between -128 and 127!");
				input.next();
			}
			tries++;
		}
		return inputByte;
	}

	public byte getInputByte(String Message) {
		while (true) {
			System.out.print(Message);
			if (input.hasNextByte()) {
				inputByte = input.nextByte();
				System.out.println("");
				input.nextLine();
				return inputByte;
			} else {
				System.out.println("Your input is invalid! Please enter a whole number that is between -128 and 127!");
				input.next();
			}
		}
	}

	// Get-Byte-Input-----------------------------------------------------------------------------------------------------------------------------------------------------------

	// Get-Short-Input----------------------------------------------------------------------------------------------------------------------------------------------------------
	public short getInputShort(String Message, int numberOfTries) {
		int tries = 0;
		while (tries <= numberOfTries) {
			System.out.print(Message);
			if (input.hasNextShort()) {
				inputShort = input.nextShort();
				System.out.println(""); 
				input.nextLine();
				return inputShort;
			} else {
				System.out.println("Your input is invalid! Please enter a whole number that is between -32,768 and 32,767!");
				input.next();
			}
			tries++;
		}
		return inputShort;
	}

	public short getInputShort(String Message) {
		while (true) {
			System.out.print(Message);
			if (input.hasNextShort()) {
				inputShort = input.nextShort();
				System.out.println(""); 
				input.nextLine();
				return inputShort;
			} else {
				System.out.println("Your input is invalid! Please enter a whole number that is between -32,768 and 32,767!");
				input.next();
			}
		}
	}

	// Get-Short-Input----------------------------------------------------------------------------------------------------------------------------------------------------------

	// Get-Integer-Input--------------------------------------------------------------------------------------------------------------------------------------------------------
	public int getInputInt(String Message, int numberOfTries) {
		int tries = 0;
		while (tries <= numberOfTries) {
			System.out.print(Message);
			if (input.hasNextInt()) {
				inputInt = input.nextInt();
				System.out.println(""); 
				input.nextLine();
				return inputInt;
			} else {
				System.out.println("Your input is invalid! Please enter a whole number that is between -2,147,483,648 and 2,147,483,647!");
				input.next();
			}
			tries++;
		}
		return inputInt;
	}

	public int getInputInt(String Message) {
		while (true) {
			System.out.print(Message);
			if (input.hasNextInt()) {
				inputInt = input.nextInt();
				System.out.println(""); 
				input.nextLine();
				return inputInt;
			} else {
				System.out.println("Your input is invalid! Please enter a whole number that is between -2,147,483,648 and 2,147,483,647!");
				input.next();
			}
		}
	}

	// Get-Integer-Input--------------------------------------------------------------------------------------------------------------------------------------------------------

	// Get-Long-Input-----------------------------------------------------------------------------------------------------------------------------------------------------------
	public long getInputLong(String Message, int numberOfTries) {
		int tries = 0;
		while (tries <= numberOfTries) {
			System.out.print(Message);
			if (input.hasNextLong()) {
				inputLong = input.nextLong();
				System.out.println(""); 
				input.nextLine();
				return inputLong;
			} else {
				System.out.println("Your input is invalid! Please enter a whole number that is between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807!");
				input.next();
			}
			tries++;
		}
		return inputLong;
	}

	public long getInputLong(String Message) {
		while (true) {
			System.out.print(Message);
			if (input.hasNextLong()) {
				inputLong = input.nextLong();
				System.out.println(""); 
				input.nextLine();
				return inputLong;
			} else {
				System.out.println("Your input is invalid! Please enter a whole number that is between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807!");
				input.next();
			}
		}
	}

	// Get-Long-Input-----------------------------------------------------------------------------------------------------------------------------------------------------------

	// Get-Float-Input----------------------------------------------------------------------------------------------------------------------------------------------------------
	public float getInputFloat(String Message, int numberOfTries) {
		int tries = 0;
		while (tries <= numberOfTries) {
			System.out.print(Message);
			if (input.hasNextFloat()) {
				inputFloat = input.nextFloat();
				System.out.println(""); 
				input.nextLine();
				return inputFloat;
			} else {
				System.out.println("Your input is invalid! Please enter a decimal number!");
				input.next();
			}
			tries++;
		}
		return inputFloat;
	}

	public float getInputFloat(String Message) {
		while (true) {
			System.out.print(Message);
			if (input.hasNextFloat()) {
				inputFloat = input.nextFloat();
				System.out.println(""); 
				input.nextLine();
				return inputFloat;
			} else {
				System.out.println("Your input is invalid! Please enter a decimal number!");
				input.next();
			}
		}
	}

	// Get-Float-Input----------------------------------------------------------------------------------------------------------------------------------------------------------

	// Get-Double-Input---------------------------------------------------------------------------------------------------------------------------------------------------------
	public double getInputDouble(String Message, int numberOfTries) {
		int tries = 0;
		while (tries <= numberOfTries) {
			System.out.print(Message);
			if (input.hasNextDouble()) {
				inputDouble = input.nextDouble();
				System.out.println(""); 
				input.nextLine();
				return inputDouble;
			} else {
				System.out.println("Your input is invalid! Please enter a decimal number!");
				input.next();
			}
			tries++;
		}
		return inputDouble;
	}

	public double getInputDouble(String Message) {
		while (true) {
			System.out.print(Message);
			if (input.hasNextDouble()) {
				inputDouble = input.nextDouble();
				System.out.println(""); 
				input.nextLine();
				return inputDouble;
			} else {
				System.out.println("Your input is invalid! Please enter a decimal number!");
				input.next();
			}
		}
	}

	// Get-Double-Input---------------------------------------------------------------------------------------------------------------------------------------------------------

	// Get-Boolean-Input--------------------------------------------------------------------------------------------------------------------------------------------------------
	public boolean getInputBoolean(String Message, int numberOfTries) {
		int tries = 0;
		while (tries <= numberOfTries) {
			System.out.print(Message);
			if (input.hasNextBoolean()) {
				inputBoolean = input.nextBoolean();
				System.out.println(""); 
				input.nextLine();
				return inputBoolean;
			} else {
				System.out.println("Your input is invalid! Please enter true or false!");
				input.next();
			}
			tries++;
		}
		return inputBoolean;
	}

	public boolean getInputBoolean(String Message) {
		while (true) {
			System.out.print(Message);
			if (input.hasNextBoolean()) {
				inputBoolean = input.nextBoolean();
				System.out.println(""); 
				input.nextLine();
				return inputBoolean;
			} else {
				System.out.println("Your input is invalid! Please enter true or false!");
				input.next();
			}
		}
	}

	// Get-Boolean-Input--------------------------------------------------------------------------------------------------------------------------------------------------------

	// Get-String-Input-----------------------------------------------------------------------------------------------------------------------------------------------------------
	public String getInputString(String Message) {
		System.out.print(Message);
		if (input.hasNextLine()) {
			inputString = input.nextLine();
			System.out.println(""); 
			return inputString;
		}
		return inputString;
	}
	// Get-String-Input-----------------------------------------------------------------------------------------------------------------------------------------------------------
}
