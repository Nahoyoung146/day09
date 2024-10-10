package varaiable;

public class Ex02 {
	public static void main(String[] args) {
		String name = "홍길동";
		if (true) {
			name = "김개똥";
			String n = "1111";
		}
//		System.out.println(n); n은 지역변수라서 에러 발생
		System.out.println(name);
	}
}