package ba.bitcamp.homework;

public class Square {
	private Double a;
	
	public Square (Double a){
		this.a = a;
	}
	
	/**
	 * 
	 * @return area of square
	 */
	public Double getArea(){
		return  a * a;
	}

	@Override
	public String toString() {
		return "Square" + a ;
	}

	
}
