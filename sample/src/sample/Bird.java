package sample;

public class Bird {
	
	private static int id = 0;
	  private String kind;

	  public Bird(String requiredKind)
	  {
	    id = id + 1;
	    kind = requiredKind;
	  }

	  public String toString()
	  {
	    return "Kind: " + kind + ", Id: " + id + "; ";
	  }

	  public static void main(String [] args)
	  {
	    Bird [] birds = new Bird[2];
	    birds[0] = new Bird("falcon");
	    birds[1] = new Bird("eagle");
	    for (int i = 0; i < 2; i++)
	    System.out.print(birds[i]);
	    System.out.println();
	  }

}
