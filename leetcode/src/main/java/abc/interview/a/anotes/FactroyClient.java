package abc.interview.a.anotes;


interface Shape {
	String getShape();
}

class Circle implements Shape{
	@Override
	public String getShape() {
		return "circle";
	}
}
class Rectangle implements Shape{
	@Override
	public String getShape() {
		return "rectangle";
	}
}

class Factory {
	public static Shape shape(String shape) {
		if(shape.contains("circle")) {
			return new Circle();
		}else if(shape.contains("rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}

public class FactroyClient {
	public static void main(String[] args) {		
		System.out.println(Factory.shape("circle").getShape());
		System.out.println(Factory.shape("rectangle").getShape());
	}
}
