package BasicProblems;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = fact(6);
		System.out.println(ans);
	}

	static int fact(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

}
