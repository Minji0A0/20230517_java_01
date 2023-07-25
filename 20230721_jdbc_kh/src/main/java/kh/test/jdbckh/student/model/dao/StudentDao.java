package kh.test.jdbckh.student.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kh.test.jdbckh.student.model.vo.StudentVo;

public class StudentDao {
//PPT 내용 구현

	// DB에서 tb_student 테이블의 전달받은 학번을 통해 학생1명의 상세정보를 읽어옴
	public StudentVo selectOneStudent(String studentNo) {
		System.out.println("DAO selectOneStudent() arg:" + studentNo);

		StudentVo result = null;
//		두종류 모두 사용해도됨
//		String query = "select * from tb_student join tb_department using(department_no) where student_no= "+"'"+studentNo+"'";
//		String query = "select * from tb_student s join tb_department d on(s.department_no=d.department_no) where student_no= "+"'"+studentNo+"'";
		String query = "select s.*"
				+ ", (select department_name from tb_department where department_no=s.department_no) department_name "
				+ "from tb_student s where student_no = ?";
		// ? 위치홀더

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "kh", "kh");
//			if(conn==null) {
//				System.out.println("연결실패");
//			}else {
//				System.out.println("연결성공★");
//			}
//			연결성공시 필요없는 if문임
			pstmt = conn.prepareStatement(query);
			// pstmt 생성된 후 -------- execute실행하기 전
			// 여기서 ? 위치홀더에 값 넣기
			pstmt.setString(1, studentNo);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				result = new StudentVo();
				// while 동작시킬 필요없음. query 결과가 단일행일 것이므로
				result.setAbsenceYn(rset.getString("ABSENCE_YN"));
				result.setCoachProfessorNo(rset.getString("COACH_PROFESSOR_NO"));
				result.setDepartmentNO(rset.getString("DEPARTMENT_NO"));
				result.setEntranceDate(rset.getDate("ENTRANCE_DATE"));
				result.setStudentAddress(rset.getString("STUDENT_ADDRESS"));
				result.setStudentName(rset.getString("STUDENT_NAME"));
				result.setStudentNo(rset.getString("STUDENT_NO"));
				result.setStudentSsn(rset.getString("STUDENT_SSN"));
				result.setDepartmentName(rset.getString("DEPARTMENT_NAME"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null)
					rset.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println(result);
		// 1명분이기 때문에 주석처리해도되고 sysout상태로 둬도됨
		return result;
	}

	public List<StudentVo> selectListStudent() {
		String query = "select * from tb_student";
		List<StudentVo> result = null;
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			// 1. driver 있다면 로딩함/ // 없다면 ClassNotFoundException 오류 발생
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 객체 생성 // dbms와 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "kh", "kh");
			if (conn != null) {
				System.out.println("DB연결 성공!!!!!!");
			} else {
				System.out.println("-----DB 연결 실패------ ");
			}
			// 3. Statement / PrepareStatement 객체 생성 - conn 객체로부터 - query문을 실어서 보냄
//		stmt = conn.createStatement();
			pstmt = conn.prepareStatement(query);
			// 4. query문을 실행해달라고함. 그 결과값을 return 받음
			// select query 문이면 ResultSet 모양
			// insert/update/delete 문이면 int모양
			ResultSet rs = pstmt.executeQuery();
			// 5. ResultSet에서 row(record)=한줄 어오기 위해 cursor(포인트)를 이동함
			if (rs.next()) {
				result = new ArrayList<StudentVo>();
				do {
					// 한줄 row/record 를 읽을 준비 완료
//			System.out.println(rs.getString("STUDENT_NAME"));
					StudentVo vo = new StudentVo();
					vo.setStudentNo(rs.getString("STUDENT_NO"));
					vo.setDepartmentNO(rs.getString("DEPARTMENT_NO"));
					vo.setStudentName(rs.getString("STUDENT_NAME"));
					vo.setStudentSsn(rs.getString("STUDENT_SSN"));
					vo.setStudentAddress(rs.getString("STUDENT_ADDRESS"));
					vo.setEntranceDate(rs.getDate("ENTRANCE_DATE"));
					vo.setAbsenceYn(rs.getString("ABSENCE_YN"));
					vo.setCoachProfessorNo(rs.getString("COACH_PROFESSOR_NO"));
					result.add(vo);

				} while (rs.next() == true);
			}
//			System.out.println(result);

		} catch (ClassNotFoundException e) {
			// 1.driver (ojdbc.jar) 없음
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// DB에서 tb_student 테이블의 있는 모든 내용을 읽어서 꺼냄
	public List<StudentVo> selectListStudent(String searchWord) {
		List<StudentVo> result = null;

		String query = "select * from tb_student where student_name like ? or student_address like ? ";

		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 1. driver 있다면 로딩함/ // 없다면 ClassNotFoundException 오류 발생
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 객체 생성 // dbms와 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "kh", "kh");
			if (conn != null) {
				System.out.println("DB연결 성공!!!!!!");
			} else {
				System.out.println("-----DB 연결 실패------ ");
			}
			// 3. Statement / PrepareStatement 객체 생성 - conn 객체로부터 - query문을 실어서 보냄
//		stmt = conn.createStatement();
			pstmt = conn.prepareStatement(query);
			// 3-4 사이에 위치홀더 ? 에 값 설정
			searchWord = "%" + searchWord + "%";
			pstmt.setString(1, searchWord);
			pstmt.setString(2, searchWord);
			// 4. query문을 실행해달라고함. 그 결과값을 return 받음
			// select query 문이면 ResultSet 모양
			// insert/update/delete 문이면 int모양
			// 5. ResultSet에서 row(record)=한줄 어오기 위해 cursor(포인트)를 이동함
			result = new ArrayList<StudentVo>();
			rs = pstmt.executeQuery();
			while (rs.next() == true) {
				// 한줄 row/record 를 읽을 준비 완료
//			System.out.println(rs.getString("STUDENT_NAME"));
				StudentVo vo = new StudentVo();
				vo.setStudentNo(rs.getString("STUDENT_NO"));
				vo.setDepartmentNO(rs.getString("DEPARTMENT_NO"));
				vo.setStudentName(rs.getString("STUDENT_NAME"));
				vo.setStudentSsn(rs.getString("STUDENT_SSN"));
				vo.setStudentAddress(rs.getString("STUDENT_ADDRESS"));
				vo.setEntranceDate(rs.getDate("ENTRANCE_DATE"));
				vo.setAbsenceYn(rs.getString("ABSENCE_YN"));
				vo.setCoachProfessorNo(rs.getString("COACH_PROFESSOR_NO"));
				result.add(vo);
			}
//			System.out.println(result);

		} catch (ClassNotFoundException e) {
			// 1.driver (ojdbc.jar) 없음
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
