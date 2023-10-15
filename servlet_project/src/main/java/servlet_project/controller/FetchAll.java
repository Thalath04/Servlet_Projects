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

@WebServlet("/fetchall")
public class FetchAll extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao=new StudentDao();
		List<StudentDto> l=dao.fetchAll();
		req.setAttribute("fetchall", l);
		RequestDispatcher r=req.getRequestDispatcher("fetchall.jsp");
		r.forward(req, resp);
	}
}
