package objects;

public class car {
 String make;
 String model;
String color;
public void setmake(String newmake) {
	make = newmake;
}

public String getmake() {
	return make;
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
	System.out.println("Make: " + make + " Model: " + model + " Color: " + color);

}

}
