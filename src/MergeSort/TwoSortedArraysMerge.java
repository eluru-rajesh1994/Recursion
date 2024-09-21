package MergeSort;

import java.util.Arrays;

public class TwoSortedArraysMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 7, 8 };
		int[] b = { 4, 5, 6 };
		int size = a.length + b.length;
		int[] result = new int[size];
		merge(a, b, result);
		 System.out.println(Arrays.toString(result));
	}

	static void merge(int[] a, int[] b, int[] result) {
	
		int aend = a.length - 1;
		
		int bend = b.length - 1;
		int i = 0, j = 0, k = 0;
		while (i <= aend && j <= bend) {
			if (a[i] < b[j]) {
				result[k++] = a[i++];

			} else {
				result[k++] = b[j++];

			}
			while (i <= aend) {
				result[k++] = a[i++];
			}
			while (j <= bend) {
				result[k++] = b[j++];
			}
		}
		int start=0;
		int end=result.length-1;
		int mid=(start+end)/2;
		double median=0;
			if(result.length%2==1) {
			median=result[mid];

			}
			else {
				median=(result[mid]+result[mid+1])/2.0;
			}
			System.out.println("median :" +median);
			
		}

}


