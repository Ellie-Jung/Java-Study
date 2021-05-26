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
	int sum() {
		return kor+eng+math;
	}
	float avg() {
		return sum()/3;
	}
	Student() {}
	Student(String name, int kor, int eng, int math) {
		this.name=name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	void printInfo() {
		System.out.println(getName()+"  "+getKor()+"  "+getEng()+"  "+getMath()+ "  "+sum()+"  "+avg());
	}
	public static void main(String[] args) {
		int sumKor=0;
		int sumEng=0;
		int sumMath=0;
		
		Student[] stu = new Student[10];

		stu[0] = new Student("À¯Àç¼®",99,40,80);
		stu[1] = new Student("È«±æµ¿",70,31,22);
		stu[2] = new Student("±è±æµ¿",34,80,12);
		stu[3] = new Student("¹Ú»ó¸é",70,70,83);
		stu[4] = new Student("¹Ú¸í¼ö",11,80,90);
		stu[5] = new Student("±è³²±æ",22,64,33);
		stu[6] = new Student("°­µ¿¿ø",77,97,90);
		stu[7] = new Student("¼ºµ¿ÀÏ",64,80,74);
		stu[8] = new Student("°ø½ÂÃ¶",12,80,92);
		stu[9] = new Student("±è»ç¶û",78,80,90);

		System.out.println("ÀÌ¸§   ±¹¾î ¿µ¾î ¼öÇÐ  ÃÑÁ¡  Æò±Õ");
		for(int i =0; i<stu.length; i++) {
			stu[i].printInfo();
		}
//		for (int i=0; i<stu.length;i++) {
//			sumKor+= stu[i].getKor();
//			sumeng+= 
//		}
//		System.out.println(sumKor);
	}
}
