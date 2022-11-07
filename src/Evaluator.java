import java.util.*;

public class Evaluator implements Observer {

	protected static Evaluator evaluator;
	//private List<Double> numberList=new ArrayList<Integer>();
	static double sum=0;
	static int count=0;
	static double avg;
	private Evaluator()
	{
		
	}
	public static Evaluator getInstance()
	{
		if(evaluator==null)
			evaluator= new Evaluator();
		return evaluator;
	}
	public void ComputeAvg(double a)
	{
		//numberList.add(a);
		count++;
		sum+=a;
		avg= sum/count;
	}
	public void Update(Observable o) {
		// TODO Auto-generated method stub
		ComputeAvg(((Source)o).getValue());
	}
}
