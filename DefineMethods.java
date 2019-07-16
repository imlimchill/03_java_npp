public class DefineMethods {
	
	// 1.
	public int absolute(int x) {
		return (x < 0) ? x : -x;
	}
	
	// 2.
	public void findMultiple(int x){
		int idx = 1;
		while (idx != 101) {
			if(idx % x == 0 && x <= idx) {
				System.out.printf("%d\t", idx);
			}
			idx++;
		}
	}
	
	// 3. 
	public String decideSign(int x) {
		String result;
		if (x == 0) {
			result = "0";
		} else if (x < 0) {
			result = "x > 0";
		} else {
			result = "x < 0";
		}
		return result;
	}
	
	// 4. 
	public void repeatedMessage(String message, int repeat) {
		String[] messages = new String[repeat];
		// message save
		for (int idx = 0; idx < repeat; idx++) {
			messages[idx] = message;
		}
		
		// message print
		for (String mess: messages) {
			System.out.printf("%s%n", mess);
		}
	}
	
	// 5. 
	public double calcCircleArea(int r) {
		return 3.14 * r * r;
	}
	
	// 6. 
	public int[] makeMultipleNums(int x) {
		int[] numbers;
		int count = 0;
		int ind = 0;
		for(int idx = 1; idx <= 100; idx++) {
			if(idx % x == 0 && x <= idx) {
				count++;
			}
		}
		numbers = new int[count];
		for (int idx = 1; idx <= 100; idx++) {
			if(idx % x == 0 && x <= idx) {
				numbers[ind] = idx;
				ind++;
			}
		}
		return numbers;
	}
	
	// 6 - 2.
	public int[] makeMultipleNums2(int x, int limit) {
		int[] numbers = new int[limit / x];
		
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = x * (idx + 1);
		}
		return numbers;
	}

} // end methods