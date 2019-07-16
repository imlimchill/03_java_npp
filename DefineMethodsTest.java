public class DefineMethodsTest {
	public static void main(String[] args) {
	
		// 
		DefineMethods methods = new DefineMethods();
	
		// 1.
		int x = methods.absolute(10);
		System.out.printf("x : %d%n", x);
		
		// 2. 
		methods.findMultiple(10);
		
		// 3.
		String result = methods.decideSign(10);
		System.out.printf("%nresult : %s", result);
		
		// 4. 
		methods.repeatedMessage("Hellooooo", 10);
		
		// 5. 
		double circle = methods.calcCircleArea(10);
		System.out.printf("circle : %.2f%n", circle);
		
		// 6. 
		int[] numbers = methods.makeMultipleNums(10);
		for (int number: numbers) {
			System.out.printf("%d \t", number);
		}
		System.out.println();
			
		// 6 - 2. 
		numbers = methods.makeMultipleNums2(10, 100);
		for (int number: numbers) {
			System.out.printf("%d \t", number);
		}
		
		//methods.makeMultiNums(10);
	
	} // end main
} //end class