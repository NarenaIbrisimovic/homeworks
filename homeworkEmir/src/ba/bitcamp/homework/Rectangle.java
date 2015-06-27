package ba.bitcamp.homework;

public class Rectangle {
	private Double a;
	private Double b;
	
	public Rectangle (Double a, Double b){
		this.a = a;
		this.b = b;
	}
	/**
	 * 
	 * @return arae of rectangle
	 */
	public double getArea(){
		return a * b;
	}
	@Override
	public String toString() {
		return "Rectangle:" + a +  b ;
	}
	
	
	

}
