import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.*;
public abstract class DrawableDecorator extends Drawable {
	
	protected Drawable drawable;
	DrawableDecorator(Drawable drawable)
	{
		this.drawable=drawable;
		this.setBackground(new Color(200,200,100));
		System.out.println("Drawble "+this.drawable.toString());
	}
//    @Override
//    protected void paintComponent(Graphics g)
//    	{ super.paintComponent(g);
////    	System.out.println("fgdf");
//    	System.out.println("this drawable "+this.drawable.toString());
//    	this.drawable.draw(g);
////    	 System.out.println("Done with Paint Super Component");
//    	}
    
	public void setValues(ArrayList<Double> xcoor,ArrayList<Double> ycoor,double maxXcoor,double maxYcoor,double avg)
	{
		this.drawable.setValues(xcoor,ycoor,maxXcoor,maxYcoor,avg);
	}
//    @Override
	public void draw(Graphics g)
	{
		System.out.println("Drawing this comp");
		this.drawable.draw(g);
	}

}
