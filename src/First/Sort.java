package First;
import java.util.Vector;

/**
 * @author Dan
 * 
 */
public class Sort {
	protected Vector<Integer> array = null;

	public Sort(Vector<Integer> a) {
		array = a;
	}

	public void print() {
		System.out.print("Sorted array: ");
		for (int elem : array) {
			System.out.print(elem + " ");
		}
		System.out.print("\n");
	}

	public void sort(){	}
	
	public static void main(String[] args) {
		Vector<Integer> tmp = new Vector<Integer>();
		tmp.add(9);
		tmp.add(8);
		tmp.add(7);
		tmp.add(6);
		tmp.add(5);
		tmp.add(4);
		tmp.add(3);
		tmp.add(2);
		tmp.add(1);
		Sort test = new Quick(tmp);
		test.sort();
		test.print();
	}
}
