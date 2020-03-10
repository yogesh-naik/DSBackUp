package objectoriented;

public class Test {
	
public int a=6;
	
	Test(){} //Constructor
	
	Test (int i){
		a = i;
	}
	
	Test incrTen(){
		Test temp = new Test(a);
		a = a+10;
		return temp;		
	}
	
	public int getA(int p){
		return a=p;
	}

}
