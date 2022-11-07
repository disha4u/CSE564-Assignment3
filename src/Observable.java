import java.util.*;

/**
*@author Ramachandra Sai
*@author Disha Agarawal
*@author Harshit 
*/
public abstract class Observable  {
	private List<Observer> observers=new ArrayList<Observer>();
	
	/**
	* Notifies observers the current state
	*/
	public void Notify()
	{
		for(Observer o: observers)
		{
			o.Update(this);
		}
		
	}
	
	/**
	* adds observer to the list of observers
	* @param observer object
	*/
	public void addObservers(Observer o)
	{
		observers.add(o);
	}
	
	/**
	* removes observer from the list of observers
	* @param observer object
	*/
	public void removeObservers(Observer o)
	{
		observers.remove(o);
	}
}
