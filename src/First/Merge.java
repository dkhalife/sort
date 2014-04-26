package First;
import java.util.Vector;

/*
 * n log n
 *  
 * */

public class Merge extends Sort {
	public Merge(Vector<Integer> a) {
		super(a);
	}

	public void sort(){
		array = sort(0, array.size(), array);
	}
	
	private Vector<Integer> sort(int a, int b, Vector<Integer> ar){
		Vector<Integer> left, right; 
		
		if(b - a == 1){
			left = new Vector<Integer>();
			left.add(ar.get(a));
		
			return left;
		}
		
		int mid = (b+a)/2;
		left = sort(a, mid, ar);
		right = sort(mid, b, ar);
		
		return merge(left, right);
	}

	private Vector<Integer> merge(Vector<Integer> left, Vector<Integer> right){
		int i = 0;
		int j = 0;
		
		Vector<Integer> r = new Vector<>();
		while(i<left.size() && j<right.size()){
			if(left.get(i) < right.get(j)){
				r.add(left.get(i));
				++i;
			}
			else{
				r.add(right.get(j));
				++j;
			}
		}
		
		while(i<left.size()){
			r.add(left.get(i));
			++i;
		}
		
		while(j<right.size()){
			r.add(right.get(j));
			++j;
		}
		
		return r;
	}
}
