package ba.bitcamp.homework.part1;

public abstract class Network {
	
	private String name;
	private Computer[] computer;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Network(String name){
		super();
		this.name = name;
		this.computer = new Computer[0];
	}

	/**
	 * 
	 * @return Network name
	 */
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * 
	 * @return Computers
	 */
	public Computer[] getComputer() {
		return computer;
	}


	public void setComputer(Computer[] computer) {
		this.computer = computer;
	}


	/**
	 * 
	 * @param c
	 */
	public abstract void  addComputer(Computer c);
	
	/**
	 * 
	 * @param c
	 */
		
	public abstract void  removeComputer(Computer c);
		
	

}
