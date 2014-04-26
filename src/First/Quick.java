package First;
import java.util.Vector;

/* 
 * n log n 
 * 
 * */

public class Quick extends Sort {
	public Quick(Vector<Integer> a) {
		super(a);
	}

	public void sort(){
		sort(array);
	}
	
	public void sort(Vector<Integer> items){
		if(items.size()>1){
			Vector<Integer> smaller = new Vector<>();
			Vector<Integer> same = new Vector<>();
			Vector<Integer> larger = new Vector<>();
			
			Integer pivot = items.get(items.size()/2);
			
			for(Integer i : items){
				if(i < pivot)
					smaller.add(i);
				else if(i > pivot)
					larger.add(i);
				else
					same.add(i);	
			}
			
			sort(smaller);
			sort(larger);
			
			items.clear();
			items.addAll(smaller);
			items.addAll(same);
			items.addAll(larger);
		}
	}
}
