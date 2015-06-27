package ba.bitcamp.homework.part1;

public class Client extends Computer implements Connectable {
	private Computer computer;
	private Network network;




	public Client(String name, char[] adress) {
		super(name,adress);
	}
	
	public Computer getComputer() {
		return computer;
	}

	public Network getNetwork() {
		return network;
	}

	@Override
	public void connect(Computer c) {
		if (computer != null) {
			throw new IllegalArgumentException();
		}

		computer = c;
	}

	@Override
	public void connect(Network n) {
		if (computer != null) {
			throw new IllegalArgumentException();
		}
		network = n;
	}

	@Override
	public void disconnect() {
		computer = null;
		network = null;

	}

	@Override
	public String toString() {
		return "Client [computer=" + computer + ", network=" + network + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Client other = (Client) obj;
		if (computer == null) {
			if (other.computer != null)
				return false;
		} else if (!computer.equals(other.computer)) {
			return false;
		}
		if (network == null) {
			if (other.network != null) {
				return false;
			}
		} else if (!network.equals(other.network)) {
			return false;
		}
		return true;
	}

}
