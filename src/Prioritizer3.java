import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
/*
 * This class is implemented by Poojitha
 */
public class Prioritizer3 implements Prioritizer<String> {
	private boolean Flag=true;
	private List<String> data = new ArrayList<>();
	private int max_size=10;
	
	public Prioritizer3(int max_size) {
		this.max_size=max_size;
	}

	@Override
	public void insert(String t) {
		if(data.size()!=this.max_size)
		{
			data.add(t);
			System.out.println("Item inserted successfully!");
		}
		else {
			System.out.println("LIST FULL: Can't insert new items. Remove a few items to insert new ones!");
		}
	}
	@Override
	public void changPhase() {
		Flag=!Flag;
	}

	@Override
	public void removeNextInOrder() {
		// TODO Auto-generated method stub
		data.remove(data.size()-1);
	}

	@Override
	public void removeAny() {
		Random random = new Random();
		int value = random.nextInt(data.size() - 0 ) + 0;
		data.remove(value);
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public boolean isInInsertionPhase() {
		// TODO Auto-generated method stub
		return Flag;
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return (o1.compareTo(o2));
	}

}