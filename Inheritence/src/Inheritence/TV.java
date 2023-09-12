package Inheritence;

public class TV {
		
		private static Boolean power = false;
		
		static void powerStatus() {
			if(power == true) {
				System.out.println("The TV is now Off");
				power = false;
			}
			else {
				System.out.println("The TV is now On");
				power = true;
			}
		}
		
		static void display(int channel) {
			if(power == true) {
				System.out.println("You are on channel " + channel);
			}
			else {
				System.out.println("The TV needs to be On to change the channel");
			}
		}
		
		static void display(String movie) {
			if(power == true) {
				System.out.println(movie + " is now playing");
			}
			else {
				System.out.println("The TV needs to be ON to play the movie");
			}
		}
		

}



