import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Prioritizer2 implements Prioritizer<Character> {
	
	private boolean Flag=true;
	private List<Character> data = new ArrayList<Character>();

	@Override
	public void insert(Character t) {
		data.add(t);
		Collections.sort(data);
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
	public int compare(Character o1, Character o2) {
		// TODO Auto-generated method stub
		return (o1.compareTo(o2));
	}

}