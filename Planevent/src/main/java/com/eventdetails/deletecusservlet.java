package com.eventdetails;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class deletecusservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		String id=request.getParameter("cusid");
		
		boolean isTrue;
		
		isTrue=EventdetailsDBUtil.deletecustomer(id);
		
		if(isTrue==true)
			
		{
			
			RequestDispatcher dis=request.getRequestDispatcher("customerinsert.jsp");
			dis.forward(request,response);
		}else {
			
			List<formE> formdetails=EventdetailsDBUtil.getEventdetails(id);
			request.setAttribute("formdetails",formdetails);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("cuseventD.jsp");
			dispatcher.forward(request,response);
			
		}
		
	}

}
