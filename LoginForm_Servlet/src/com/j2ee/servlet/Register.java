package com.j2ee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String mob=request.getParameter("mob");
		String dob=request.getParameter("dob");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
	if(RegisterDao.insert(uname,pwd,fname,mname,lname,email,mob,dob)==1){
		response.sendRedirect("regsuccess.jsp");
	}
	else
	{
	
	}
}
}
