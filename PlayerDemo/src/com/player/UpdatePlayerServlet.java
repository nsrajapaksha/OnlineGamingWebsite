package com.player;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdatePlayerServlet")
public class UpdatePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("playid");
		String playerName = request.getParameter("playerName");
		String gmail = request.getParameter("gmail");
		String nationality = request.getParameter("nationality");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String playerMode = request.getParameter("playerMode");
		String gameLevel = request.getParameter("gameLevel");
		String playerID = request.getParameter("playerID");
		String playerPassword = request.getParameter("playerPassword");
		
		boolean isTrue;
		
		isTrue = PlayerDBUtil.updateplayer(id, playerName, gmail, nationality, gender, age, playerMode, gameLevel, playerID, playerPassword);
		
		if(isTrue == true) {
			
			List<Player> playDetails = PlayerDBUtil.getPlayerDetails(id);
			request.setAttribute("playDetails", playDetails);
					
			RequestDispatcher dis = request.getRequestDispatcher("playerprofileaccount.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Player> playDetails = PlayerDBUtil.getPlayerDetails(id);
			request.setAttribute("playDetails", playDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("playerprofileaccount.jsp");
			dis.forward(request, response);
			
		}

	}

}
