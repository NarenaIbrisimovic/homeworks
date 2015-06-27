package ba.bitcamp.homework15;

public class Animal {
	private String name;
	//How much animal active.
	private Integer active;
	
	//How much water animal need.
	private Integer thirsty;
	private static Integer timeOfDay = 1;
	private static Integer water = 1;
	
	public Animal (String name, Integer active, Integer thirsty){
		this.name = name;
		this.active = active;
		this.thirsty = thirsty;
	}
	
	
	/**
	 * Print status of animal.
	 */
	public void printStatus(){
		if(timeOfDay == 1 && water == 1){
			System.out.println("It’s fine. The animal is active and has water.");
		}else if(timeOfDay == 1 && water != 1){
			System.out.println("The animal is active, but does not have enough water.");
		}else if (timeOfDay !=1 && water == 1){
			System.out.println("The animal is not active, but has enough water.");
		}else  if(timeOfDay != 1 && water !=1){
			System.out.println("The animal is not active and it does not have enough water.");
		}
	}
	
	/**
	 * 
	 * @param water1 New amount of water.
	 */
	public static void setAmountOfWater(int water1){
		if(water > 0 && water <= 3){
			water = water1;
		}
		
	}
	
	/**
	 * Change day into night, and vice versa.
	 */
	public static void cycleDayNight(){
		if(timeOfDay == 1){
			timeOfDay =2;
		}else{
			timeOfDay =1;
		}
	}
	
	
	
}
