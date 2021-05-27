package ch07;
 
public class Person {
	private String name;
	private String residentNum= "011026-3355555";
	Person() {
	}
	Person(String name, String residentNum){
		this.name=name;
		this.residentNum = residentNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResidentNum() {
		return residentNum;
	}
	public void setResidentNum(String residentNum) {
		this.residentNum = residentNum;
	}
	int age () {
		String birth =residentNum.substring(0,2);
		int intbirth = Integer.parseInt(birth);
		int birthYear = 0;
		char chk = residentNum.charAt(7);

		if (chk=='1'||chk=='2'){
			birthYear = 1900+intbirth;
		}else if(chk=='3'||chk=='4'){
			birthYear = 2000+intbirth;
		}
		return 2021-birthYear-1;
	}

	void sayHi() {

		System.out.println("안녕하세요. 저는 "+name+" 입니다. "+age()+ "살 입니다.");
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.sayHi();

	}
}
