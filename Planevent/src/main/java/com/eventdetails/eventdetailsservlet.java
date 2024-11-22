package com.eventdetails;

import jakarta.servlet.ServletException;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.RequestDispatcher;

public class eventdetailsservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
    	
    	String usern = request.getParameter("username");
        String food = request.getParameter("menu");
        String deco = request.getParameter("decorations");
        String entertain = request.getParameter("entertainment");
        String transpo = request.getParameter("transportation");
        String transpom = request.getParameter("transportMethod");
        String passeng = request.getParameter("passengerCount");
        String concer = request.getParameter("concerns");

        try {
            List<formE>formdetails =EventdetailsDBUtil.validate(usern,food,deco,entertain,transpo,transpom,passeng,concer);
            request.setAttribute("formdetails",formdetails);
        } catch (Exception e) {
        	
            e.printStackTrace(); // Consider better error handling here.
        }

        RequestDispatcher dis = request.getRequestDispatcher("cuseventD.jsp");
        dis.forward(request, response);
    }
}
