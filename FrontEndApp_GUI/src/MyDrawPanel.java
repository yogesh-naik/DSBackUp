import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawPanel extends JPanel  {

	 public void paintComp(Graphics gp){
		 gp.setColor(Color.ORANGE);
		 gp.fillRect(20, 50, 100, 100);
	 }
	 
}
