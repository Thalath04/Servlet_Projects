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

@WebServlet("/insert")
public class Insert extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String number=req.getParameter("number");
		String mail=req.getParameter("mail");
		
		int cid=Integer.parseInt(id);
		long cnumber=Long.parseLong(number);
		
		StudentDto dto=new StudentDto();
		dto.setId(cid);
		dto.setName(name);
		dto.setNumber(cnumber);
		dto.setMail(mail);
		
		StudentDao dao=new StudentDao();
//		String msg=dao.insert(dto);
//		resp.getWriter().print(msg);
		dao.insert(dto);
		List<StudentDto> l=dao.fetchAll();
		req.setAttribute("fetchall", l);
		RequestDispatcher r=req.getRequestDispatcher("fetchall.jsp");
		r.forward(req, resp);
	}

}
