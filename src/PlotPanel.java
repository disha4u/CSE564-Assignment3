
import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;

import javax.swing.*;

public class PlotPanel extends JPanel implements Observer {
	ArrayList<Double> data=new ArrayList<Double>(Collections.nCopies(10, 0.0));
	Double ycoor;
	@Override
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		this.data=((Source)o).getData();
		this.ycoor=((Source)o).getY();
	}
    public void drawGraphs() {
    	Drawable line=new LinePlot();
    	DrawableDecorator square=new RectanglePoints(new LinePlot());
    	DrawableDecorator bar=new BarPlot(new LinePlot());
    	add(bar);
    	add(square);
    	add(line);
    	JButton btn=new JButton();
    	add(btn);
    	setLayout(new GridLayout());
    	
    }
}
