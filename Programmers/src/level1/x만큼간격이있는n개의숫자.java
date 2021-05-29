package level1;
class Solution4 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long tmp = x;
        for(int i =0;i<n;i++) {
        	answer[i]=x*(i+1); 
        }
        
        for(long e : answer) {
        	System.out.print(e+" ");
        }System.out.println();
        return answer;
        
    }
}
public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		Solution4 s= new Solution4();
		s.solution(2, 5);
		s.solution(4, 3);
		s.solution(-4, 2);
		s.solution(0, 2);

	}

}
