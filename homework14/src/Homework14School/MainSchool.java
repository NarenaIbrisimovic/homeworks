package Homework14School;

import Homework14.Player;

public class MainSchool {

	public static void main(String[] args) {
		 
		//Creating classrom
		Classroom c1 = new Classroom ("C#", 25);
		Classroom c2 = new Classroom ("Java", 26);
		Classroom c3 = new Classroom ("Web design", 40);
		
		
		//Creating director
		Director d1 =  new Director ("Zana", 40);
		Director d2 =  new Director ("Sasa", 43);
		Director d3 =  new Director ("Maja", 35);
		
		Director[] directors = {d1,d2,d3};
		
		//Creating array of classrooms.
		Classroom [] classrooms = {c1,c2,c3};
		
		
		//Creating school
		School s1 = new School ("BitCamp", d1,classrooms);
		School s2 = new School ("Neka skola", d2,classrooms);
		
		School[] schools = {s1, s2};
		
		System.out.println(getNameOfSchoolWithMoreStudents(s1, s2));
	

	}
	
	/*
	 * Napisati metodu koja prima, kao parametre, dvije škole. Metoda vraća ime škole koja ima više učenika.
	 */
	
	/**
	 * Return school with more number of students.
	 * @param s1 school
	 * @param s2 school
	 * @return counter number of students
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2){
		int counter1 = 0;
		int counter2 = 0;
		for(int i = 0; i < s1.classrooms.length;i++){
			counter1+= s1.classrooms[i].numberOfStudents;
		}
		
		for(int j = 0; j < s2.classrooms.length; j++){
			counter2+= s2.classrooms[j].numberOfStudents;
		}
		if(counter1 > counter2){
			return s1.nameOfSchool;
			
		}else{
			return s2.nameOfSchool;
		}
		


		
		
	}


}
