
public class TP {

static int x = 0;
static int y = 0;		
	TP(){
		x++;
	}
	public static  void getX(){		
		//System.out.println("here it is "+x);
	}
	
	static void getY(){
		System.out.println(y);
		getX();
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		TP a = new TP();
		TP b = new TP();
		TP c = new TP();
		
		a.getX();
		
		for(int i=0;i<=10;i++){
			playMeasures:
			{
				System.out.println("here "+i);			
				
					
			for(int j=0;j<=10;j++){
				if(i>2)
					break playMeasures;
				System.out.println("YO "+j);continue;
			}
			}
		}
		
		
		
		try{
			int ap[] = {1,2,3,4,5};
			for(int i=0;i<=ap.length;i++){
				System.out.println(ap[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
	}//End of main

}
