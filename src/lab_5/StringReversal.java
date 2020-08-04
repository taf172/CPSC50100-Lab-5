package lab_5;

public class StringReversal {
	private static String reverseString(String s) {
		
		int len = s.length();
		
		if (len == 0 || len == 1)
			return s;
		else
			return (s.charAt(len-1) + reverseString(s.substring(1,len-1)) + s.charAt(0));
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("racecar"));
		System.out.println(reverseString("odd"));
		System.out.println(reverseString("even"));
		System.out.println(reverseString("Hello world!"));
		
		

	}

}
