package varaiable;

class Test03 {
	public void test1() {
		int var = 100;
		System.out.println(var + " : 1111");
	}

	public void test2() {
//		System.out.println(var + " : 2222");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.test1();
		t.test2();
		int num = 200;
		if (true) {
			num = 100;
		}
		int i = 0;
		for (; i < 5; i++) {
		}
		i += 0;
	}
}