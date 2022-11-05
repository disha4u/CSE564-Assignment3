import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.util.*;

import java.util.concurrent.TimeUnit;
 
public class Curve extends JFrame {
	
	

    public static void main(String[] args) {
        final JFrame f = new JFrame("My curve");
        f.setSize(200, 200);
			
        f.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D graphics = (Graphics2D) g.create();// your graphics object
				
				Queue<Double> q=new LinkedList<Double>();
				
				int count=0;
				while(q.size()<10)
				{
					q.add(randomGenerator());
					count++;
				}
				double[] y = {1, 2, 3, 4,5,6,7,8,9,10};
				
				for(double x: q)
					System.out.println(x);
				if(q.size()==10)
                {
					System.out.println("In qhule");
			//	double[] x = {50, 100, 300, 500}; // x coordinates of polyline
                 // y coordinates of polyline
				 int cx=0;
				  cx++;
                Path2D polyline = new Path2D.Double();
                //polyline.moveTo(x[0], y[0]);
				 polyline.moveTo(q.remove(), y[0]);
				
                for (double x:q) {
					System.out.println(x+" "+(y[cx%10]/10)*200);
                    polyline.lineTo(x*2, (y[cx%10]/10)*200);
					count++;
					cx++;
                }
                graphics.draw(polyline);
                graphics.dispose();
			//	q.remove();
				//q.add(randomGenerator());
				}
            }
        });
        f.setVisible(true);

    }
	private static  double randomGenerator() {
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
}
