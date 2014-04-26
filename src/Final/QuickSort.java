package Final;

public class QuickSort extends Sort {
	private final static int CUTOFF = 3;

	public static void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	private static void sort(int[] array, int left, int right) {
		if (right - left >= CUTOFF) {
			int pivot = median3(array, left, right);

			// partition
			int i = left;
			int j = right - 1;

			while (true) {
				while (array[++i] < pivot) {}
				while (array[--j] > pivot) {}

				if (i < j) {
					swap(array, i, j);
				}
				else {
					break;
				}
			}

			swap(array, i, right - 1); // Swap pivot
			sort(array, left, i - 1);
			sort(array, i + 1, right);
		}
		else {
			InsertionSort.sort(array, left, right);
		}
	}
	
	private static int median3(int[] array, int left, int right){
		int center = (left + right)/2;
		
		if(array[center] < array[left]) swap(array, center, left);
		if(array[right] < array[left]) swap(array, right, left);
		if(array[right] < array[center]) swap(array, right, center);
		
		swap(array, center, right-1);
		
		return array[right - 1];
	}
}