package varaiable;

class Test05 {
	public int num = 100;
	public static String name = "홍길동";

	public void test05() {
		System.out.println("test05실행!!!");
	}
}

public class Ex05 {
	static int num;

	public static void test() {

	}

	public static void main(String[] args) {
		num = 100;
		test();
		Test05 t = new Test05();
		t.test05();
	}
}