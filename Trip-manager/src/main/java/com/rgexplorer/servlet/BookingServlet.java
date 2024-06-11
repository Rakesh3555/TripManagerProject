package com.rgexplorer.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rgexplorer.model.BookingPojo;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String fromDate = request.getParameter("fromDate");
		String toDate = request.getParameter("toDate");
		String noOfAdults = request.getParameter("no_Of_Adults");
		int adult = Integer.parseInt(noOfAdults);
		String noOfChildrens = request.getParameter("no_Of_Childrens");
		int childrens = Integer.parseInt(noOfChildrens);
		
		BookingPojo bp = new BookingPojo();
		
		bp.setFromDate(fromDate);
		bp.setToDate(toDate);
		bp.setNoOfAdults(adult);
		bp.setNoOfChildrens(childrens);
		
		
	}

}
