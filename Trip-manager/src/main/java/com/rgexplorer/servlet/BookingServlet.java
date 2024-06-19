package com.rgexplorer.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rgexplorer.dao.Methods;
import com.rgexplorer.model.BookingPojo;
import com.rgexplorer.model.TripManagerPojo;
import com.rgexplorer.util.RgDataBaseManager;

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
		
		System.out.println("Booking Servlet Post");
		
		HttpSession Session = request.getSession();
		String name = (String)Session.getAttribute("userName");
		String mobilenumber = (String) Session.getAttribute("mobileNumber");
		String fromDate = request.getParameter("fromDate");
		String toDate = request.getParameter("toDate");
		String noOfAdults = request.getParameter("no_Of_Adults");
		int adult = Integer.parseInt(noOfAdults);
		String noOfChildrens = request.getParameter("no_Of_Childrens");
		int childrens = Integer.parseInt(noOfChildrens);
		System.out.println("1");
//		String differenceIndate = request.getParameter("differenceInDays");
//		int dateDifference = Integer.parseInt(differenceIndate);
		BookingPojo bp = new BookingPojo();
		Methods m = new Methods();
		
		
		
		TripManagerPojo tmp = new TripManagerPojo();
		System.out.println("2");
		bp.setFromDate(fromDate);
		bp.setToDate(toDate);
		bp.setNoOfAdults(adult);
		bp.setNoOfChildrens(childrens);
		int diff = m.differenceDate(bp);
		
		System.out.println("Difference ---> " + diff);
		bp.setDateDifference(diff);
		
		System.out.println("3");
		try {
			
			RgDataBaseManager.bookingDateUpdater(bp,name,mobilenumber);
			RgDataBaseManager.bookingPaymentupdater(name);
			m.tripAmountWithOFlightCalci(bp);
			
			int packagePriceSession = bp.getTotalPrice();
		
			System.out.println("Price"+packagePriceSession);
			
			HttpSession priceSession = request.getSession();

			priceSession.setAttribute("packagePriceSession", packagePriceSession);
			
			String flightOption = (String) request.getParameter("flight_Option");
			System.out.println("--------->" + flightOption);
			if(flightOption.equals("Include Flight")) {
				response.sendRedirect("AddTravellers.jsp");
			}else if(flightOption.equals("Exclude Flight")){
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}
	
	

}
