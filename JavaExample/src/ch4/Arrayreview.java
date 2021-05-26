package ch4;
class Student{
	private String name;
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	private int kor;
	private int eng;
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
	int sum() {
		return getKor()+getEng();
	}
	double avg() {
		return sum()/2d;
	}
}
public class Arrayreview {
	public static void main(String[] args) {
		Student[] student = new Student[5];
		student[0] = new Student("�达", 84, 74);
		student[1] = new Student("�ھ�", 91, 21);
		student[2] = new Student("����", 89, 54);
		student[3] = new Student("����", 98, 100);
		student[4] = new Student("�̾�", 23, 64);
		
		int korSum =0;
		int engSum =0;
		System.out.println("�̸� \t����\t����\t����\t���");
		for(int i =0; i<student.length ; i++) {
			System.out.print(student[i].getName()+"\t");
			System.out.print(student[i].getKor()+"\t");
			System.out.print(student[i].getEng()+"\t");
			System.out.print(student[i].sum()+"\t");
			System.out.println(student[i].avg()+"\t");
			korSum += student[i].getKor();
			engSum += student[i].getEng();
		}
		System.out.println("���� ���� : "+korSum+ " ���� ��� : "+korSum/3f);
		System.out.println("���� ���� : "+engSum+ " ���� ��� : "+engSum/3f);
	}

}
