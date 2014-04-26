package Final;

public class SelectionSort extends Sort {
	public static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			int iMin = i;

			for(int j = i + 1; j<array.length; ++j){
				if(array[j] < array[iMin]){
					iMin = j;
				}
			}
			
			if(i != iMin){
				swap(array, i, iMin);
			}
		}
	}
}
