import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator implements ActionListener {

	Button b1,b2,b3,b4,b5,Add,Result;
	TextField tf1;
	String text;
	ArrayList<String>al = new ArrayList<String>();
	Label l1  = new Label();
	private Frame mainFrame;
	GridLayout g;
	 
	Calculator(){
	//public void init() {
		
		mainFrame = new Frame("My calculator");	
		
		Panel p = new Panel();
		p.setSize(300,300);
		p.setLayout(new BorderLayout());
		mainFrame.setLayout(new FlowLayout());
		    
		tf1 = new TextField("", 20);
		mainFrame.add(tf1);

		// Button
		b1 = new Button("1");
		b1.addActionListener(this);
		
		b2 = new Button("2");
		b2.addActionListener(this);
		
		b3 = new Button("3");
		b3.addActionListener(this);
		
		b4 = new Button("4");
		b4.addActionListener(this);
		
		b5 = new Button("5");
		b5.addActionListener(this);
		
		Add = new Button("+");
		Add.addActionListener(this);
		
		g = new GridLayout(4,4,10,20);
		p.setLayout(g);
		
		Result = new Button("=");
		Result.addActionListener(this);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(Add);
		p.add(Result);
		
		mainFrame.add(p);
		mainFrame.setSize(200, 200);
		mainFrame.setVisible(true);
	//}
	
	 }//Calculator ended

	public void actionPerformed(ActionEvent event) {		
	
		StringBuffer sb;
		if (event.getActionCommand() == "1") {
			text = b1.getLabel();
			setTEXT(text);
		}
		if (event.getActionCommand() == "2") {
			text = b2.getLabel();
			setTEXT(text);
		}
		if (event.getActionCommand() == "3") {
			text = b3.getLabel();
			setTEXT(text);
		}
		if (event.getActionCommand() == "4") {
			text = b4.getLabel();
			setTEXT(text);
		}
		if (event.getActionCommand() == "+") {
			al.add(tf1.getText());
			tf1.setText("");			
		}
		if (event.getActionCommand() == "=") {
			al.add(tf1.getText());
			Addition();
		}
	}// End of Actionperformed

	/*
	 *  Add 2 numbers
	 */
	public void Addition(){
		int sum=0;
		if(al.size()==0)
			tf1.setText(Integer.toString(0));
		for(int i=0;i<=al.size()-1;i++){
			int temp = Integer.parseInt(al.get(i));
			sum = sum + temp;
		}
		System.out.println(sum);
		tf1.setText(Integer.toString(sum));
		al.clear();
	}
	

	
	//Method to add digits from screen
	public void setTEXT(String p){
		String t = tf1.getText();
		tf1.setText(t+text);
	}
	
	 public static void main(String[] abc)
	    {
	        Calculator v = new Calculator();
	    }
}
