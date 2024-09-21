package MergeSort;

import java.util.Arrays;

public class DivideAndConcer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 7, 5,3,2 };
		int start = 0;
		int end = a.length - 1;
		int[] result = new int[a.length];
		divide(a, result, start, end);
		System.out.println(Arrays.toString(result));

	}

	static void divide(int[] a, int[] result, int start, int end) {
		int mid = (start + end) / 2;
		if (start == end) {
			return;
		}
		divide(a, result, start, mid);
		divide(a, result, mid + 1, end);
		merge(a, result, mid, start, end);

	}

	static void merge(int[] arr, int[] result, int mid, int start, int end) {
		int i = start;
		int j = mid + 1;
		int k = start;
		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				result[k++] = arr[i++];

			} else {
				result[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			result[k++] = arr[i++];
		}
		while (j <= end) {
			result[k++] = arr[j++];
		}
		int index = 0;
		for (index = start; index <= end; index++) {
			arr[index] = result[index];
		}

	}

}
