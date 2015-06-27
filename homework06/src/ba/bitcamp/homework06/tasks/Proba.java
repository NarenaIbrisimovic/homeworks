package ba.bitcamp.homework06.tasks;

import java.util.Scanner;
public class Proba {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		  
		  int i, j, red, kolona;
		  System.out.print("Redova: ");
		  red=in.nextInt();
		  System.out.print("Kolona: ");
		  kolona=in.nextInt();
		  
		  for (i = 1; 1<=red; i++){
			  for (j=1; j<=kolona; j++){
				  
				  if(i==1 && j==1 || j==1 && i==kolona){
					  System.out.println("+");
					  
				  }else if (j==1 && i==1 || j==red && i==kolona){
					  System.out.println("+");
					  
				  }else if (j==1){
					  System.out.println("|");
					  
				  }else if (j==kolona){
					  System.out.println("|");
					  
				  }else if ((i==1 || i==red) && j==1 || j== kolona){
					  System.out.println("-");
				  }else{
					  System.out.println(" ");
				  }
			  }
		  }
		

	}

}
