import java.util.*;
import java.util.Collections;
import java.util.Queue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
*@author Ramachandra Sai
*@author Disha Agarawal
*@author Harshit 
*/

public class PlotPanel extends JPanel implements Observer {
	ArrayList<Drawable> d=new ArrayList<Drawable>();
	ArrayList<Double> q=new ArrayList<Double>(Collections.nCopies(10, 10.0));
	ArrayList<Double> xcoor=new ArrayList<Double>();
	ArrayList<Double> ycoor=new ArrayList<Double>();
	double height;
	double width;
	Evaluator e= Evaluator.getInstance();
	
	
	PlotPanel()
	{
		setPreferredSize(new Dimension(500,500));
    	d.add(new BarPlot(new RectanglePoints(new LinePlot())));
		d.add(new RectanglePoints(new LinePlot()));
		d.add(new LinePlot());
	   
	}
	
	/**
	* updates the queue of random generated data points
	* @param instance of Observable- Source 
	*/
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		this.q=((Source)o).getData();

		if(q.size()==10) {
			coordinateCalc();
			for(Drawable k:d )
			{

				height=getSize().height/4;
				width=getSize().width;
				k.setValues(xcoor,ycoor,width,height,e.avg);

			}
		}
	}
	

	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("paint cim");
		setSize(600,600);
		setLayout(new GridLayout(3,1));
		coordinateCalc();
		for(Drawable k:d )
		{
			height=getSize().height/4;
			width=getSize().width;
			k.setValues(xcoor,ycoor,width,height,0.0);
			k.draw(g);
		}

	
		for(Drawable k:d )
		{
			add(k);
		}
    	
	}
	
	/**
	* scales data points
	*/
    public  void coordinateCalc()
	{
		xcoor= new ArrayList<Double>();
		ycoor=new ArrayList<Double>();
		double y[]=new double[q.size()];
		for(int i=1;i<q.size();i++)
			y[i]=i;
		int cx=0;
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
