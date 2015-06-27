package ba.bitcamp.homework.task05;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(int day, int month) {
		this.day = day;
		this.month = month;
		this.year = 2015;
	}

	public Date(int day) {
		this.day = day;
		this.month = 1;
		this.year = 2015;
	}

	@Override
	public String toString() {
		return day + "." + month + "." + year;
	}
 
	/**
	 * 
	 * @return day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * 
	 * @param day set day
	 * @return true or false
	 */
	public boolean setDay(int day) {
		if (day <= 30 && (month == 4 || month == 6|| month == 9 || month == 11)) {
			this.day = day;
			return true;
		} else if(day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
			this.day = day;
			return true;
		}else if (day <= 28 && month == 2){
			this.day = day;
			return true;
		}else{
			return false;
		}

	}

	/**
	 * 
	 * @return month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * 
	 * @param month set month
	 * @return true or false
	 */
	public boolean setMonth(int month) {
		if (month >= 1 || month < 12) {
			this.month = month;
			return true;
		} else {
			return false;
		}

	}

	public int getYear() {
		return year;
	}

	/**
	 * 
	 * @param year set year
	 * @return true or false
	 */
	public boolean setYear(int year) {
		if (year > 0 || year < 999) {
			this.year = year;
			return true;
		} else {
			return false;
		}

	}

	
	public void DayPassed() {
		this.day++;
		if (day > 30 && (month == 4 || month == 6|| month == 9 || month == 11)) {
			this.day = 1;
			MonthPassed();
		
		} else if(day > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
			this.day = 1;
			MonthPassed();
		}else if (day > 28 && month == 2){
			this.day = 1;
			MonthPassed();
		}
	}

	public void MonthPassed() {
		this.month++;
		if (this.month > 12) {
			this.month = 1;
			this.year++;
		}
	}

}
