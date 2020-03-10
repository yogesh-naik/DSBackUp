
public class FooRunable implements Runnable{

	public void run(){
	for(int i=0;i<6;i++){
		try {
			Thread.sleep(2000);
			System.out.println("Running running" + i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}
