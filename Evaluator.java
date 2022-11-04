import java.util.*;

public class Evaluator {

	protected Evaluator evaluator;
	private List<Integer> numberList=new ArrayList<Integer>();
	double sum=0.0;
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
		numberList.add(a);
		sum+=a;
		return sum/numberList.size();
	}
}
