package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeptDao { //sql�� ó���ϴ� Ŭ���� 
	
	//�̱��� ����
	//(1) �ܺ� Ŭ���� �Ǵ� �ν��Ͻ����� �ش� Ŭ������ �ν��Ͻ� �������� ���ϵ��� ó��
	private DeptDao() {} //�����ڸ� �����̺�����.
	
	//(2) Ŭ���� ���ο��� �ν��Ͻ��� �����
	static private DeptDao dao = new DeptDao();
	
	//(3) �޼��带 ���ؼ� ��ȯ�ϵ��� ó��
	public static DeptDao getInstance() {
		return dao;
	}
	
	//1. ��ü ������ �˻� ���
	//��ȯ Ÿ����  List<dept>   �Ű�������  Connection ��ü : Statement ����� ���� �ʿ�
	ArrayList <Dept> getDeptList(Connection con){
		
		ArrayList<Dept> list = null;
		
		//�����ͺ��̽��� ���̺� �̿� select����� -> list�� ����.
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.createStatement();
			String sql = "select * from dept01 order by deptno";

			//��� �޾ƿ���
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<>();
			
			//�����͸� Dept ��ü�� ���� -> list�� ����
			while (rs.next()) {
				list.add(new Dept(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	
	//2. Dept ���̺� �����͸� �����ϴ� �޼���.
	// �ݿ� Ƚ�� ��ȯ. ����ڷκ��� ������ �ޱ� -> Dept ��ü
	int insertDept (Connection con , Dept dept) {
		int result = 0;
		
		//���޹��� Dept��ü�� �����ͷ� Dept���̺� ���� -> ��� ���� ��ȯ
		PreparedStatement pstmt = null;
		
		try {
			String sql = "insert into dept values (dept01_deptno_seq.nextval, ? , ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}

	//3. dept ���̺��� ������ ���� �޼���
	// �ݿ��� ���� ������ ��ȯ. ����ڷκ��� �����͸� �޾Ƽ� ó������
	int editDept(Connection con, Dept dept) {
		int result =0;
		
		//���޹��� Dept ��ü�� �����ͷ� Dept ���̺� ���� -> ��� ���� ��ȯ
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update dept01 set dname = ? , loc = ? , where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	
	//4. dept���̺��� ������ �����ϴ� �޼���
	//������ ���� ������ ��ȯ. ����ڷκ��� deptno �޾Ƽ� ó��
	int deleteDept(Connection con, int deptno ) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "delete from dept where deptno = ? ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	return result;
	}
	
	
	
}
