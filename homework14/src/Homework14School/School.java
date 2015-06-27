package Homework14School;

public class School {
	
	String nameOfSchool;
	Director director;
	Classroom[] classrooms;
	
	School(String nameOfSchool, Director director, Classroom[] classrooms){
		this.nameOfSchool = nameOfSchool;
		this.director = director;
		this.classrooms = classrooms;
	}
	
}
