package Abstract;

public interface Drawable {
	
		default void msg() {
			System.out.println("defualt method");
		}
		
			
			
			static int cube(int x) {
				return x * x * x;
			}
			
			

		
		void draw();
	}


	class Rectangle implements Drawable{
		public void draw() {
			System.out.println("Drawing Rectangle");
		}
	}

	class Circle implements Drawable{
		public void draw() {
			System.out.println("Drawing Circle");
		}
	}

	class Triangle implements Drawable{
		public void draw() {
			System.out.println("Drawing Triangle");
		
	}
}

