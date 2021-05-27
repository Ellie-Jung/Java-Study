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
		student[0] = new Student("±è¾¾", 84, 74);
		student[1] = new Student("¹Ú¾¾", 91, 21);
		student[2] = new Student("°­¾¾", 89, 54);
		student[3] = new Student("Á¤¾¾", 98, 100);
		student[4] = new Student("ÀÌ¾¾", 23, 64);
		
		int korSum =0;
		int engSum =0;
		System.out.println("ÀÌ¸§ \t±¹¾î\t¿µ¾î\tÃÑÁ¡\tÆò±Õ");
		for(int i =0; i<student.length ; i++) {
			System.out.print(student[i].getName()+"\t");
			System.out.print(student[i].getKor()+"\t");
			System.out.print(student[i].getEng()+"\t");
			System.out.print(student[i].sum()+"\t");
			System.out.println(student[i].avg()+"\t");
			korSum += student[i].getKor();
			engSum += student[i].getEng();
		}
		System.out.println("±¹¾î ÃÑÁ¡ : "+korSum+ " ±¹¾î Æò±Õ : "+korSum/3f);
		System.out.println("¿µ¾î ÃÑÁ¡ : "+engSum+ " ¿µ¾î Æò±Õ : "+engSum/3f);
	}

}
