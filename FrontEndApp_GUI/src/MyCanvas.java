import java.awt.Canvas;
import java.awt.Graphics;


public class MyCanvas extends Canvas {
	@Override
	public void paint (Graphics g){
		g.drawString("Here I am", 5, 25);
	}
}
