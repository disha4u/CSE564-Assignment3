import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.awt.Color;
public class BarPlot extends DrawableDecorator{
	
	BarPlot(Drawable drawable)
	{
		super(drawable);
//		System.out.println(" Bar PLot init");
	}
	@Override
    protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.draw(g);
	}
	public void draw(Graphics g)
	{
		super.draw(g);
		  Graphics2D graphics = (Graphics2D) g.create();
		 
		if(xcoor.size()==10)
		{	
			
			
			for(int i=0;i<xcoor.size();i++)
			{
//				 System.out.println("Drwa in  Barplot");
				//graphics.draw(new Rectangle2D.Double(xcoor.get(i), ycoor.get(i), 10, 10));
				  Rectangle2D rect =new Rectangle2D.Double(xcoor.get(i) , ycoor.get(i)+5, 8,maxYcoor-ycoor.get(i));
				 graphics.draw(rect);
				 graphics.setPaint(Color.gray);
				 graphics.fill(rect);
			}
			
			
			this.repaint();
		} 
	}
	public void setValues(ArrayList<Double> x,ArrayList<Double> y,double maxX,double maxY,double avg)
	{
		super.setValues(x,y,maxX,maxY,avg);
	
		this.avg=avg;
		xcoor=x;
		ycoor=y;
		maxXcoor=maxX;
		maxYcoor=maxY;
		
	}
}
