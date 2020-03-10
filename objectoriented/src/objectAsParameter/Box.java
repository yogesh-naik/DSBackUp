package objectAsParameter;

public class Box {
	int a,b,c;
	
	Box(Box ob){
		a = ob.a;
		b=ob.b;
		c=ob.c;
	}
	
	public Box(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		a=i;
		b=j;
		c=k;
	}

	int volume(){
		return a*b*c;
	}

}
