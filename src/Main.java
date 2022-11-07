
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener {

	/**
	Main()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        double height;
    	double width;
        setLayout(new GridLayout(3,1));
        System.out.println("Frame Set");
        Queue<Double> q=new LinkedList<Double>();
        while(q.size()<10) {
        	double val=randomGenerator();
        	q.add(val);
        	if(q.size()==0)
        		avg=val;
        	else
        	avg=(avg*(q.size()-1)/q.size())+val/q.size();
        }
        System.out.println("RandomGen");
//    	double height=getSize().height;
//		double width=getSize().width;
        coordinateCalc(q);
        System.out.println(xcoor);
        System.out.println(ycoor);
        System.out.println(ycoor);
        System.out.println("avg "+avg);  
        for(Drawable k :d)
        { height=getSize().height;
		 width=getSize().width;
        	k.setValues(xcoor,ycoor,width,height,avg);
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
			    	 height=getSize().height;
					 width=getSize().width;
		        	k.setValues(xcoor,ycoor,width,height,avg);
		        }
		    q.remove();
		    double val=randomGenerator();
		    q.add(val);
		    avg=(avg*(q.size()-1)/q.size())+val/q.size();
		    System.out.println("avg "+avg);
		    try
		    {Thread.sleep(1000);
		    }
		    catch(Exception e)
		    {
		    	System.out.println("");
		    }
		    
		    }
        
	}
	public void plotGraphs()
	{
//		System.out.println()
//		   q=new LinkedList<Double>();
//	        while(q.size()<10) {
//	        	q.add(randomGenerator());
//	        }
//	        System.out.println("RandomGen");
	    	double height=getSize().height;
			double width=getSize().width;
//	        coordinateCalc(q);
//	        System.out.println(xcoor);
//	        System.out.println(ycoor);
//	        for(Drawable k :d)
//	        {
//	        	k.setValues(xcoor,ycoor,width,height);
//	        }
//	        System.out.println("Coordinate Cal done");
//			for(Drawable k:d )
//			{
//				add(k);
//			}
//			 setVisible(true);
			System.out.println("Done with  adding");
			 setVisible(true);
				while(q.size()==10)
			    {  coordinateCalc(q);
					for(Drawable k :d)
			        { 
			        	k.setValues(xcoor,ycoor,width,height,avg);
//			        	System.out.println("Done with Settib");
			        }
			    q.remove();
			    double val=randomGenerator();
			    q.add(val);
			  
			    try
			    {Thread.sleep(1000);
			    }
			    catch(Exception e)
			    {
			    	System.out.println("");
			    }
			    
			    }

	}
	
	**/
	
	public static void main(String[] args)
	{
		Source ds=new Source();
		PlotPanel pp =new PlotPanel();
		ds.addObservers(pp);
		Evaluator e=Evaluator.getInstance();
		ds.addObservers(e);
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

