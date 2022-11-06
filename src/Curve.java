import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.util.*;
import javax.swing.JPanel;
import java.util.concurrent.TimeUnit;
 import java.awt.geom.Rectangle2D;
public class Curve extends JFrame {
	
	

    public static void main(String[] args) {
        final JFrame f = new JFrame("My curve");
        f.setSize(1000, 1000);
			
		//JPanel p=new Panel();
        f.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				System.out.println("Paint Component");
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
				int px=0;
				Path2D polyline = new Path2D.Double();
				if (q.size()==10 && px<30)
                {
				System.out.println("In ");
	            
				polyline.moveTo(q.remove(), y[0]);
				int cx=1;
                for (double x:q) {
					double height=getSize().height;
					double width=getSize().width;
					double ycoor=(x*(getSize().height-10))/100;
					double xcoor=(y[cx%10]*(getSize().width-10))/10;
					graphics.fill(new Rectangle2D.Double(xcoor, ycoor, 10, 10));
					graphics.draw(new Rectangle2D.Double(xcoor , ycoor, 8,height-ycoor));
					System.out.println(xcoor+" "+(ycoor));
                    polyline.lineTo(xcoor,ycoor);
					count++;
					cx++;

                }
				graphics.draw(polyline);
				graphics.dispose();
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
				}
               
				System.out.println(q.size());
				q.add(randomGenerator());
				System.out.println("Added Random Generator "+q.size());
				px++;
					this.repaint();
			
				}
				
				System.out.println("Done with Plotting");
				graphics.dispose();
			
            }
			
        });
		//f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//f.setUndecorated(true);
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
