package set_get;

import java.util.Scanner;

class Test {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Quiz01 {
	public static void main(String[] args) {
		Test t = new Test();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		t.setName(name);
		t.setAge(age);
		System.out.println(t.getName() + "님의 나이는 " + t.getAge() + "살 입니다.");
	}
}