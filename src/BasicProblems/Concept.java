package BasicProblems;

public class Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);
		

	}
	static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		//fun(n--); given error
		fun(--n);
		//System.out.println(n);
	}

}
