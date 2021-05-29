package level1;
class Solution3 {
	public long solution(int a, int b) {
		long answer = 0;
		if(a<b){
			for(int i=a; i<=b;i++){
				answer += i;
			}
		}else{
			for(int i=b; i<=a;i++){
				answer += i;
			}
		}
		return answer;
	}
}
public class 두정수사이의합 {

	public static void main(String[] args) {
		
		Solution3 s = new Solution3();
		s.solution(3, 5);
		System.out.println(s.solution(3, 5));
		System.out.println(s.solution(3,3));
		System.out.println(s.solution(5, 3));
	}

}
