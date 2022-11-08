
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener {

	
	
    Main(){
    	
		Source ds=new Source();
		PlotPanel pp =new PlotPanel();
		ds.addObservers(pp);
		Evaluator ev=Evaluator.getInstance();
		ds.addObservers(ev);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pp);
		pack();
		
		setVisible(true);
		
        ds.GenerateData();
    }
	
	public static void main(String[] args)
	{
		
		
    	
		Main m=new Main();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

