package ba.bitcamp.homework13.task01;
/*
 * Napisati metodu koja konvertuje C u K.Parametar j double i izlaz je double. Napisati javadoc za tu metodu.
 */

public class Task1 {
	/**
	 * Convert Celsius to Kelvin.
	 * @degreesCelsius input value.
	 * @degreesKelvin - return value.
	 */

	public static void main(double[] args) {
		System.out.println(convertToKelvins (-15.15));

	}
	
	public static double convertToKelvins(double degreesCelsius){
		
		double degreesKelvin = degreesCelsius + 273.15;
		return degreesKelvin;
		
	}

}
