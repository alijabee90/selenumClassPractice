package AfterClassReview;


public abstract class Computer {
	
	public void checkProgram() {
		System.out.println("The program is installed.");
	}
	public void runProgram() {
			
	}
}


class Gmail extends Computer {
	public void runProgram() {
		System.out.println("Gmail is now running." + "\n");
	}
}

class Word extends Computer {
	public void runProgram() {
		System.out.println("Word is now running."+ "\n");
	}
	
}

class Spotify extends Computer {
	public void runProgram() {
		System.out.println("Spotify now is running."+"\n");
	}
	
}