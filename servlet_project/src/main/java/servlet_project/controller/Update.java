package servlet_project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project.dao.StudentDao;
@WebServlet("/update")
public class Update extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		long number=Long.parseLong(req.getParameter("number"));
		
		StudentDao dao=new StudentDao();
		String msg=dao.update(id, number);
		resp.getWriter().print(msg);
	}
}
