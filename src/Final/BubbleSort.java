package Final;

public class BubbleSort extends Sort {
	public static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			for (int j = array.length - 1; j > i; --j) {
				if (array[j] < array[j - 1]) {
					swap(array, j, j - 1);
				}
			}
		}
	}
}
