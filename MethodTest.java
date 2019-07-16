public class MethodTest {

	public static void main(String[] args) {
	
		// 1. var declare of MethodDefinitions
		MethodDefinitions methods;
		
		// 2. var initiation
		methods = new MethodDefinitions();
		
		// 3. 0 method call
		int result = methods.power(3);
		System.out.printf("method 0 ==> power of %d = %d%n", 3, result);
		
		// 1 method call
		methods.printTenTimes(10);
		
		// 2 method call
		methods.printSomebodysMessage("Lim", "Hello");
		
		// 3 method call
		methods.printMessage("Hello");
		
		// 4 method call
		String message = methods.returnOriginalMessage("Hello");
		System.out.printf("message : %s", message);
		
		// 5 method call
		result = methods.addTen(10);
		
		// 6 method call
		result = methods.subtractTen(10);
		
		// 7 method call
		double resultDouble = methods.makeDouble(10.5);
		System.out.printf("result = %f", resultDouble);
		
		// 8 method call
		resultDouble = methods.subtractFivePointFive(10.5);
		System.out.printf("result = %f", resultDouble);
		
		// 9 method call
		String resultString = methods.makeFullName("CHAEJEONG", "LIM");
		System.out.printf("my name = %s", resultString);
		
		// 10 method call
		result = methods.add(10, 20);
		System.out.printf("result = %d", result);
		
		// 11 method call
		resultDouble = methods.add(10.4, 10.6);
		System.out.printf("result = %f", resultDouble);
		
		// 12 method call
		methods.printMsgManyTimes("Hello", 10);
		
		// 13 method call
		methods.arithmetic('+', 10, 20);
		
		// 14 method call
		resultDouble = methods.arithmetic('+', 10.4, 10.6);
		System.out.printf("result = %f", resultDouble);
		
		// 15 method call
		boolean isNum = methods.isEven(10);
		System.out.printf("result = %b", isNum);
		
	}
}