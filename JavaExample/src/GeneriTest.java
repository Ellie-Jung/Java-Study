import java.util.ArrayList;

public class GeneriTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add("30"); //스트링을 추가
//		
//		Integer i = (Integer)list.get(2); //형변환. 컴파일 OK // 받아오는 값을 다 확인하지 못함. 컴파일러의 한계
//		
//		System.out.println(list); //이대로 실행시 에러 발생 ( 실행시발생하는 에러보다 컴파일에러가 더 낫다. 미리확인가능.
//		                          //실행시  에러 발생하면 프로그램이 죽음.치명적
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //타입을 지정
		list2.add(50);
//		list2.add(g); //잘못된 타입이 들어갔을때 컴파일러가 잡아줌
		//지네릭스 사용시 타입 체크가 강화됨.
		//여러종류 타입 받고싶으면 <Object> 사용하고 형변환 해야함.//지네릭스 도입이후에는 꼭 <>사이에 타입 써줘야함. 오브젝트라도
		list2.add(40);
		list2.add(30);
		//형변환 생략가능 
		Integer i = list2.get(0);
		System.out.println(list2);
		System.out.println(i);
		
	}

}
