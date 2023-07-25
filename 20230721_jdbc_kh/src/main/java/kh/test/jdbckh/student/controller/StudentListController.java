package kh.test.jdbckh.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.jdbckh.student.model.dao.StudentDao;
import kh.test.jdbckh.student.model.vo.StudentVo;

/**
 * Servlet implementation class StudentListController
 */
@WebServlet("/student/list")
public class StudentListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/student/list doGet() 진입");
		String searchWord = request.getParameter("searchWord");
		
		
		StudentDao dao = new StudentDao();
		List<StudentVo> result = null;
		if(searchWord != null) {
//			System.out.println("[ejkim] :" + searchWord);
			result = dao.selectListStudent(searchWord);

		}else {
			 result = dao.selectListStudent();
		}
//		List<StudentVo> result = dao.selectListStudent();
		request.setAttribute("studentList",result);
		if(searchWord != null) {
			request.setAttribute("searchWord", searchWord);
		}
		request.setAttribute("aaa", "그냥속성값테스트해봄");
		request.setAttribute("bbb", "그냥속성값테스트해봄2");
		request.getRequestDispatcher("/WEB-INF/view/student/list.jsp").forward(request,response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
