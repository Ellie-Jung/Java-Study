package level1;

public class 핸드폰번호가리기 {

}
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String []arr = phone_number.split("");
        phone_number = "123456789";
        
        for (int i = 0; i<arr.length-4;i++) {
        	arr[i] = "*";
        }
        for (int i = 0; i<arr.length; i++) {
        	answer+= arr[i];
        }
       
        return answer;
    }
}