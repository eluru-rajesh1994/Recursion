package BasicProblems;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=sum(n);
		System.out.println(ans);

	}
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}

}
