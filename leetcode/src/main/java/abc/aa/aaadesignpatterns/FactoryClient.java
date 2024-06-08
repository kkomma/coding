package abc.aa.aaadesignpatterns;


interface Shape {
	String getShape();
}

class Rectangle implements Shape{

	@Override
	public String getShape() {		
		return "rectangle";
	}
	
}

class Circle implements Shape{

	@Override
	public String getShape() {		
		return "circle";
	}
	
}

class Factory {
	public static Shape shape(String fmt) {
		if(fmt.equals("rectangle")) {
			return new Rectangle();
		}else if(fmt.equals("circle")) {
			return new Circle();
		}
		return null;
	}
}

public class FactoryClient {
	
	public static void main(String... args) {
		System.out.println(Factory.shape("rectangle").getShape());
		System.out.println(Factory.shape("circle").getShape());		
	}
	
	
}
