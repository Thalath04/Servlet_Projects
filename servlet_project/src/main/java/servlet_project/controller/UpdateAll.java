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

@WebServlet("/updateall")
public class UpdateAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		long number=Long.parseLong(req.getParameter("number"));
		String mail=req.getParameter("mail");
		
		StudentDto dto=new StudentDto();
		dto.setId(id);
		dto.setName(name);
		dto.setNumber(number);
		dto.setMail(mail);
		
		StudentDao dao=new StudentDao();
		dao.updateall(dto);
		List<StudentDto> l=dao.fetchAll();
		req.setAttribute("fetchall", l);
		RequestDispatcher r=req.getRequestDispatcher("fetchall.jsp");
		r.forward(req, resp);
	}
}
