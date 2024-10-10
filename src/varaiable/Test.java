package varaiable;

import java.util.Scanner;
/*
public class Test{
String name,addr;
int kor,math,eng,sum
// 출력 결괴, 이름, 주소, 국,영,수,합
}
*/

class Test_ {
	Scanner sc = new Scanner(System.in);
	String name, addr;
	int kor, eng, math, sum;

	public void inputdata() {
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("주소 입력 : ");
		addr = sc.next();
		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		math = sc.nextInt();
	}

	public void printdata() {
		sum = kor + eng + math;
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("국영수 총합 : " + sum);
	}
}

public class Test {
	public static void main(String[] args) {
		Test_ t = new Test_();
		t.inputdata();
		t.printdata();
	}
}