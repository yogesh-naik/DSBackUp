package arrayofObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class mainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		personData person = new personData();
		
		person.setAge(23);
		person.setName("Yogesh");
		
		//Array declaration of objects
		personData[] arrayOfPerson= new personData[2];
		
//		for(int i = 0;i<2;i++){
			//****Intialise each array member with a class object
			arrayOfPerson[0] = new personData();			
			arrayOfPerson[0].setAge(34);
			arrayOfPerson[0].setName("Naik");

			arrayOfPerson[1] = new personData();			
			arrayOfPerson[1].setAge(2);
			arrayOfPerson[1].setName("yogesh");
			
			//arrayOfPerson[i].age = 34;
	//	}
		
			
		List<personData> p = new ArrayList();
				
		for(int i = 0;i<=arrayOfPerson.length-1;i++){
			p.add(arrayOfPerson[i]);
		}
		
		//Iterate through each object and print
		Iterator <personData> itr = p.iterator();
	
		
		while(itr.hasNext()){
			//System.out.println("here is the age "+ itr.next().getName());
			//System.out.println("here is the name "+ itr.next().getName());
			//System.out.println("here is the name "+ itr.next().getAge());
			
			personData PD = new personData(); //Define the object
			PD = itr.next(); //Assigning the data from ierator to the new object.
			
			System.out.println("from Iterator "+ PD.getAge());
			System.out.println("from iterator "+ PD.getName());
		}
					
	}
	
}	
