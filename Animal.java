package compare;

public abstract class Animal{
	
	String name;
	int legs;
	
	public Animal(String newName, int newLegs) {
		this.name = newName;
		this.legs = newLegs;
	}
	
	
	public String toString(){
		return this.name;
	}
	
	
	
	public static void main(String[] args) {
	

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}

}
