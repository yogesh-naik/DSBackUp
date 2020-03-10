import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class hasCheated {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="aswwwdfdfdf";
		String s2="basdasdsasdf";
		int n=4;
		hasCheated p=new hasCheated();
		
		if(p.hasCheated(s1, s2, n))
		{
			System.out.println("Student Cheated ");
			return;
		}
		
		System.out.println("Not Cheated");
	

	}

	
	
	public boolean hasCheated(String s1,String s2, int N)
	{
		boolean b=true;
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> bl=new ArrayList<String>();
		
		al.addAll(getData(s1,N));
		bl.addAll(getData(s2,N));
		al.retainAll(bl);
		if(al.size()==0)
		{
			b=false;
		}
		//System.out.println(b);
		return b;
		
	}
	
	public List<String> getData(String s,int n)
	{
		ArrayList<String> temp=new ArrayList<String>();
		temp.clear();
		String myStr=Arrays.toString(s.split("(?<=\\G.{4})"));
		//System.out.println(myStr);
		
		Scanner sc=new Scanner(myStr).useDelimiter(",");
		while(sc.hasNext())
		{
			String my=sc.next().replaceAll("\\W", "");
		  
			//System.out.println(my);
			temp.add(my);
		}
		
		
		return temp;
	}

}
