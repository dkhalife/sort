package Final;

public class InsertionSort extends Sort {
	public static void sort(int[] array) {
		for (int i = 1; i < array.length; ++i) {
			int tmp = array[i];

			int j = i;
			while (j > 0 && tmp < array[j - 1]) {
				array[j] = array[j - 1];
				--j;
			}

			array[j] = tmp;
		}
	}

	public static void sort(int[] array, int left, int right) {
		for (int i = left + 1; i < right; ++i) {
			int tmp = array[i];

			int j = i;
			while (j > left && tmp < array[j - 1]) {
				array[j] = array[j - 1];
				--j;
			}

			array[j] = tmp;
		}
	}
}
