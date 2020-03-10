import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class SecondMostRepeatedWord {

	/*
	 * Write second most repeating word in a string eg aaa bbb ccc aaa bbb aaa
	 * answer - bbb
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> studentPerformanceMap = new HashMap<String, String>();

		// Adding elements to HashMap

		studentPerformanceMap.put("John Kevin", "Average");

		studentPerformanceMap.put("Rakesh Sharma", "Good");

		studentPerformanceMap.put("Prachi D", "Very Good");

		studentPerformanceMap.put("Ivan Jose", "Very Bad");

		studentPerformanceMap.put("Smith Jacob", "Very Good");

		studentPerformanceMap.put("Anjali N", "Bad");

		// Getting Set of keys

		Set<String> keySet = studentPerformanceMap.keySet();

		// Creating an ArrayList of keys

		ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
		Collections.sort(listOfKeys);

		System.out.println("ArrayList Of Keys :");

		for (String key : listOfKeys) {
			System.out.println(key);
		}

	}

}
