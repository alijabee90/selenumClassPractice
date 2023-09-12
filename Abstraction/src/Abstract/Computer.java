package Abstract;

public abstract class Computer {
	
	public void checkProgram() {
		System.out.println("The program installed");
	}
	
	public abstract void runProgram();

}


class Gmail extends Computer{
	public void runProgram() {
		System.out.println("Gmail is now running");
	}
}



class Word extends Computer{
	public void runProgram() {
		System.out.println("Word is now running");
	}
}


class Spotify extends Computer{
	public void runProgram() {
		System.out.println("Spotify is now running");
	}
}