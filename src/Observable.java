import java.util.*;
public abstract class Observable  {
	private List<Observer> observers=new ArrayList<Observer>();
	public void Notfiy()
	{
		for(Observer o: observers)
		{
			o.Update(this);
		}
		
	}
	public void addObservers(Observer o)
	{
		observers.add(o);
	}
	public void removeObservers(Observer o)
	{
		observers.remove(o);
	}
}
