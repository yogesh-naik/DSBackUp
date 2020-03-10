import java.awt.BorderLayout;
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


public class example extends JPanel implements ActionListener   {

	 private JFrame mainFrame;
	 JButton bt;
	 JPanel JP;
	 
	 public void prepareGUI(){
		 mainFrame = new JFrame("Java Swing Examples");
	     	 
		 MyDrawPanel drawPanel = new MyDrawPanel();
		 
		 //Added button
	      bt = new JButton("name");
	      bt.addActionListener(this);     
	      mainFrame.add(bt);	 
	      
	      mainFrame.getContentPane().add(BorderLayout.SOUTH, bt);
	      mainFrame.getContentPane().add(BorderLayout.CENTER,drawPanel);
	      
	      //set frame size
	      mainFrame.setSize(500,400);
	      mainFrame.setVisible(true);
	 }
	 
	 public void actionPerformed(ActionEvent event){
		 bt.setText("I sucessful Software developer");
		 mainFrame.repaint();
	 }
	 
	 public static void main(String[] args){
		 example ex = new example();
		 ex.prepareGUI();
	 }
}
