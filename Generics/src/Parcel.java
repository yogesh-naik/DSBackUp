
/*
 * This Simple class of generic class
 * Ref --
 * http://www.tutorialspoint.com/java/java_generics.htm
 */
public class Parcel<T> {
	T t;
	
	//Gift gt = new Gift();
	public void set( T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
	
}
