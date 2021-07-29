package firstweb.service;

import java.util.List;

import firstweb.entity.Notice;

public class NoticeService {
	
	// 이름이 같은 함수는 기능이 유사한 함수 -> 개별적으로 다 구현할때 코드의 중복이 많아지고 수정이 어려워짐. => 이름 같은 메서드는 여러중에 하나만 구현하고 나머지는 하나를 재호출하는 방향으로 구현 (코드 집중화, 유지보수쉬움). 인자많은것 구현
	public List<Notice> getNoticeList(){
		
		return getNoticeList("title","",1); //밑에 두개로 다 호출가능하나, 바로밑에꺼로 호툴하면 바로밑에꺼에서 또 그밑에꺼 호출해야함. 그래서 걍 젤밑에꺼로 호출하는게 좋다.(호출스택 중복으로늘어남)
	}
	
	public List<Notice> getNoticeList(int page){ //밑에 함수를 재호출해서 사용
		
		return getNoticeList("title","",page);
	}
	
	public List<Notice> getNoticeList(String field, String query, int page){ //얘만 구현할거다.
		
		
		
		return null;
	}
	
	
	public int getNoticeCount() {
		
		
		return 0;
	}
	
	public int getNoticeCount(String field, String query) {
		
		
		return 0;
	}
	
	
	public Notice getNotice(int id) {
		
		
		return null;
	}
	
	public Notice getNextNotice(int id) {
		
		
		return null;
	}
	
	public Notice getPrevNotice(int id) {
	
		
		return null;
	}

	
	
	
	
}
