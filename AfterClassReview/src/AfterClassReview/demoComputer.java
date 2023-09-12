package AfterClassReview;



public class demoComputer {

	public static void main(String[] args) {
	
		Computer gmail = new Gmail();
		Computer word = new Word();
		Computer spotify = new Spotify();
		
		gmail.checkProgram();
		gmail.runProgram();
		
		word.checkProgram();
		word.runProgram();
		
		spotify.checkProgram();
		spotify.runProgram();

	}

}