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
			
			for(int idn = idx; idn > 0; idn--)  {
				if (letters[idn] < letters[idn-1]) {
					temp = letters[idn];
					letters[idn] = letters[idn-1];
					letters[idn-1] = temp;
				}
			}
		} // end for
	
		
		for (char letter: letters) {
				System.out.printf("%c", letter);
		}
		//return letters;
		
	} // end method

} // end class