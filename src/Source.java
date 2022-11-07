import java.util.*;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Source extends Observable {
		
	
	private Queue<Double> q;
	private double cur_value;
	
	public void GenerateData(){
	    Random rand = new Random(); //instance of random class
		
		
		
		while(true){
			if (q.size()==10) {
				q.remove();
			}
			cur_value=100*rand.nextDouble();
			q.add(cur_value);
		    
           
		    super.Notify();
		    try {
		    TimeUnit.SECONDS.sleep(20);
		    }
		    catch(Exception e) {
		    	
		    }
	     }
	 } 
	
	public Queue getData() {
	    return q;
	}
	public double getValue() {
	    return cur_value;
	}
	
	
}
