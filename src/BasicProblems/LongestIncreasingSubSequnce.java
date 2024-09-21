package BasicProblems;
import java.util.ArrayList;

public class LongestIncreasingSubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		find(arr, 0, new ArrayList<Integer>());

	}
	
	static void find(int[] arr,int index, ArrayList<Integer> list) {
		
		if(index==arr.length) {
			System.out.println(list);
			return;
		}
		
		list.add(arr[index]);
		find(arr, index+1, list);
		list.remove(list.size()-1);
		
		find(arr, index+1, list);
	}

}
