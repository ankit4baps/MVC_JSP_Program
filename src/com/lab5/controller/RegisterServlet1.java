package com.lab5.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lab5.model.Registration;
import com.lab5.service.RegistrationService;
/**
 * Servlet implementation class RegisterServlet1
 */
@WebServlet("/RegisterServlet1")
public class RegisterServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String nm = request.getParameter("name");
		String add = request.getParameter("add");
		String gender = request.getParameter("gender");
		String mob = request.getParameter("mno");
		String emil = request.getParameter("email");
		Registration reg = new Registration(nm , add, gender, mob, emil);
		reg.setNm(nm);
		reg.setAdd(add);
		reg.setGender(gender);
		reg.setMno(mob);
		reg.setEmil(emil);
		
		//reg.setName(request.getParameter("name"));
		//reg.setAdd(request.getParameter("add"));
		//reg.setGender(request.getParameter("gender"));
		//reg.setMno(request.getParameter("mno"));
		
		String qryStr = "insert into `lab5`.`registration` (`name`,`add`,`gender`,`mno`,`email`)values('" + nm + "', '"+ add +"', '"+ gender +"', '"+ mob +"', '"+emil+"');";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con= RegistrationService.getConnection();
			Statement stmt = con.createStatement();
			stmt.execute(qryStr);
			stmt.close();
			
			response.sendRedirect("Submitted.html");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		out.println("<html>");
        out.println("<head><title>Registration Confirmation</title></head>");
        out.println("<body><h1>");
        out.println("Congratulations </h1>");
        out.println("</body></html>");
	}

}
