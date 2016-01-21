import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		double operand1 = 10;
		double operand2 = 8;
		double result = 0;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = "";
		String operation = "";
		Calculator calc;
		
		System.out.println("Operand1 = " + operand1);
		System.out.println("Operand2 = " + operand2);
		
		//addition
		result = operand1 + operand2;
		System.out.println("The result of adding operand1 and operand2 is: " + result);
		
		//subtraction
		result = operand1 - operand2;
		System.out.println("The result of subtracting operand1 and operand2 is: " + result);
		
		//multiplication
		result = operand1 * operand2;
		System.out.println("The result of multiplying operand1 and operand2 is: " + result);
		
		//division
		result = operand1 / operand2;
		System.out.println("The result of dividing operand1 and operand2 is: " + result);
		
		//*********************************************************
		//Using a class that can be created and used from anywhere.
		//*********************************************************
		
		System.out.print("Enter Operand 1: ");
		try {
			userInput = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		operand1 = Double.parseDouble(userInput);
		
		System.out.print("Enter Operand 2: ");
		try {
			userInput = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		operand2 = Double.parseDouble(userInput);

		System.out.print("Do what with the numbers? Choices are (+ - * /): ");
		try {
			operation = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calc = new Calculator();
		
		//System.out.println("Using Calculator Class");
		//System.out.println("Operand1 = " + operand1);
		//System.out.println("Operand2 = " + operand2);
		
		if (operation.equals("+")) {
			result = calc.addNumbers(operand1,operand2);
			System.out.println("The result of calculator add method is: " + result);
		} else if (operation.equals("-")) {
			result = calc.subtractNumbers(operand1,operand2);
			System.out.println("The result of calculator subtract method is: " + result);
		} else if (operation.equals("*")) {
			result = calc.multiplyNumbers(operand1,operand2);
			System.out.println("The result of calculator multiply method is: " + result);
		} else if (operation.equals("/")) {
			result = calc.divideNumbers(operand1,operand2);
			System.out.println("The result of calculator divide method is: " + result);
		} else {
			System.out.println("Invalid Operation");
		}
		
		
				
	}

}
