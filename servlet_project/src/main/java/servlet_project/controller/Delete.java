package servlet_project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.dao.StudentDao;
import servlet_project.dto.StudentDto;

@WebServlet("/delete")
public class Delete extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		StudentDao dao=new StudentDao();
		String msg=dao.delete(id);
//		resp.getWriter().print(msg);
		List<StudentDto> l=dao.fetchAll();
		req.setAttribute("fetchall", l);
		RequestDispatcher r=req.getRequestDispatcher("fetchall.jsp");
		r.forward(req, resp);
	}
}
