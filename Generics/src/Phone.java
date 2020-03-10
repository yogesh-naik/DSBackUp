
public class Phone implements Comparable<Phone>{
	
	int number;
	String name;
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public int getNumber(){
		return number;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 
	 * VVV IMP
	 */
	public int compareTo(Phone n){
		//return (this.name.compareTo(n.name)); // for String comparison
		
		return (n.number - this.number); // int comparison
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
