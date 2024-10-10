package set_get;
class Test01{
	int num = 12345;
	public void abcd() {
		System.out.println("abcd 호출");
	}
	public void test() {
		this.abcd();
		int num=500;
		System.out.println("test num : " + num);
		System.out.println("this System.out.println:" + this);
		System.out.println("this System.out.println:" + this.num);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t =new Test01();
		System.out.println("t : " + t);
		System.out.println("t.num : " + t.num);
		t.test();
		t.abcd();
	}
}