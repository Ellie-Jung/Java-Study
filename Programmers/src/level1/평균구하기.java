package level1;
class Solution1 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum+= arr[i];
        }
        return (double)sum/arr.length;
    }
}
public class Æò±Õ±¸ÇÏ±â {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] arr2= {5,5};
		
		Solution1 s = new Solution1();
		s.solution(arr2);
		System.out.println(s.solution(arr));
		System.out.println(s.solution(arr2));
		
	}

}
