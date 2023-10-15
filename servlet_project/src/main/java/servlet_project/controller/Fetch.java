package servlet_project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.dao.StudentDao;
import servlet_project.dto.StudentDto;

@WebServlet("/fetch")
public class Fetch extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		
		StudentDao dao=new StudentDao();
		StudentDto dto=(StudentDto) dao.fetch(cid);
		
			req.setAttribute("fetch", dto);
			RequestDispatcher r=req.getRequestDispatcher("fetchid.jsp");
			r.forward(req, resp);		
	}
}
