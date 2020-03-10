
/*
 * Purpose of this class is create generic method.
 * The method below takes any datatype - int,char,string or any object type.
 * The generic method is defined inside a Class which is NOT Generic
 */
public class genericMethod {

	public <T> void PrintArray(T[] arr){
		for(T element : arr){
			System.out.println("Generic Array Value 1 "+element);
		}
	}
	
	/*
	 * Any addition /subtraction of 2 ojects is NOT possible.
	 * hence  T t3  = t1 + t2 not possible
	 * You need to convert them into integer /double
	 */
	public <T extends Number> void addition(T t1 ,T t2){
		T t3;
		System.out.println(t1.doubleValue() + t2.doubleValue());
	}
}
