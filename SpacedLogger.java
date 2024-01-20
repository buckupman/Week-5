package week05CodingProject;

public class SpacedLogger implements Logger {     // Implementing Logger interface

	@Override
	public void log(String str1) {						// Method being implemented
		String name = "";								// Declared variable called name
		
		for (int i = 0; i < str1.length(); i++) {		// for loop to iterate through the length of the Characters
			name += str1.charAt(i) + " ";				// This adds through each Character added with a space
		}
		System.out.println(name);						// Prints out String
		
	}

	@Override
	public void error(String str2) {					// Method being implemented
		String name2;									// Declared variable called name
		name2 = "Error: ";								// Set name2 = "Error"
		for (int i = 0; i<str2.length(); i++) {			// for loop to iterate through the length of the Characters
			name2 += str2.charAt(i) + " ";				// This adds through each Character added with a space
		}
		System.out.println(name2);						// Prints out String
	}

}
