package Final;

public class MergeSort extends Sort {
	public static void sort(int array[]) {
		int[] tmp = new int[array.length];
		sort(array, tmp, 0, array.length - 1);
	}

	private static void sort(int[] array, int[] tmpArray, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			sort(array, tmpArray, left, center);
			sort(array, tmpArray, center + 1, right);
			merge(array, tmpArray, left, center + 1, right);
		}
	}

	private static void merge(int[] array, int[] tmpArray, int leftPos, int rightStart, int rightEnd) {
		int i = leftPos;
		int j = rightStart;
		int k = 0;

		while (i <= rightStart - 1 && j <= rightEnd) {
			if (array[i] <= array[j]) {
				tmpArray[k++] = array[i++];
			}
			else {
				tmpArray[k++] = array[j++];
			}
		}

		while (i <= rightStart - 1) {
			tmpArray[k++] = array[i++];
		}

		while (j <= rightEnd) {
			tmpArray[k++] = array[j++];
		}

		int numElements = rightEnd - leftPos + 1;
		for (int l = 0; l < numElements; ++l) {
			array[leftPos++] = tmpArray[l];
		}
	}
}
