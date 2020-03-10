import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Karat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] Emp = {
				{ "1", "Yogesh", "Dept1" },
				{ "2", "Naik", "Dept2" }, 
				{ "3", "DJ", "Dept3" },
				{ "4", "DJ1", "Dept4" }, 
				{ "5", "DJ2", "Dept5" },
				{ "6", "DJ3", "Dept6" } 
			};

		String[][] Relation = { { "1", "2" }, { "2", "4" }, { "1", "3" }, };

		AddressReturn(Emp,Relation);
		// String[][] cartoons = {
		// { "Flintstones", "Fred", "Wilma", "Pebbles", "Dino" },
		// { "Rubbles", "Barney", "Betty", "Bam Bam" },
		// { "Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie", "Astro" },
		// { "Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred",
		// "Daphne" } };
		//
		// for (int i = 0; i <= cartoons.length-1; i++) {
		// System.out.print(cartoons[i][0] + ": ");
		// for (int j = 1; j <= cartoons[i].length-1; j++) {
		// System.out.print(cartoons[i][j] + " ");
		// }
		// System.out.println();
		// }
	}

	public static HashMap<String, ArrayList<String>> AddressReturn(String[][] Emp ,String[][] Relation) {
		HashMap<String, ArrayList<String>> rel = new HashMap<String, ArrayList<String>>();

		for (int i = 0; i <= Relation.length - 1; i++) {
			if (rel.containsKey(Relation[i][0])) {
				ArrayList<String> temp = rel.get(Relation[i][0]);
				temp.add(Relation[i][1]);
				rel.put(Relation[i][0], temp);

				if (!rel.containsKey(Relation[i][1])) {
					ArrayList<String> temp1 = new ArrayList<String>();
					temp1.add(Relation[i][0]);
					rel.put(Relation[i][1], temp1);
				}
			} else {
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(Relation[i][1]);
				rel.put(Relation[i][0], temp);

				ArrayList<String> temp2 = new ArrayList<String>();
				temp2.add(Relation[i][0]);
				rel.put(Relation[i][1], temp2);
			}
		}// end of for loop;

		for(int i=0;i<=Emp.length-1;i++){
			if(!(rel.containsKey(Emp[i][0]))){
				ArrayList<String> st = new ArrayList<String>();
				rel.put(Emp[i][0],st);
			}
		}
		
		Set<String> hs = rel.keySet();
		for (String s : hs) {
			ArrayList<String> t2 = new ArrayList<String>();
			t2 = rel.get(s);
			System.out.println("Key " + s);
			System.out.println("Value " + t2);
		}
		
		return rel;
	}
}
