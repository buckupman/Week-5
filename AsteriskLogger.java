package week05CodingProject;

public class AsteriskLogger implements Logger {			// Implementing Logger interface

	@Override
	public void log(String str1) {          // Method being implemented
		String name;						// Declared name variable
		name = "***" + str1 + "***";		// name = the string with asterisks on each side
		System.out.println(name);			// Prints the string
		
		
		
	}

	@Override
	public void error(String str2) {				// Method being implemented
		String name2;
		name2 = "***" + "ERROR:" + str2 +"***"; 	// name2 = Error String with asterisks on each side
		
		System.out.println("****************");		// Prints out asterisks
		
		System.out.println(name2);					// Prints out String
		
		System.out.println("****************");		// Prints out asterisks
		
		
		
		
	}

}
