package firstweb.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import firstweb.entity.Notice;
import firstweb.entity.NoticeView;

public class NoticeService {
	
	public int removeNoticeAll(int[] ids){
		
		return 0;
	}
	public int pubNoticeAll(int[] ids){
		
		return 0;
	}
	public int insertNotice(Notice notice){
		
		return 0;
	}

	public int deleteNotice(int id){
		
		return 0;
	}
	public int updateNotice(Notice notice){
		
		return 0;
	}
	public List<Notice> getNoticeNewestList(){
		
		return null;
	}
	
	
	
	// 이름이 같은 함수는 기능이 유사한 함수 -> 개별적으로 다 구현할때 코드의 중복이 많아지고 수정이 어려워짐. => 이름 같은 메서드는 여러중에 하나만 구현하고 나머지는 하나를 재호출하는 방향으로 구현 (코드 집중화, 유지보수쉬움). 인자많은것 구현
	public List<NoticeView> getNoticeList(){
		
		
		
		return getNoticeList("title","",1); //밑에 두개로 다 호출가능하나, 바로밑에꺼로 호툴하면 바로밑에꺼에서 또 그밑에꺼 호출해야함. 그래서 걍 젤밑에꺼로 호출하는게 좋다.(호출스택 중복으로늘어남)
	}
	
	public List<NoticeView> getNoticeList(int page){ //밑에 함수를 재호출해서 사용
		
		return getNoticeList("title","",page);
	}
	
	public List<NoticeView> getNoticeList(String field, String query, int page){ //얘만 구현할거다.
								//필드로 받을수 있는 값 : title, writer_id,등
								//쿼리로는 검색할 문자열 받는다 .
		List<NoticeView> list = new ArrayList<>();
		
		String sql = "select * from ("
					+ "select rownum num, n.* "
					+ "from(SELECT * FROM NOTICE_VIEW where "+field+" like ? ORDER BY REGDATE DESC) n)"
					+ " where num between ? and ?";
		
		// 첫번째 ?안의 결과에 올수있는 수 1, 11, 21, 31  -> 등차수열 an  = 1+(page-1)*10
		// 두번째 ? 안의 결과에 올수있는 수 10, 20, 30..  ->  an = page*10
		
		
		String url =  "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,"hr","tiger");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, "%"+query+"%");
			st.setInt(2, 1+(page-1)*10);
			st.setInt(3, page*10);
			
			ResultSet rs = st.executeQuery();
				
			while(rs.next()){

				int id= rs.getInt("ID");
				String title= rs.getString("TITLE");
				Date regdate= rs.getDate("REGDATE");
				String writerId= rs.getString("WRITER_ID");
				String hit= rs.getString("HIT");
				String files= rs.getString("FILES");
				//String content= rs.getString("CONTENT");
				int cmtCount = rs.getInt("CMT_COUNT");
				
				
				NoticeView notice = new NoticeView(id,title,regdate,writerId,hit,files,cmtCount);
				list.add(notice);
						
			}     
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public int getNoticeCount() {
		
		
		return getNoticeCount("title", "");
	}
	
	public int getNoticeCount(String field, String query) {
		
		int count =0;
		String sql = "select count(ID) count from (select rownum num, n.* from(SELECT * FROM NOTICE where "+field+" like ? ORDER BY REGDATE DESC) n)";
		

		String url =  "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,"hr","tiger");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, "%"+query+"%");
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				count=rs.getInt("count");
			}
		
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return count;
	}
	
	
	public Notice getNotice(int id) {
		
		Notice notice = null;
		String sql = "SELECT * FROM NOTICE WHERE ID=?";
		
		String url =  "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,"hr","tiger");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id );
			
			
			ResultSet rs = st.executeQuery();
				
			if(rs.next()){

				int nid= rs.getInt("ID");
				String title= rs.getString("TITLE");
				Date regdate= rs.getDate("REGDATE");
				String writerId= rs.getString("WRITER_ID");
				String hit= rs.getString("HIT");
				String files= rs.getString("FILES");
				String content= rs.getString("CONTENT");
				
				
				notice = new Notice(nid,title,regdate,writerId,hit,files,content);
						
			}     
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return notice;
	}
	
	public Notice getNextNotice(int id) {
		
		Notice notice = null;
	
		String sql="SELECT * FROM NOTICE WHERE ID= ( SELECT ID FROM NOTICE WHERE REGDATE > (SELECT REGDATE FROM NOTICE WHERE ID=?) AND ROWNUM=1)";
		

		String url =  "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,"hr","tiger");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id );
			
			
			ResultSet rs = st.executeQuery();
				
			if(rs.next()){

				int nid= rs.getInt("ID");
				String title= rs.getString("TITLE");
				Date regdate= rs.getDate("REGDATE");
				String writerId= rs.getString("WRITER_ID");
				String hit= rs.getString("HIT");
				String files= rs.getString("FILES");
				String content= rs.getString("CONTENT");
				
				
				notice = new Notice(nid,title,regdate,writerId,hit,files,content);
						
			}     
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return notice;
	}
	
	public Notice getPrevNotice(int id) {
	
		Notice notice = null;
		String sql = "SELECT * FROM NOTICE WHERE ID= SELECT ID "
					+ "from(select * from notice order by regdate desc) WHERE REGDATE < (SELECT REGDATE FROM NOTICE WHERE ID=?)"
					+ " and rownum=1";
		
		

		String url =  "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,"hr","tiger");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id );
			
			
			ResultSet rs = st.executeQuery();
				
			if(rs.next()){

				int nid= rs.getInt("ID");
				String title= rs.getString("TITLE");
				Date regdate= rs.getDate("REGDATE");
				String writerId= rs.getString("WRITER_ID");
				String hit= rs.getString("HIT");
				String files= rs.getString("FILES");
				String content= rs.getString("CONTENT");
				
				
				notice = new Notice(nid,title,regdate,writerId,hit,files,content);
						
			}     
			
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return notice;
	}
	
	
	public int deleteNoticeAll(int[] ids) {
		
		int result=0;
		
		String params="";
		
		for(int i=0; i<ids.length; i++) {
			params+= ids[i];
		
			if(i < ids.length-1) //이 조건식이 중요. 마지막이냐 아니냐
				params += ",";
		}
		
		String sql = "delete from notice id in("+params+")";
	
	
	
		String url =  "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,"hr","tiger");
			Statement st = con.createStatement();
			
			result = st.executeUpdate(sql);
				
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return result;
	}

	
	
	
	
}
