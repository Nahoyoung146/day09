package set_get;

class Test03 {
	private int num = 1234;
	int age;

	public void set(int n) {
//		this.num=num;
		num = n;
	}

	public int get() {
		return num;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		int n = t.get();
		System.out.println(n);
		int num = 789;
		t.set(num);
		System.out.println("변경 후 : " + t.get());
	}
}