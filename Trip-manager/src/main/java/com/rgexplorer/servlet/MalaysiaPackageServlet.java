package com.rgexplorer.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rgexplorer.model.TripManagerPojo;
import com.rgexplorer.util.RgDataBaseManager;

/**
 * Servlet implementation class TripPackageServlet
 */
@WebServlet("/MalaysiaPackageServlet")
public class MalaysiaPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TripManagerPojo tmp = new TripManagerPojo();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MalaysiaPackageServlet() {
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
		System.out.println("post method");
		String packageType = request.getParameter("action");
		 HttpSession details = request.getSession();
		 String name = (String) details.getAttribute("userName");
		 String mobileNumber = (String) details.getAttribute("mobileNumber");
		 String package1 = tmp.getTripPackage();
		 
		 
		 
		if(packageType.equals("familypackage")){
			try {
				RgDataBaseManager.malasiyaTripFamilyPackage(name,mobileNumber);
				RgDataBaseManager.bookingTitleUpdater(tmp);
				details.setAttribute("TripType", RgDataBaseManager.bookingTitleUpdater(tmp));
				System.out.println("Package type : " + RgDataBaseManager.bookingTitleUpdater(tmp));
				response.sendRedirect("Booking.jsp");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(packageType.equals("frindspackage")) {
			try {
				RgDataBaseManager.malasiyaTripFriendsPackage(name, mobileNumber);
				RgDataBaseManager.bookingTitleUpdater(tmp);
				details.setAttribute("TripType", RgDataBaseManager.bookingTitleUpdater(tmp));
				response.sendRedirect("Booking.jsp");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(packageType.equals("groupPackage")){
			
			try {
				RgDataBaseManager.malasiyaTripGroupPackage(name, mobileNumber);
				RgDataBaseManager.bookingTitleUpdater(tmp);
				details.setAttribute("TripType", RgDataBaseManager.bookingTitleUpdater(tmp));
				response.sendRedirect("Booking.jsp");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Engalam varathu summa");
		}
			
		
	}

}
