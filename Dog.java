package compare;

public class Dog implements Comparable<Animal> {
	int legs;
	String name;
	
	
	public Dog(String name, int legs){
		this.name = name; 
		this.legs = legs;
	}
	
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return "Name: " + name + ", legs: " + legs;
	    }


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Animal a) {
		
		return name.compareToIgnoreCase(a.getName());
	}

}
