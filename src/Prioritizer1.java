import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Prioritizer1  implements Prioritizer<Integer> {
	
	private boolean Flag=true;
	private List<Integer> data = new ArrayList<Integer>();

	@Override
	public void insert(Integer t) {
		data.add(t);
	}

	@Override
	public void changPhase() {
		if(Flag)
			{
			Collections.sort(data);
			}
		Flag=!Flag;
	}

	@Override
	public void removeNextInOrder() {
		// TODO Auto-generated method stub
		if(!Flag) {
			data.remove(data.size()-1);
		}
	}

	@Override
	public void removeAny() {
		if(!Flag) {
			Random random = new Random();
			int value = random.nextInt(data.size() - 0 ) + 0;
			data.remove(value);
			
		}
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
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return (o1.compareTo(o2));
	}


}