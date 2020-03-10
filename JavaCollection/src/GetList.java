import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class GetList {

	public static void main(String[] args) 
	{
		Character arr1[]={'A','A','B','L','C','F','D','E','F','D','Z','R'};
		Character arr2[]={'C','E','X','Z','M','X','P','L','M','N','S','T','P','B','A'};
		List<Character> l1=new ArrayList<Character>();
		List<Character> l2=new ArrayList<Character>();
		l1=Arrays.asList(arr1);
		l2=Arrays.asList(arr2);
		System.out.println(method1(l1,l2));
				
	}
	static ArrayList<Character> method1(List<Character> a1,List<Character> a2)
	{
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for ( char a : a1 )
		{
             
			 if(hm.containsKey(a))
			{
                 int x=hm.get(a);
				 x++;
				 hm.put(a,x);
			 }
			 else
			{
				 hm.put(a,1);
			}
		}
		for(char b:a2)
		{
            if(hm.containsKey(b))
			{
                 int x=hm.get(b);
				 x++;
				 hm.put(b,x);
			 }
			 else
			{
				 hm.put(b,1);
			}
		}
       ArrayList<Character> nal=new ArrayList<Character>();
	   Set<Character> s=hm.keySet();
	   for(char c : s)
		{
		   if(hm.get(c)==2)
			   nal.add(c);
	   }
	   return nal;
	}
	
	
}
