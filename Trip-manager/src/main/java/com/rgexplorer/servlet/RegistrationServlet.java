package com.rgexplorer.servlet;

import java.io.IOException;

import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rgexplorer.dao.Mail;
import com.rgexplorer.dao.Methods;
import com.rgexplorer.model.TripManagerPojo;
import com.rgexplorer.util.RgDataBaseManager;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		
		
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String mobileNumber = request.getParameter("mobileNumber");
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		
		TripManagerPojo tmp = new TripManagerPojo();
		session.setAttribute("userName", username);
		session.setAttribute("mobileNumber", mobileNumber);
		tmp.setUsername(username);
		tmp.setMobileNumber(mobileNumber);
		tmp.setMail(mail);
		session.setAttribute("email", mail);
		tmp.setPassword(password);
		
		
		try {
			
			RgDataBaseManager rgdb = new RgDataBaseManager();
			rgdb.insertUserCred(tmp);
			

			 int generateOTP = (int)  ((Math.random() * (999999 - 100000)) + 100000);
		    
		    
		    
		    tmp.setGeneraterOtp(String.valueOf(generateOTP));
		 
		  
		
			Mail m = new Mail();
			m.setupServerProperties();
			MimeMessage message = m.draftEmail(mail, tmp.getGeneraterOtp());
			m.sendEmail(message);
			request.setAttribute("otp",generateOTP );
//			response.sendRedirect("VerifyMail.jsp");
			RequestDispatcher dp=request.getRequestDispatcher("VerifyMail.jsp");
			dp.forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
