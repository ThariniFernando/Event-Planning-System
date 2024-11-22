package com.eventdetails;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;


public class updatecusservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public updatecusservlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id=request.getParameter("cusid");
		String name=request.getParameter("username");
		String menu=request.getParameter("menu");
		String theme=request.getParameter("decorations");
		String entertainment=request.getParameter("entertainment");
		String transport=request.getParameter("transportation");
		String tmethod=request.getParameter("transportMethod");
		String pcount=request.getParameter("passengerCount");
		String concern=request.getParameter("concerns");
		
		boolean isTrue;
		
		isTrue=EventdetailsDBUtil.updatecustomer(id, name, menu, theme, entertainment, transport, tmethod, pcount, concern);
		
		if(isTrue==true) {
			
			List<formE> formdetails=EventdetailsDBUtil.getEventdetails(id);
			request.setAttribute("formdetails",formdetails);
			
			
			RequestDispatcher dis=request.getRequestDispatcher("cuseventD.jsp");
			dis.forward(request,response);
		}
		
		

		else {
			

			List<formE> formdetails=EventdetailsDBUtil.getEventdetails(id);
			request.setAttribute("formdetails",formdetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("cuseventD.jsp");
			dis.forward(request,response);
		}
	}

}
