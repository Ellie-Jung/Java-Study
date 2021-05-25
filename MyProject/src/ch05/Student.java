package ch05;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
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
	int sum(int kor, int eng, int math) {
		return kor+eng+math;
	}
	float avg(int kor, int eng, int math) {
		return sum(kor, eng, math)/3;
	}
	public static void main(String[] args) {
		Student[] stu = new Student[10];
		System.out.println(stu[0]);
		for(int i = 0; i <stu.length ; i++) {
			stu[i] =i;
		}
		System.out.println(stu[0]);
	}

}
