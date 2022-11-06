import java.util.*;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Source extends Observable {
		
	private Double[] y = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
	private ArrayList<Double> q=new ArrayList<Double>(Collections.nCopies(10, 0.0));
	private Double cury;
	
	public void GenerateData(){
	    Random rand = new Random(); //instance of random class
		int upperbound = 9;
		
		int i=0;
		while(true){
			q.set(i%10,100*rand.nextDouble());
		    cury=y[rand.nextInt(upperbound)];
            i++;
		    super.Notify();
		    try {
		    TimeUnit.SECONDS.sleep(20);
		    }
		    catch(Exception e) {
		    	
		    }
	     }
	 } 
	
	public ArrayList<Double>  getData() {
	    return q;
	}
	
	public Double getY() {
	    return cury;
	}
}
