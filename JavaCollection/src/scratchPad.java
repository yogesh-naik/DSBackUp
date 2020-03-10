import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;


public class scratchPad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<dog> ani = new ArrayList<dog>();
		ani.add(new dog());
		ani.add(new dog());
		ani.add(new dog());
		
		takeAnimals(ani);
		
		
	}
	
	public static void takeAnimals(ArrayList<? extends Animal> ap){
		
		for(Animal pt:ap)
			//System.out.println("Here is "+pt);
			pt.eat();
	}
}
