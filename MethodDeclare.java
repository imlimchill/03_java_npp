public class MethodDeclare {
	
	// 1.
	public void convertStringToCharArray(String input) {
		char[] letters = new char[input.length()];
		
		for (int idx = 0; idx < input.length(); idx++) {
			letters[idx] = input.charAt(idx);
		}
		
		for (char letter: letters) {
			System.out.printf("%c", letter);
		}
		
	} // end method
	
	// 2.
	public void sortLetters (String input) {
		char[] letters = new char[input.length()];
		char temp;

		for (int idx = 0; idx < input.length(); idx++) {
			letters[idx] = input.charAt(idx);	
			for(int ind = 0; ind < input.length() -1; ind++ ) {
				if (letters[ind] > letters[ind+1]) {
					temp = letters[ind];
					letters[ind] = letters[ind+1];
					letters[ind+1] = temp;
				}
			}
		} // end for
		
		for (char letter: letters) {
				System.out.printf("%c", letter);
		}
		//return letters;
		
	} // end method

} // end class