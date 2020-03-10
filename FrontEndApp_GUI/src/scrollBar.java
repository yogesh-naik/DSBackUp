import java.applet.Applet;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class scrollBar extends Applet implements AdjustmentListener{

	TextArea ta;
	public void init(){
		Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL,50,15,0,100);
		sb.addAdjustmentListener(this);
		add(sb);
		ta = new TextArea(10,20);
		add(ta);
	}
	//@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		Scrollbar sb = (Scrollbar)e.getAdjustable();
		ta.append("AdjustmentEvent "+sb.getValue()+"\n");
	}
}
