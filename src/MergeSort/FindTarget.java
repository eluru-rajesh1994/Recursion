package MergeSort;

public class FindTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int start = 0;
		int end = a.length - 1;
		int target = 4;
		int result = findtargetusingrecurssion(a, start, end, target);
		System.out.println(result);
	}

	static int findtargetusingrecurssion(int [] a, int start, int end, int target) {
		
		while(start<=end) {
			int mid=(start+end)/2;
			  
			 if(a[mid]==target) {
				return mid;
			}
			else if(a[mid]<target) {
				return findtargetusingrecurssion(a,mid+1,end,target);
			}
			else {
			return	findtargetusingrecurssion(a,start,mid-1,target);
			}
		}
		return -1;
		
	}

}
