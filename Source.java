import java.util.Random;
public class Source extends Observable {
	private Double x;
	   public void GenerateData(){
		      Random rand = new Random(); //instance of random class
		      double upperbound = 25.00;
		        //generate random values from 0-24
		      while(true){
		      x=rand.nextDouble(upperbound);
		      Notify();
		      }
	   } 
       public Double getpoint() {
    	   return x;
       }
}
