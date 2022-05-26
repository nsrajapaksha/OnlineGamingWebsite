package com.player;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PlayerProfileServlet")
public class PlayerProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String playerID = request.getParameter("pid");
		String playerPassword = request.getParameter("pass");
		
		try {
			List<Player> playDetails = PlayerDBUtil.validate(playerID, playerPassword);
			request.setAttribute("playDetails", playDetails);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher("playerprofileaccount.jsp");
		dis.forward(request, response);
		
		
	}

}
