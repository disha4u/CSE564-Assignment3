
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.*;

public abstract class Drawable extends JPanel
{
	ArrayList<Double> xcoor;//= new ArrayList<Double>();
	ArrayList<Double> ycoor;//=new ArrayList<Double>();
	double maxXcoor;
	double maxYcoor;
	double avg;
	public  abstract void draw(Graphics g);
	public abstract void setValues(ArrayList<Double> xcoor,ArrayList<Double> ycoor,double maxXcoor,double maxYcoor,double avg);

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        }
}
