
public enum Animal {
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ENUM constructors can't be PUBLIC, so we'll set it to PRIVATE
	private Animal(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "This animal is called: " + name;
	}
}
