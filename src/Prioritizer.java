import java.util.ArrayList;
import java.util.Comparator;

public interface Prioritizer<T extends Comparable<T>> extends Comparator<T> {
	
	/*
	 * pre-condition: The prioritizer should not be full as per max size defined in the
	 * implementation.
	 * Otherwise the item will not be inserted. 
	 */
	public void insert(T t);

	/*
	 * post-condition: If the item is inserted successfully, the size of the list holding all items
	 * should be increment by one.
	 */
	
	/* pre-condition:  Any of the Prioritizer's implementation should be in any of the phase
	 * i.e., insertion or removal phase, if the flag that holds the value is true,
	 *  it will be in insertion phase otherwise in removal phase  */
	public void changPhase();
	/* post-condition: The flag will be set to true if it was false before i.e., 
	 * will change to removal phase.
	 * The flag will will be false if it was true before i.e., changes to insertion phase.
	 * p */
	
	/*
	 * pre-condition: there must be some items present in the list or queue for
	 * removal.
	 */
	public void removeNextInOrder();
	/* post-condition: the items list size should decrement by one after removal of an item.*/
	
	/*
	 * pre-condition: there must be some items present in the list or queue for
	 * removal.
	 */
	public void removeAny();
	/* post-condition: the items list size should decrement by one after removal of any random
	 * item from the list.*/
	
	/*
	 * pre-condition: the list item must be initialized or populated before
	 * removal.
	 */
	public int size();
	/* post-condition: no such post condition but returns only the size of the items list.*/
	
	/*
	 * pre-condition: no strict pre-condtion only ensures that there is a flag to keep
	 * track of insertion or removal phase.
	 */
	public boolean isInInsertionPhase();
	/* post-condition: no such post condition instead it will return the current flag value;
	 * if true, it means in insertion phase otherwise not*/
	
}
