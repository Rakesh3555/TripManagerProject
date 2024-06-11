package com.rgexplorer.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.rgexplorer.model.TripManagerPojo;

public class RgDataBaseManager {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3308/RGExplorer","root", "root");
		return connect;
	}
	
	public static void insertUserCred(TripManagerPojo tmp) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		
		String  query = "insert into UserCredentials(username, mail, mobileNumber, password , verification)values('"+tmp.getUsername()+"','"+tmp.getMail()+"','"+tmp.getMobileNumber()+"','"+tmp.getPassword()+"','Not Verified');";
		PreparedStatement build = connect.prepareStatement(query);
		
		build.executeUpdate();
		
	}
	
	public static boolean userValidation(TripManagerPojo tmp) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		
		String query = "select username, password from UserCredentials where username= '"+tmp.getUsername()+"' and password= '"+tmp.getPassword()+"' ;";
		
		PreparedStatement build = connect.prepareStatement(query);
		
		build.executeQuery();
		
		ResultSet rows = build.executeQuery();
		ResultSetMetaData metaData = rows.getMetaData();
		int columnCount = metaData.getColumnCount();

		while(rows.next()) {

			for (int i = 1; i <= columnCount; i += 1) {
				
				return true;
			}
		}
		return false;
		
	}
	
	public static void malasiyaTripFamilyPackage(String name, String phoneNumber) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		
		String query = "insert into userTripDetails(username , mobileNumber , Package ,Destination, Package_Type ) values ('"+name+"' , '"+phoneNumber+"' , 'International Trip' , ' Malaysia ', 'Family Package');";
		
		PreparedStatement build = connect.prepareStatement(query);
		
		build.executeUpdate();
		
	}
	
	public static void malasiyaTripFriendsPackage(String name, String phoneNumber) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		
		String query = "insert into userTripDetails(username , mobileNumber , Package ,Destination, Package_Type ) values ('"+name+"' , '"+phoneNumber+"' , 'International Trip' , ' Malaysia ', 'Friends Package');";
		
		PreparedStatement build = connect.prepareStatement(query);
		
		build.executeUpdate();
		
	}
	
	public static void malasiyaTripGroupPackage(String name,String phoneNumber) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		
		String query = "insert into userTripDetails(username , mobileNumber , Package ,Destination, Package_Type ) values ('"+name+"' , '"+phoneNumber+"' , 'International Trip' , ' Malaysia ', 'Group Package');";
		
		PreparedStatement build = connect.prepareStatement(query);
		
		build.executeUpdate();

	}
	
	public static String bookingTitleUpdater(TripManagerPojo tmp) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		
		String query = "select Package_Type from userTripDetails where mobileNumber ='"+tmp.getMobileNumber()+"'";
		
		PreparedStatement build = connect.prepareStatement(query);
		
		ResultSet tripName = build.executeQuery();
		
		if(tripName.next()) {
			
			return tripName.getString("Package_Type");
			
			
		}
		return null; 
		
		
	}
	
}
