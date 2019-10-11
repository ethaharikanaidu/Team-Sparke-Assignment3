import java.util.ArrayList;
import java.util.Comparator;

public interface Prioritizer<T extends Comparable<T>> extends Comparator<T> {
	public void insert(T t);
	public void changPhase();
	public void removeNextInOrder();
	public void removeAny();
	public int size();
	public boolean isInInsertionPhase();

}
