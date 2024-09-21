package BasicProblems;

public class Printfirstnnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		fun(n);
		funrev(n);
		funBoth(n);

	}

	static void fun(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);//5,4,3,2,1

		fun(n - 1);
	}

	static void funrev(int n) {
		if (n == 0) {
			return;
		}

		funrev(n - 1);
		System.out.println(n);//1,2,3,4,5
	}

	static void funBoth(int n) {//bothprint
		if (n == 0) {
			return;
		}
		System.out.println(n);

		funBoth(n - 1);
		System.out.println(n);
	}
	
}
