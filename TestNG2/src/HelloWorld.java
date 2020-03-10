import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class HelloWorld {

	@Before
	public void yo(){
		System.out.println("YES");
	}
	@Test
	public void yesYes(){
		System.out.println("You are going to Rock the world!");
	}

	@BeforeClass
	public static void yo3(){
		System.out.println("YE2222");
	}
}
