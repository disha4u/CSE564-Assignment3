import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener {

	private boolean state = false;
	Main(JPanel pp, Source ds)
	{
		setSize(600,600);
//	    setLayout(new GridLayout(3,1));
//		pp.setSize(new Dimension(getSize().height,getSize().width));
		setLayout(new BorderLayout());
		add(pp, BorderLayout.CENTER);
	
//		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		pack();
//		  add(pp);
        setVisible(true);
        JButton btn=new JButton("Click Me");
        add(pp);
		pp.add(new JPanel().add(btn));
       
//      autoButton = new JButton("Auto");
//      add(autoButton);
      btn.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
        	System.out.println("Action performed");
        	  state = true;
//          	SwingUtilities.updateComponentTreeUI(this);

//          	              
        	  }
      }
      );
//      if(true) {
      System.out.println("State "+state);
    	while(true) {
    		if(state) {
      		  System.out.println("Enter State");
      		  ds.GenerateData();
//      		  pp.repaint();
      		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				
			}
      	  }
    	}	
    	}
      //      }
//        ds.GenerateData();
//	}
	/**
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
		
		Main m=new Main(pp,ds);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}