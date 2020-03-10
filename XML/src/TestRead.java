import java.util.List;


public class TestRead {
	
  public static void main(String args[]) {
    StaXParser read = new StaXParser();
    List<Item> readConfig = read.readConfig("C:\\Users\\ynaik\\workspace\\XML\\src\\input.xml");
    for (Item item : readConfig) {
      System.out.println(item);
    }
  }

}
