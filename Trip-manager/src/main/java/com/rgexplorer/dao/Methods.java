package com.rgexplorer.dao;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

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
		
		
		public void tripAmountWithOFlightCalci(BookingPojo bp){
			
			int totalPeopleAmount = 10000 * bp.getNoOfAdults() + 6000 * bp.getNoOfChildrens();
			int totalAmount = totalPeopleAmount * bp.getDateDifference();
			
			bp.setTotalPrice(totalAmount);
			
		
			
		}
		
		public int differenceDate(BookingPojo bp) {
			
			LocalDate from = LocalDate.parse(bp.getFromDate());
			LocalDate to = LocalDate.parse(bp.getToDate());
			int differenceInDays = (int) ChronoUnit.DAYS.between(from, to);
			bp.setDateDifference(differenceInDays);
			return differenceInDays;
		}
		
	}

	