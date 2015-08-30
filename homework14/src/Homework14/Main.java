package Homework14;

public class Main {

	public static void main(String[] args) {

		Player p1 = new Player("Bastian Schweinsteiger", 1984, "Midfielder");
		Player p2 = new Player("Mario Götze", 1992, "Midfielder");
		Player p3 = new Player("Robert Lewadowski", 1988, "Foward");
		Player p4 = new Player("Manuel Neuer", 1986, "Goalkeeper");
		Player p5 = new Player("Arjen Robben", 1984, "Midfielder");

		System.out.println("Name:" + p1.name + "\n" + "Year of birth:"
				+ p1.yearOfBirth + "\n" + "Position:" + p1.position);
		System.out.println();
		System.out.println("Name:" + p2.name + "\n" + "Year of birth:"
				+ p2.yearOfBirth + "\n" + "Position:" + p2.position);
		System.out.println();
		System.out.println("Name:" + p3.name + "\n" + "Year of birth:"
				+ p3.yearOfBirth + "\n" + "Position:" + p3.position);
		System.out.println();
		System.out.println("Name:" + p4.name + "\n" + "Year of birth:"
				+ p4.yearOfBirth + "\n" + "Position:" + p4.position);
		System.out.println();
		System.out.println("Name:" + p5.name + "\n" + "Year of birth:"
				+ p5.yearOfBirth + "\n" + "Position:" + p5.position);
		System.out.println();

		// Creates array of class Player
		Player[] players = { p1, p2, p3, p4, p5 };

		// Creates object of class club
		Club c1 = new Club("Bayern", players);
		System.out.print(c1.players[0].name + "\n" + c1.players[1].name + "\n"
				+ c1.players[2].name + "\n" + c1.players[3].name + "\n"
				+ c1.players[4].name);
		
		System.out.println();
		
		System.out.println("Number of players with same year:" +   countPlayers (c1,1984));
		
		System.out.println("Number of position:" +   countPlayerPosition(c1,"Midfielder"));
		System.out.println(getYoungestPlayer(c1).name);

	}
	/*
	 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametre, jedan tim i jednu godinu. 
	 * Metoda vraća koliko ima igrača u datom timu tog godišta.
	 *
	 */
	
	//Check every each player of club his birth year.
			public static int countPlayers (Club c1, int year){
				int counter = 0;
				
				for (int i = 0; i < c1.players.length; i++){
					
					if(c1.players[i].yearOfBirth == year){
					counter++;
				}
				
			}
				return counter;
			
		}
			/*Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametre, jedan tim i jednu poziciju. 
			 * Metoda vraća koliko ima igrača u datom timu da igra tu poziciju.
			 * 
			 */
			
			//Check players positions.
			public static int countPlayerPosition (Club c1,String position){
				
				int counter = 0;
				for (int i = 0; i < c1.players.length; i++ ){
					if((c1.players[i].position).equals( position)){
						counter++;
					}
				}
				return counter;
			}
			
			/*
			 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametar, jedan tim.
			 *  Metoda vraća igrača koji je najmlađi u timu.
			 */
			
			
			//Check youngest player.
			public static Player getYoungestPlayer (Club c1){
				Player youngest;
				youngest = c1.players[0];
				for (int i = 1; i < c1.players.length; i++){
						
					if(c1.players[i].yearOfBirth > youngest.yearOfBirth){
						youngest = c1.players[i];
					}
					
				}
				return youngest;
							
			}
			
			
			
}