package com.eventdetails;

import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;


public class customerinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public customerinsert() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("username");
		String menu=request.getParameter("menu");
		String theme=request.getParameter("decorations");
		String entertainment=request.getParameter("entertainment");
		String transport=request.getParameter("transportation");
		String tmethod=request.getParameter("transportMethod");
		String passenger=request.getParameter("passengerCount");
		String concern=request.getParameter("concerns");
		
		boolean isTrue;
		isTrue=EventdetailsDBUtil.insertcustomer(name, menu, theme, entertainment, transport, tmethod, passenger, concern);
		
		if(isTrue==true)
			
		{
			RequestDispatcher dis=request.getRequestDispatcher("success.jsp");
			dis.forward(request,response);
		}else {
			RequestDispatcher dis2=request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request,response);
		}
	}

}
