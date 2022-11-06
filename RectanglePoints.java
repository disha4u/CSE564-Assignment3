import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
public class RectanglePoints extends DrawableDecorator{
	
	RectanglePoints(Drawable drawable)
	{
		super(drawable);
		this.setBackground(new Color(200,100,200));
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
				graphics.fill(new Rectangle2D.Double(xcoor.get(i), ycoor.get(i), 5, 5));
			}
			
			
			this.repaint();
		}
	}
	@Override
	public void setValues(ArrayList<Double> x,ArrayList<Double> y,double maxX,double maxY)
	{
		super.setValues(x,y,maxX,maxY);
		xcoor=x;
		ycoor=y;
		maxXcoor=maxX;
		maxYcoor=maxY;
		
	}
}
