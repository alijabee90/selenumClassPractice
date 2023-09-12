package Abstract;

public class demoComputer {

	public static void main(String[] args) {
		Computer c1 = new Gmail();
		Computer c2 = new Word();
		Computer c3 = new Spotify();
		
		c1.checkProgram();
		c1.runProgram();
		
		c2.checkProgram();
		c2.runProgram();
		
		c3.checkProgram();
		c3.runProgram();

	}

}
