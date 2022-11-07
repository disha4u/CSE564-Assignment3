
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.awt.*;

import javax.swing.*;

public class PlotPanel extends JPanel implements Observer {
	ArrayList<Drawable> d=new ArrayList<Drawable>();
	Queue<Double> q;
	ArrayList<Double> xcoor=new ArrayList<Double>();
	ArrayList<Double> ycoor=new ArrayList<Double>();
	double height;
	double width;
	Evaluator e= Evaluator.getInstance();
	
	@Override
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		this.q=((Source)o).getData();
		if(q.size()==10) {
			coordinateCalc();
			for(Drawable k:d )
			{
				k.setValues(xcoor,ycoor,width,height,e.avg);
			}
		}
	}
    public void drawGraphs() {
    	
    	d.add(new BarPlot(new RectanglePoints(new LinePlot())));
		d.add(new RectanglePoints(new LinePlot()));
		d.add(new LinePlot());
		setSize(600,600);
		
    	JButton btn=new JButton();
    	for(Drawable k:d )
		{
			add(k);
		}
    	add(btn);
    	setLayout(new GridLayout());
    	
    }
    public  void coordinateCalc()
	{
		xcoor= new ArrayList<Double>();
		ycoor=new ArrayList<Double>();
		double y[]=new double[q.size()];
		for(int i=1;i<q.size();i++)
			y[i]=i;
		int cx=0;
		//setPreferredSize(new Dimension(640, 480));
		height=getSize().height/4;
		width=getSize().width/4;
		System.out.println("height and width"+height+" "+width);
		for(Double x:q)
		{
			
			ycoor.add((x*(height))/100);
		    xcoor.add((y[cx%10]*(width))/2);

			cx++;
		}
		System.out.println("Done with adding");
	}
}
