package ba.bitcamp.homework;

public class Circle {
	private Double radius;
	
	public Circle(Double radius){
		this.radius = radius;
	}
	
	/**
	 * 
	 * @return area of circle
	 */
	public double getArea(){
		return radius * radius* Math.PI;
	}

	@Override
	public String toString() {
		return "Circle radius=" + radius;
	}
	
	

}
