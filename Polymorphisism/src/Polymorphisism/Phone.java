package Polymorphisism;



public interface Phone {
	
		
		public void checkOS();
		
		public void updateOS();

	}


	class Nokia implements Phone{
		public void checkOS() {
			System.out.println("This phone has Nokia OS");
		}
		
		public void updateOS() {
			System.out.println("Nokia OS has been updated");
		}
	}

	class iPhone implements Phone{
		public void checkOS() {
			System.out.println("This phone has iOS");
		}
		
		public void updateOS() {
			System.out.println("iOS has been updated");
			
		}
	}

	class Android implements Phone{
		public void checkOS() {
			System.out.println("This phone has Andriod OS");
		}
		
		public void updateOS() {
			System.out.println("Andriod OS has been updated");
		}
	}
