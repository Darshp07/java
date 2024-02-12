//W.A.J.P to find the second most frequent character in a given string. The given string 
//is: successes The second most frequent char in the string is: c 
package module;

public class q19 {

	public static void main(String[] args) {
		String frequent = "successes";

		int[] charCount = new int[256];
		for (char c : frequent.toCharArray()) {

			charCount[c]++;
		}
		int secondMaxFrequency = 0;
		int maxFrequency = 0;
		char secondMaxChar = ' ';
		char maxChar = ' ';

		for (char i = 0; i < 150; i++) {

			if (charCount[i] > maxFrequency) {

				secondMaxChar = maxChar;
				secondMaxFrequency = maxFrequency;

				maxChar = i;
				maxFrequency = charCount[i];
			} else if (charCount[i] > secondMaxFrequency) {
				secondMaxChar = i;
				secondMaxFrequency = charCount[i];
			}

		}
		if (secondMaxChar != ' ') {
			System.out.println("The second most frequent character in the string is: " + secondMaxChar);
		} else {
			System.out.println("No second most frequent character found.");
		}
	}

}
