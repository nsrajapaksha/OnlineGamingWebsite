<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="footer.css">
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="image.css">
<link rel="stylesheet" type="text/css" href="deleteplayer.css">

<div class="header">

<center>
<h1 style="background-color:MediumSeaGreen;">MINICLIP GAMES</h1>
</center>

  <div class="header-right">
    <a href="#">Home</a>
    <a href="#">Games</a>
	<a href="#">Play Game</a>
	<a href="#">Admin</a>
	<a href="#">Login</a>
  </div>
</div>
</head>
<body>

	<%
	    String id = request.getParameter("id");
		String playerName = request.getParameter("playerName");
		String gmail = request.getParameter("gmail");
		String nationality = request.getParameter("nationality");
		String gender= request.getParameter("gender");
		String age = request.getParameter("age");
		String playerMode = request.getParameter("playerMode");
		String gameLevel = request.getParameter("gameLevel");
		String playerID = request.getParameter("playerID");
		String playerPassword = request.getParameter("playerPassword");
	
	%>
	
	<center>
	
	<div class="container">
	
	<h1 style="color:blue;">Player Profile Delete</h1>
	<form action="delete" method="post">
		ID<br><input type="text" name="playid" value="<%= id %>" readonly><br><br>
		Player Name<br><input type="text" name="playerName" value="<%= playerName %>" readonly><br><br>
		Player Gmail<br><input type="text" name="gmail" value="<%= gmail %>"><br><br>
		Player Nationality<br><input type="text" name="nationality" value="<%= nationality %>" readonly><br><br>
		Player Gender<br><input type="text" name="gender" value="<%= gender %>" readonly><br><br>
		Player Age<br><input type="text" name="age" value="<%= age %>" readonly><br><br>
		Player Mode<br><input type="text" name="playerMode" value="<%= playerMode %>" readonly><br><br>
		Game Level<br><input type="text" name="gameLevel" value="<%= gameLevel %>" readonly><br><br>
		Player ID<br><input type="text" name="playerID" value="<%= playerID %>" readonly><br><br>
		
		
		<input type="submit" name="submit" value="Delete Player Profile">
	</form>
	</div>
	</center>

</body>
<br><br><br><br>

<hr>

<footer>
  <p>Copyright &copy; 2021 All Rights Reserved by <br>
  <a href="https://www.miniclip.com/games/en/#privacy-settings">miniclip games.com</a></p>
</footer>

</html>