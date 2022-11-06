
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class PlotPanel extends JPanel implements Observer {
	ArrayList<Double> q=new ArrayList<Double>(Collections.nCopies(10, 0.0))
	Double ycoor;
	@Override
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		this.data=((Source)o).getData();
		this.ycoor=((Source)o).getY();
	}

}
