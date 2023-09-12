package objects;
import java.util.Scanner;

public class phone {
	Scanner keyboard = new Scanner(System.in);
	
	String brand;
	String model;
	String color;
	public void setBrand(String newBrand) {
		brand = newBrand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setModel(String newModel) {
		model = newModel;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public String getColor() {
		return color;
	}
	public void printAll() {
		System.out.println("Brand: " + brand + " Model: " + model + " Color: " + color);
	}
}