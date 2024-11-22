package com.eventdetails;

import java.util.List;

import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class EventdetailsDBUtil {
	
	private static Connection con=null;
	private static  Statement stam=null;
	private static  ResultSet rs=null;
	private static boolean isSuccess;

	public static List<formE> validate(String username,String foodm,String decm,String entertainment,String transport,String tmethod,String passeng,String concerns){
		ArrayList<formE>form=new ArrayList<>();
		
		
		
		
		try {
			
			
			con=DBconnect.getConnection();
			stam=con.createStatement();
			
			String sql="select * from eventitem where  username='"+username+"'";
			rs=stam.executeQuery(sql);
			
			if(rs.next()) {
				
				int id=rs.getInt(1);
				String user1=rs.getString(2);
				String fmenu=rs.getString(3);
				String dec=rs.getString(4);
				String ent=rs.getString(5);
				String trans=rs.getString(6);
				String transm=rs.getString(7);
				String passen=rs.getString(8);
				String concern=rs.getString(9);
				
				formE f=new formE(id,user1,fmenu,dec,ent,trans,transm,passen,concern);
				form.add(f);
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		return form;
	}
	
	public static boolean insertcustomer(String name,String menu,String theme,String enter,String transport,String tmethod,String pcount,String concern) {
		
		boolean isSuccess=false;
		
		
		try {
			
           
			
			con=DBconnect.getConnection();
			stam=con.createStatement();
			
			String sql="insert into eventitem values(0,'"+name+"','"+menu+"','"+theme+"','"+enter+"','"+transport+"','"+tmethod+"','"+pcount+"','"+concern+"' )";
			int rs=stam.executeUpdate(sql);
			
			if(rs>0) {
				
				isSuccess=true;
			}else {
				isSuccess=false;
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	
	public static boolean updatecustomer(String id,String name,String menu,String theme,String entertainment,String transport,String tmethod,String pcount,String concern) {
		
		
		try {
			

			con=DBconnect.getConnection();
			stam=con.createStatement();
			
			String sql="update eventitem set  username='" + name + "', food_menu='" + menu + "', decoration_theme='" + theme + "', entertainment='" + entertainment + "', transport='" + transport + "', transport_method='" + tmethod + "', passenger_count='" + pcount + "', concerns='" + concern + "' where id=" + id;
			 System.out.println("SQL Query: " + sql);
			 
			 int rs=stam.executeUpdate(sql);
			 
			 if(rs>0) {
				 
				 isSuccess=true;
			 }else {
				 
				 isSuccess=false;
			 }
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return isSuccess;
		
		
	}
	
	public static List<formE>getEventdetails(String id){
		
		int convertedid=Integer.parseInt(id.trim());
		ArrayList<formE> cus=new ArrayList<>();
		
		
		try {
			
			con=DBconnect.getConnection();
			stam=con.createStatement();
			String sql="select* from eventitem where id='"+convertedid+"'";
			rs=stam.executeQuery(sql);
			
			while(rs.next()) {
				
				
				
				int id1=rs.getInt(1);
				String name=rs.getString(2);
				String menu=rs.getString(3);
				String theme=rs.getString(4);
				String entertainment=rs.getString(5);
				String transport=rs.getString(6);
				String tmethod=rs.getString(7);
				String pcount=rs.getString(8);
				String concern=rs.getString(9);
				
				
				formE c=new formE(id1,name,menu,theme,entertainment,transport,tmethod,pcount,concern);
				
				cus.add(c);
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return cus;
	}
	
	public static boolean deletecustomer(String id)
	{
		
		int convid=Integer.parseInt(id.trim());
		try {
			
			
			con=DBconnect.getConnection();
			stam=con.createStatement();
			String sql= "delete from eventitem where id='"+convid+"'";
			int r=stam.executeUpdate(sql);
			
			if(r>0) {
				
				
				isSuccess=true;
			}else {
				
				
				isSuccess=false;
			}
			
		}catch(Exception e) {
			
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return isSuccess;
	}
	
	}

