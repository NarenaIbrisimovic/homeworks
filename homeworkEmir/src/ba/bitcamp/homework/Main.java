package ba.bitcamp.homework;

public class Main {

	public static void main(String[] args) {
	
		ComplexGeometric vagon = new ComplexGeometric();
		vagon.addShape(new Circle(3.5));
		vagon.addShape(new Circle(4.5));
		vagon.addShape(new Rectangle(5.5, 2.8));
		vagon.addShape(new Square(1.0));
		
		ComplexGeometric voz = new ComplexGeometric();
		voz.addShape(vagon);
		voz.addShape(vagon);
		voz.addShape(vagon);
		voz.addShape(vagon);
		System.out.println(voz.getArea());
		
	}

}
