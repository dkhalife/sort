package First;
import java.util.Vector;

/*
 * n^2 worst case
 * n best case
 * 
 */

public class Insertion extends Sort {
	public Insertion(Vector<Integer> a) {
		super(a);
	}

	public void sort() {
		int i, j;
		Integer tmp;
		for(i=1; i<array.size(); ++i){
			tmp = array.get(i);
			
			for(j=i; j>0 && tmp.compareTo(array.get(j-1))<0; j--){
				array.set(j, array.get(j-1));
			}
			
			array.set(j, tmp);
		}
	}
}
