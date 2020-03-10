
public class Square {

	int x;
	int y;
	
	public Square (int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public Square (int x){
		this.x = x;
		this.y = x;
	} 
	
	public Square (){}
	
	public void Area(){
		int area  = x*y;
		System.out.println(area);
	}
}
