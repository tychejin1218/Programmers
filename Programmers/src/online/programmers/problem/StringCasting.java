package online.programmers.problem;

public class StringCasting {

	public static void main(String[] args) {	

		String str = null;

		// 문자열 "null"을 반환
		System.out.println((String) str);

		// 문자열 "null"을 반환
		System.out.println(String.valueOf(str));

		// NullPointerException 발생
		System.out.println(str.toString());
	}
}
