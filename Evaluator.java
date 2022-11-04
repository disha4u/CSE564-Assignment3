import java.util.*;

public class Evaluator {

	protected Evaluator evaluator;
	//private List<Double> numberList=new ArrayList<Integer>();
	Double sum=0.0;
	int count=1;
	private Evaluator()
	{
		
	}
	public Evaluator getInstance()
	{
		if(evaluator==null)
			evaluator= new Evaluator();
		return evaluator;
	}
	public double ComputeAvg(int a)
	{
		//numberList.add(a);
		sum+=a;
		count++;
		return sum/count;
	}
}
