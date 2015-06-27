package ba.bitcamp.homework;

import java.util.Arrays;

public class ComplexGeometric {
	
	double [] Areas = {};
	
	/**
	 * Add area of circele in array Areas
	 * @param circle
	 */
	
	public void addShape( Circle circle){
		Areas = Arrays.copyOf(Areas, Areas.length+1);
		Areas[Areas.length-1] = circle.getArea();	
	}

	/**
	 * Add area of rectangle in array Areas
	 * @param rectangle
	 */
	public void addShape( Rectangle rectangle){
		Areas = Arrays.copyOf(Areas, Areas.length+1);
		Areas[Areas.length-1] = rectangle.getArea();	
	}

	/**
	 * Add area of square in array Areas
	 * @param square
	 */
	public void addShape( Square square){
		Areas = Arrays.copyOf(Areas, Areas.length+1);
		Areas[Areas.length-1] = square.getArea();	
	}

	/**
	 * Add complex geometric in Areas
	 * @param complexGeom
	 */
	public void addShape( ComplexGeometric complexGeom){
		Areas = Arrays.copyOf(Areas, Areas.length+1);
		Areas[Areas.length-1] = complexGeom.getArea();	
	}

	/**
	 * 
	 * @return sum of area complex geometric
	 */
	public Double getArea(){
		Double sum = 0.0;
		for (int i = 0; i< Areas.length; i++ ) {
			sum+=Areas[i];
		}
		return sum;
	}

	@Override
	public String toString() {
		return "ComplexGeometric Areas=" + Arrays.toString(Areas);
	}
	
	
	
}
