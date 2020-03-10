import java.applet.Applet;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Labeltest extends Applet implements
			ActionListener,ItemListener{

	Button b1;
	Label l1;
	MyCanvas canvas;
	public void start() {
		String s = "This is mine";

		//Label
		l1 = new Label(s, Label.RIGHT);		
		add(l1);
		
		//Button
		b1 = new Button("start");
		b1.addActionListener(this);
		add(b1);
		
		//Checkbox
		Checkbox cb3 = new Checkbox("Apple");
		//cb3.addItemListener(this);
		add(cb3);
		
		//Canvas
		canvas = new MyCanvas();
		canvas.setBackground(Color.YELLOW);
		canvas.setSize(130,130);
		add(canvas);
		
		//DropBox = Choice
		
		Choice c1 = new Choice();
		c1.addItem("RED");
		c1.addItem("GREEN");
		c1.addItem("BLUE");
		c1.addItemListener(this);
		add(c1);		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		boolean t = false;
		
		if(e.getActionCommand() =="start")
			b1.setLabel("Stop");
		else
			b1.setLabel("start");
		}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
//		Checkbox  c1 = (Checkbox)e.getItemSelectable();
//		if(c1.getLabel() =="Apple")
//			l1.setText(c1.getLabel());
//	}
//	@Override
//	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Choice  c = (Choice)e.getItemSelectable();
		if(c.getSelectedItem()==("RED")){
			canvas.setBackground(Color.RED);
		}
		if(c.getSelectedItem() =="BLUE"){
			canvas.setBackground(Color.BLUE);
		}
		if(c.getSelectedItem() =="GREEN"){
			canvas.setBackground(Color.GREEN);
		}
	}
	
//	//@Override
//	public void paint (Graphics g){
//		g.drawString("Here I am", 15, 125);
//	}
	
}
