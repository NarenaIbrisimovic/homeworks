package ba.bitcamp.homework.part1;



	public class Server extends Computer {

		private int limit;
		
		public Server(int limit, String name, char[]adress){
			super(name, adress);
			this.limit = limit;
		}

		public int getLimit() {
			return limit;
		}

		public void setLimit(int limit) {
			this.limit = limit;
		}
}
