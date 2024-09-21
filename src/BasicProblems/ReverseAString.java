package BasicProblems;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="srinu";
	String reverse=	reversethestring(str);
  System.out.println(reverse);
	}
	static String reversethestring(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reversethestring(str.substring(1))+str.charAt(0);
		
	}

}
