package com.rgexplorer.servlet;

import java.io.IOException;

import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rgexplorer.dao.Mail;
import com.rgexplorer.model.TripManagerPojo;

/**
 * Servlet implementation class otpMailServlet
 */
@WebServlet("/otpMailServlet")
public class otpMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public otpMailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost( request,response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // Generate OTP
	    int otp = generateOTP();

	    
	    String mail = request.getParameter("mail");

	    
	    TripManagerPojo tmp = new TripManagerPojo();
	    tmp.setMail(mail);
	    tmp.setGeneraterOtp(String.valueOf(otp));
	   // request.getRequestDispatcher("Register.jsp").forward(request, response);
	    
	    Mail m = new Mail();
	    try {
	        m.setupServerProperties();
	        MimeMessage message =  m.draftEmail(mail, String.valueOf(otp)); 
	        m.sendEmail(message);
	        
	    } catch (Exception e) {
	        
	        e.printStackTrace(); 
	    }
	}

	
	private int generateOTP() {
	    return (int) ((Math.random() * (999999 - 100000)) + 100000);
	}


}
