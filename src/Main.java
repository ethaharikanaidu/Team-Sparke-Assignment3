import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
	
	public static void main(String args[])
	{
		System.out.println("-----------------------------------");
		System.out.println("Prioritizer1 implementation demo - Order preserved after insertion phase");
		System.out.println("-----------------------------------");
		System.out.println("Inserting integer values....");
		Prioritizer p1 = new Prioritizer1(8);
		p1.insert(1);
		p1.insert(4);
		p1.insert(6);
		p1.insert(2);
		p1.insert(0);
		System.out.println("Total values inserted:"+p1.size());
		System.out.println("Changing to removal phase...");
		p1.changPhase();
		System.out.println("Checking current Phase...");
		if(p1.isInInsertionPhase())
			System.out.println("Insertion phase is activated...");
		else
			System.out.println("Removal phase is activated...");
		System.out.println("Removing random value...");
		p1.removeAny();
		System.out.println("Total values left after removal:"+p1.size());
		System.out.println("Removing nextvalue in order...");
		p1.removeNextInOrder();
		System.out.println("Total values left after removal:"+p1.size());
		
		System.out.println("-----------------------------------");
		System.out.println("Prioritizer2 implementation demo - Order preserved at all times");
		System.out.println("-----------------------------------");
		System.out.println("Inserting integer values....");
		
//		prioritizer class 2
		Prioritizer p2 = new Prioritizer2(3);
		p2.insert('c');
		p2.insert('v');
		p2.insert('i');
		p2.insert('q');
		p2.insert('l');
		System.out.println("Total values inserted:"+p2.size());
		System.out.println("Changing to removal phase...");
		p2.changPhase();
		System.out.println("Checking current Phase...");
		if(p2.isInInsertionPhase())
			System.out.println("Insertion phase is activated...");
		else
			System.out.println("Removal phase is activated...");
		System.out.println("Removing random value...");
		p2.removeAny();
		System.out.println("Total values left after removal:"+p2.size());
		System.out.println("Removing nextvalue in order...");
		p2.removeNextInOrder();
		System.out.println("Total values left after removal:"+p2.size());
		
		System.out.println("-----------------------------------");
		System.out.println("Prioritizer3 implementation demo - No order preservation invariant");
		System.out.println("-----------------------------------");
		System.out.println("Inserting integer values....");

//		prioritizer class 3
		Prioritizer p3 = new Prioritizer3(4);
		p3.insert("Jhon");
		p3.insert("Shine");
		p3.insert("Warne");
		p3.insert("Adam");
		p3.insert("Gyle");
		System.out.println("Total values inserted:"+p3.size());
		System.out.println("Changing to removal phase...");
		p3.changPhase();
		System.out.println("Checking current Phase...");
		if(p3.isInInsertionPhase())
			System.out.println("Insertion phase is activated...");
		else
			System.out.println("Removal phase is activated...");
		System.out.println("Removing random value...");
		p3.removeAny();
		System.out.println("Total values left after removal:"+p3.size());
		System.out.println("Removing nextvalue in order...");
		p3.removeNextInOrder();
		System.out.println("Total values left after removal:"+p3.size());
		
	
		
		
	}

}
