package Final;

public class Sort {
	protected static int[] array = new int[10];

	protected static void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			array[i] = 10-i;
		}

		QuickSort.sort(array);

		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
