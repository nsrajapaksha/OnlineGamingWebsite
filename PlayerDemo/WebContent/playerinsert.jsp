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
<link rel="stylesheet" type="text/css" href="playerinsert.css">
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
<center>
<div class="container">
	<form action="insert" method="post">
		Player Name<br><input type="text" name="playerName" required><br><br>
		Player Gmail<br><input type="text" name="gamil" required><br><br>
		Player Nationality<br><input type="text" name="nationality" required><br><br>
		Player Gender<br><input type="text" name="gender" required><br><br>
		Player Age<br><input type="text" name="age" required><br><br>
		Player Mode<br><input type="text" name="playerMode" required><br><br>
		Game Level<br><input type="text" name="gameLevel" required><br><br>
		Player ID<br><input type="text" name="playerID" required><br><br>
		Player Password<br><input type="text" name="playerPassword" required><br><br>
		
		<input type="submit" name="submit" value="Create Player Profile">
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