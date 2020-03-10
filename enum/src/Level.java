
public enum Level {

	BEGINNER("beginner"),
	YOGESH("yogesh"),
	IF,DO,WHILE,YES,MIN;
	
	String color;
	
	public String getColor(){
		return color;
	}
	Level(String color){
		this.color = color;
	}
	static {
		System.out.println("static init block");
	}
	
	Level(){
		System.out.println("Constructor");
	}
//	public static void main(String[]args){
//		
//		Level l = Level.BEGINNER;
//		System.out.println(l.getColor());
//	}
}
