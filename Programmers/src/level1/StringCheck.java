package level1;
class Check {
    public boolean solution(String s) {
        boolean answer = true;
       char ch;
       
       for(int i=0;i<s.length();i++) {
    	   if(!Character.isDigit(s.charAt(i))) {
    		   return false;
    	   }
       }
      
        return true;
    }
}
public class StringCheck {

	public static void main(String[] args) {
		Check c = new Check();
		c.solution("a234");
		c.solution("1234");
//		Boolean.parseBoolean("134");
//		System.out.println(Boolean.parseBoolean("134"));
	}

}
