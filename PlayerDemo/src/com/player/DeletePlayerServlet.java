package com.player;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeletePlayerServlet")
public class DeletePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("playid");
		boolean isTrue;
		
		isTrue = PlayerDBUtil.deletePlayer(id);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("playerinsert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Player> playDetails = PlayerDBUtil.getPlayerDetails(id);
			request.setAttribute("playDetails", playDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("playerprofileaccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
	
	}

}
