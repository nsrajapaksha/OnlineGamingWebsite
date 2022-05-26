package com.player;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List<Player> validate(String playerID, String playerPassword) {
		
		ArrayList<Player> play = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();	
			String sql = "select * from player where playerID='"+playerID+"' and playerPassword='"+playerPassword+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String playerName = rs.getString(2);
				String gmail = rs.getString(3);
				String nationality = rs.getString(4);
				String gender = rs.getString(5);
				String age = rs.getString(6);
				String playerMode = rs.getString(7);
				String gameLevel = rs.getString(8);
				String pid = rs.getString(9);
				String ppass = rs.getString(10);
				
				Player p = new Player(id,playerName,gmail,nationality,gender,age,playerMode,gameLevel,pid,ppass);
				play.add(p);
				
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return play;
		
	}
	
	public static boolean insertplayer(String playerName,String gamil,String nationality,String gender,String age,String playerMode,String gameLevel,String playerID,String playerPassword) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();	
			String sql = "insert into player values (0,'"+playerName+"','"+gamil+"','"+nationality+"','"+gender+"','"+age+"','"+playerMode+"','"+gameLevel+"','"+playerID+"','"+playerPassword+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} 
			else {
				isSuccess = false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	public static boolean updateplayer(String id, String playerName, String gmail, String nationality, String gender, String age, String playerMode, String gameLevel, String playerID, String playerPassword) {
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update player set playerName='"+playerName+"',gmail='"+gmail+"',nationality='"+nationality+"',gender='"+gender+"',age='"+age+"',playerMode='"+playerMode+"',gameLevel='"+gameLevel+"',playerID='"+playerID+"',playerPassword='"+playerPassword+"'"
					+ "where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}
	
	public static List<Player> getPlayerDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Player> play = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from player where id='"+convertedID+"' ";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String playerName = rs.getString(2);
				String gmail = rs.getString(3);
				String nationality = rs.getString(4);
				String gender = rs.getString(5);
				String age = rs.getString(6);
				String playerMode = rs.getString(7);
				String gameLevel = rs.getString(8);
				String playerID = rs.getString(9);
				String playerPassword = rs.getString(10);
				
				Player p = new Player(id, playerName, gmail, nationality, gender, age, playerMode, gameLevel, playerID, playerPassword);
				play.add(p);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return play;
	}
	
	public static boolean deletePlayer(String Id) {
		
		int convId = Integer.parseInt(Id);
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from player where id='"+convId+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
}
