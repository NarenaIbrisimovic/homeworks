package ba.bitcamp.homework06.tasks;

 import java.util.Scanner;
 
public class FibonacijevNiz {

	public static void main(String[] args) {
		
			  Scanner in=new Scanner(System.in);
			  
			  long a = 1;
			  long b = 1;
			  int n, i;
			  long sum = 0;
			  
			  do{
				  System.out.print("Enter the number: ");
				  n=in.nextInt();
			  }while(n <= 1 ||  n > 50);

			  for(i=3; i<=n; i++){
				  sum=a+b;
				  a=b;
				  b=sum;
			   }
			  
		    System.out.print(sum);
	}
}