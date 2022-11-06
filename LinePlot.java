import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.util.ArrayList;
public class LinePlot extends Drawable{
	
	
	LinePlot()
	{
		System.out.println("Line Plot");
	}
	@Override
    protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(new Color(10,200,200));
		System.out.println("paint compon");
		this.draw(g);
	}
	public void draw(Graphics g)
	{
		System.out.println("Draw In Line PLot");
		  Graphics2D graphics = (Graphics2D) g.create();
		double height=getSize().height;
		double width=getSize().width;
		Path2D polyline = new Path2D.Double();
		
//		System.out.println("  Xcoor"+xcoor.size());
		if(xcoor.size()==10)
		{
			polyline.moveTo(xcoor.get(0),ycoor.get(0));
			for(int i=1;i<xcoor.size();i++)
			{ 
				System.out.println(xcoor.get(i)+" "+ycoor.get(i));
			polyline.lineTo(xcoor.get(i),ycoor.get(i));
			
			}
			graphics.draw(polyline);
			this.repaint();
		}
//		System.out.println("Done with painting");
	}
	public void setValues(ArrayList<Double> x,ArrayList<Double> y,double maxX,double maxY)
	{
//		super.setValues(x,y,maxX,maxY);
		xcoor=x;
		ycoor=y;
		maxXcoor=maxX;
		maxYcoor=maxY;
		
	}
}

