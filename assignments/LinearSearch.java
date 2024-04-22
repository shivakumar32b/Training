
public class LinearSearch {
	public static int PerformLinearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12 };
		int target = 8;
		int index = PerformLinearSearch(arr, target);
		if (index!=-1) {
			System.out.println("index of element:"+index);
		}
		else {
			System.out.println("element not found");
		}
	}
}
