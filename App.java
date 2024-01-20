package week05CodingProject;

public class App {                                 // Main method class

	public static void main(String[] args) {

		AsteriskLogger asterisk = new AsteriskLogger();        // Created asterisk object
		
		asterisk.error("Hello");           // Running the error an log methods
		asterisk.log("Hello");
		
		SpacedLogger space = new SpacedLogger();    // Created space object
		
		space.error("Hi");              // Running the error an log methods
		space.log("Hi");
		
		
	}

}
