package level1;
class Find {
	public String solution(String[] seoul) {
		String answer = "Kim";
		for(int i=0;i<seoul.length;i++) {
			if(seoul[i].equals(answer)) {
				return "김서방은"+i+"에 있다.";
			}
		}
		return "i";
	}
	public String solution2(String[] seoul) {
		int x= 0;
		while(x<seoul.length) {
			if(seoul[x]=="Kim")
				break;
			else x++;
		}
	return "김서방은"+x+"에있다.";
	}
	
}
public class FindKim {

	public static void main(String[] args) {
		Find f = new Find();
		String[] seoul = {"Jane","Kim"};
		f.solution(seoul);
		System.out.println(f.solution(seoul));
		System.out.println(f.solution2(seoul));
		
		
	}

}
