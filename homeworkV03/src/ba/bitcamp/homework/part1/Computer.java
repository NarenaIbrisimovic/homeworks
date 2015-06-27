package ba.bitcamp.homework.part1;



	import java.util.Arrays;

	public abstract class Computer {
		private String name;
		private MAC adress;

		public Computer(String name, char[]adress) {
			this.name = name;
			this.adress = new MAC(adress);
		}

		public Computer() {
			this.name = "Computer";
			this.adress = null;
		}

		public String getName() {
			return name;
		}

		public MAC getAdress() {
			return adress;
		}

		@Override
		public String toString() {
			return "Computer [name=" + name + ", macaddress=" + adress + "]";
		}

		public class MAC {

			char[] adress = new char[17];

			public MAC(char[] adress) {
				super();
				this.adress = adress;
			}

			public String toString() {
				String s = "";
				for (int i = 0; i < adress.length; i++) {
					if (i % 2 != 0 && i < adress.length - 1) {
						s += adress[i] + ":";
					} else {
						s += adress[i];
					}
				}
				return s;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj){
					return true;
				}
				if (obj == null){
					return false;
				}
				if (getClass() != obj.getClass()){
					return false;
				}
				Computer other = (Computer) obj;
				
				if (adress == null) {
					if (other.adress != null)
						return false;
				} else if (!adress.equals(other.adress)){
					return false;
				}
				if (name == null) {
					if (other.name != null)
						return false;
				} else if (!name.equals(other.name)){
					return false;
				}
				return true;
			}

		}

	}



