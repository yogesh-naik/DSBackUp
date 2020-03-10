import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class testPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p[] = new Phone[3];
		
		Phone p1 = new Phone();
		p1.number = 12121;
		p1.setName("zb");
		
		Phone p2 = new Phone();
		p2.number = -11211;
		p2.setName("bb");
		
		Phone p3 = new Phone();
		p3.number = -11;
		p3.setName("nnn");
		
		p[0] =p1;
		p[1]=p2;
		p[2]=p3; 
		
		Arrays.sort(p);
		
		int sd[] = new int[5];
		
		String[] pf = new String[5];
		
		

		//p1.compare(p2, p3);
		
//	
//		
//		ArrayList<Phone> list = new ArrayList<Phone>();
//		list.add(p3);
//		list.add(p2);
//		list.add(p1);
//		
//		System.out.println("Before String sort");
//		
//		for(Phone pt :list)
//			System.out.println(pt.getNumber() + "  " +pt.getName());
//		
//		System.out.println("After sort String \n");
//		
//		Collections.sort(list);
//		for(Phone pt :list)
//			System.out.println(pt.getNumber() + "  " +pt.getName());
//		
		for(int i=0;i<=p.length-1;i++)
			System.out.println(p[i].getNumber());
		
		/*
		 * Object of class which contains generic method
		 * Generic method can take any Type array as parameter
		 * e.g Integer,string,character or may be object array
		 */
		genericMethod gp = new genericMethod();
		Integer ip[] = { 1,4,3};
		//gp.PrintArray(ip);
		
		gp.addition(2, 5);

		/*
		 * Object of Generic Class
		 * Use this class to create object for any type - Integer,character , String etc
		 */
		Parcel<String> str = new Parcel<String>();
		str.set("Yogesh");
		System.out.println("From "+str.get());
	
	}
	

}
