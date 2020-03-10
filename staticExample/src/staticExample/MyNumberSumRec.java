package staticExample;

public class MyNumberSumRec {
	 
    int sum = 0;
     
    public int getNumberSum(int number){
         
        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }
     
   
}