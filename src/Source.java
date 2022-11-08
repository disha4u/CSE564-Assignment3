import java.util.*;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
*@author Ramachandra Sai
*@author Disha Agarawal
*@author Harshit 
*/
public class Source extends Observable {
		
	
	private ArrayList<Double> q=new ArrayList<Double>(Collections.nCopies(10, 0.0));
	private double cur_value;
	
	/**
	* generates random data points in an infinite cycle
	*/
	public void GenerateData(){
		
	    Random rand = new Random(); //instance of random class
		
		int i=0;
		
		while(true){
			cur_value=100*rand.nextDouble();
			q.set(i%10,cur_value);
			i++;
		    super.Notify();
		    try {
		    Thread.sleep(1000);
		    }
		    catch(Exception e) {
		    	
		    }
	     }
	 } 
	
	/**
	* @return queue of generated random data points
	*/
	public ArrayList<Double> getData() {
	    return q;
	}
	
	/**
	* @return last generated random data point 
	*/
	public double getValue() {
	    return cur_value;
	}
	
	
}
