package ba.bitcamp.homewok.task02;

public class Author {
	
	private String name;
	private String email;
	private String gender;
	
	public Author (String name, String email, String gender){
		this.name = name;
		this.email = email;
		this.gender = gender;	
	}
 
	/**
	 * 
	 * @return name of author
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name set name of author
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email set email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return gender
	 */
	public String getGender() {
		return this.gender;		
	}

	/**
	 * 
	 * @param gender set gender
	 */
	public void setGender(String gender) {
		if (gender == "M" || gender == "m") {
			this.gender = "M";
		} else if (gender == "F" || gender == "f") {
			this.gender="F";
		} else {
			this.gender="unknown";
		}
		
	}
	
	@Override
	public String toString(){
		String s = "";
		s = "Name:" + name  +"\n" + "Email:" + email + "\n" + "Gender:" + gender;
		return s;
		
	}

	

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
		
	}

