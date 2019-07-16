public class MethodDefinitions {
	
	
	// 0.
	public int power(int input) {
		return input * input;
	}
	
	// 1.
	public void printTenTimes(int input) {
		for (int idx = 0; idx < 10; idx++) {
			System.out.printf("%d%n", input);
			input += 10;
		}
	}
	
	// 2.
	public void printSomebodysMessage(String name, String message) {
		System.out.printf("[%s]'s message : [%s]", name, message);
	}
	
	// 3.
	public void printMessage(String message) {
		System.out.printf("message : %s", message);
	}
	
	// 4.
	public String returnOriginalMessage(String message) {
		return message;
	}
	
	// 5. 
	public int addTen(int input) {
		int result = input + 10;
		return result;
	}
	
	// 6. 
	public int subtractTen(int input) {
		return input - 10;
	}
	
	// 7. 
	public double makeDouble(double input) {
		return input * 2;
	}
	
	// 8. 
	public double subtractFivePointFive(double input) {
		return input - 5.5;
	}
	
	// 9. 
	public String makeFullName(String name, String surname) {
		return surname + name;
	}
	
	// 10.
	public int add(int x, int y) {
		return x + y;
	}
	
	// 11.
	public double add(double x, double y) {
		return x + y;
	}
	
	// 12.
	public void printMsgManyTimes(String message, int input) {
		for (int idx = 0; idx < input; idx++) {
			System.out.printf("%d : %s%n", idx + 1, message);
		}
	}
	
	// 13.
	public void arithmetic(char operator, int x, int y) {
		if (operator == '+') {
			System.out.printf("%d + %d = %d", x, y, x + y);
		} else if (operator == '-') {
			System.out.printf("%d - %d = %d", x, y, x - y);
		} else if (operator == '*') {
			System.out.printf("%d * %d = %d", x, y, x * y);
		} else if (operator == '/') {
			System.out.printf("%d / %d = %d", x, y, x / y);
		}
	}
	
	// 14.
	public double arithmetic(char operator, double x, double y) {
		double result = 0.0;
		if (operator == '+') {
			result = x + y;
		} else if (operator == '-') {
			result = x - y;
		} else if (operator == '*') {
			result = x * y;
		} else if (operator == '/') {
			result = x / y;
		}
		return result;
	}
	
	// 15.
	public boolean isEven(int input) {
		boolean isNum;
		
		if(input % 2 == 0) {
			isNum = true;
		} else {
			isNum = false;
		}
		return isNum;
	}
	
} // end method
