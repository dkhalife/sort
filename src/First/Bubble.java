package First;
import java.util.Vector;

/*
 *  best case n^2
 *  worst case n
 *  
 */

public class Bubble extends Sort {
	public Bubble(Vector<Integer> a) {
		super(a);
	}

	public void sort(){
		boolean swapped;
		do{
			swapped = false;
			for(int j=1; j<array.size(); ++j){
				if(array.get(j-1)>array.get(j)){
					swapped = true;
					int tmp = array.get(j);
					array.set(j, array.get(j-1));
					array.set(j-1, tmp);
				}
			}
		}while(swapped);
	}
}
