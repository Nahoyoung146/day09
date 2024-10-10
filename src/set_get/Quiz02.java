package set_get;

class Test0 {
	private int kor, eng, math, sum;
	private double avg;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		Test0 t = new Test0();
		int k = 100, e = 90, m = 80;
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.setSum(t.getKor() + t.getEng() + t.getMath());
		t.setAvg(t.getSum() / 3);
		System.out.println("국어 : " + t.getKor());
		System.out.println("영어 : " + t.getEng());
		System.out.println("수학 : " + t.getMath());
		System.out.println("총합 : " + t.getSum());
		System.out.println("평균 : " + t.getAvg());
	}
}