package com.player;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PlayerInsert")
public class PlayerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String playerName = request.getParameter("playerName");
		String gamil = request.getParameter("gamil");
		String nationality = request.getParameter("nationality");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String playerMode = request.getParameter("playerMode");
		String gameLevel = request.getParameter("gameLevel");
		String playerID = request.getParameter("playerID");
		String playerPassword = request.getParameter("playerPassword");
		
		boolean isTrue;
		
		isTrue = PlayerDBUtil.insertplayer(playerName, gamil, nationality, gender, age, playerMode, gameLevel, playerID, playerPassword);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
			
		}
		
		
		
	}

}
