import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;
public class Main extends JFrame {

	ArrayList<Double> xcoor=new ArrayList<Double>();
	ArrayList<Double> ycoor=new ArrayList<Double>();
	Main()
	{
		ArrayList<Drawable> d=new ArrayList<Drawable>();
		d.add(new BarPlot(new RectanglePoints(new LinePlot())));
		d.add(new RectanglePoints(new LinePlot()));
		d.add(new LinePlot());
		System.out.println("Frame created");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setLayout(new GridLayout(3,1));
        System.out.println("Frame Set");
        Queue<Double> q=new LinkedList<Double>();
        while(q.size()<10) {
        	q.add(randomGenerator());
        }
        System.out.println("RandomGen");
    	double height=getSize().height;
		double width=getSize().width;
        coordinateCalc(q);
        System.out.println(xcoor);
        System.out.println(ycoor);
        for(Drawable k :d)
        {
        	k.setValues(xcoor,ycoor,width,height);
        }
        System.out.println("Coordinate Cal done");
		for(Drawable k:d )
		{
			add(k);
		}

		System.out.println("Done with  adding");
		 setVisible(true);
			while(q.size()==10)
		    {  coordinateCalc(q);
				for(Drawable k :d)
		        { 
		        	k.setValues(xcoor,ycoor,width,height);
		        }
		    q.remove();
		    q.add(randomGenerator());
		    try
		    {Thread.sleep(1000);
		    }
		    catch(Exception e)
		    {
		    	System.out.println("");
		    }
		    
		    }
        
	}
	public  void coordinateCalc(Queue<Double> q)
	{
		xcoor= new ArrayList<Double>();
		ycoor=new ArrayList<Double>();
		double y[]=new double[q.size()];
		for(int i=1;i<q.size();i++)
			y[i]=i;
		int cx=0;
		//setPreferredSize(new Dimension(640, 480));
		double height=getSize().height/3;
		double width=getSize().width/3;
		System.out.println("height and width"+height+" "+width);
		for(Double x:q)
		{
			
			ycoor.add((x*(height))/100);
		    xcoor.add((y[cx%10]*(width))/2);

			cx++;
		}
	}
	private   double randomGenerator() {
		Random random=new Random();
		double randomVal=(100) * random.nextDouble();
		try{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		return randomVal;
  }
	public static void main(String[] args)
	{
		Main m=new Main();
		
	}
}

