import java.util.*;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Source extends Observable {
		
	Double[] y = {1, 2, 3, 4,5,6,7,8,9,10};
	ArrayList<Double> q=new ArrayList<Double>(Collections.nCopies(10, 0.0));
	Double cury;
	
	   public void GenerateData(){
		      Random rand = new Random(); //instance of random class
		      double upperbound = 9;
		        //generate random values from 0-24
		      i=0;
		      while(true){
		      q.set(i%10,100*rand.nextDouble());
		      cury=y[rand.nextInt(upperbound)];
		      i++;
		      Notify();
		      TimeUnit.SECONDS.sleep(20);
		      }
	   } 
       public Double getData() {
    	   return q;
       }
       public Double getY() {
    	   return cury;
       }
}
