import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasterCard {
	private List<Integer> nextNumber;
	
	public MasterCard() {
		this.nextNumber = drawNumber();
	}
	public List<Integer> drawNumber() {
		int [] master = new int[75];
		List<Integer> l = new ArrayList<Integer>();
	    int m =0;
	    for(@SuppressWarnings("unused") int j: master) {
			l.add(m);
			m++;
	    	}
	    Collections.shuffle(l);
		return l;
	}
	public List<Integer> number() {
		return this.nextNumber;
	}
	

}
