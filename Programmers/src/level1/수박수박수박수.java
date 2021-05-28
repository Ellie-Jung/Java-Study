package level1;
class Solution2 {
    public String solution(int n) {
        String answer = "";
       
        for(int i =0; i<n;i++) {
        	if(i%2==0)
        	answer +="수";
        	if(i%2==1)
        	answer +="박";

        }
        return answer;
    }
}
public class 수박수박수박수 {
	public static void main(String[] args) {


		Solution2 s= new Solution2();
		
		System.out.println(s.solution(5));
		System.out.println(s.solution(6));
	}
}
