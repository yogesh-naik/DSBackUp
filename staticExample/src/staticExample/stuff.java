package staticExample;

public class stuff {
	
	// Set count to zero initially.
	static int count = 0;
	
	// Use this to store an ID for each object.
	int id;
	
	public stuff() {
		
		// Every time the constructor runs, increment count.
		count = count + 1;
		
		// Set the object ID using count.
		id = count;
			
		System.out.println();
		
		// Now count can change but id will be unaffected.
	}
			
	//System.out.println(Arrays.);
	
	// This just returns the ID.
	public int getId() {
		id = id+2;System.out.println("herer  "+ id);
		return count;
	}
		
}
