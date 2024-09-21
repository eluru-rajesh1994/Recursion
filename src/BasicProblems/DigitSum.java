package BasicProblems;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans =sum(1234);
		System.out.println(ans);

	}
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return (n%10)+sum(n/10);
	}
	

}
