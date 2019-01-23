package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pr=res.getWriter();
		res.setContentType("text/html");
		
		String user=req.getParameter("username");
		String pass=req.getParameter("userpassword");
		
		if(user.equals("java4s") && pass.equals("java4s"))
		{
			RequestDispatcher dis=req.getRequestDispatcher("/home");
			dis.forward(req, res);
		}
		else
		{
			pr.println("Login failed.......");
		}
		pr.close();

	}

}
