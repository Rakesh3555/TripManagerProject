package com.rgexplorer.dao;

import javax.mail.internet.MimeMessage;

import com.rgexplorer.model.BookingPojo;
import com.rgexplorer.model.TripManagerPojo;

public class Methods {

	public void  generateotp(){
		
		    int otp = generateOTP();
		    
		    TripManagerPojo tmp = new TripManagerPojo();
		    
		    tmp.setGeneraterOtp(String.valueOf(otp));   
		}

		public int generateOTP() {
		    return (int) ((Math.random() * (999999 - 100000)) + 100000);
		}
		
		
		public void tripAmountCalci(BookingPojo bp){
			
			int totalPeopleAmount = 9000 * bp.getNoOfAdults() + 5000 * bp.getNoOfChildrens();
			
			
			
			
		}
		
	}

	