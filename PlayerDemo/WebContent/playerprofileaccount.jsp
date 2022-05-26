<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="footer.css">
<link rel="stylesheet" type="text/css" href="header.css">
<link rel="stylesheet" type="text/css" href="image.css">
<link rel="stylesheet" type="text/css" href="playerprofileaccount.css">

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
<br>
<center>
<div class="container">
   <table>
	<c:forEach var="play" items="${playDetails}">
	
	<c:set var="id" value="${play.id}"/>
	<c:set var="playerName" value="${play.playerName}"/>
	<c:set var="gmail" value="${play.gmail}"/>
	<c:set var="nationality" value="${play.nationality}"/>
	<c:set var="gender" value="${play.gender}"/>
	<c:set var="age" value="${play.age}"/>
	<c:set var="playerMode" value="${play.playerMode}"/>
	<c:set var="gameLevel" value="${play.gameLevel}"/>
	<c:set var="playerID" value="${play.playerID}"/>
	<c:set var="playerPassword" value="${play.playerPassword}"/>
	
	
	<tr>
		<td>ID</td>
		<td>${play.id}</td>
	</tr>
	<tr>
		<td>Player Name</td>
		<td>${play.playerName}</td>
	</tr>
	<tr>
		<td>Player Gmail</td>
		<td>${play.gmail}</td>
	</tr>
	<tr>
		<td>Player Nationality</td>
		<td>${play.nationality}</td>
	</tr>
	<tr>
		<td>Player Gender</td>
		<td>${play.gender}</td>
	</tr>
	<tr>
		<td>Player Age</td>
		<td>${play.age}</td>
	</tr>
	<tr>
		<td>Player Mode</td>
		<td>${play.playerMode}</td>
	</tr>
	<tr>
		<td>Game Level</td>
		<td>${play.gameLevel}</td>
	</tr>
	<tr>
		<td>Player ID</td>
		<td>${play.playerID}</td>
	</tr>
	<tr>
		<td>Player Password</td>
		<td>${play.playerPassword}</td>
	</tr>
	
	</c:forEach>
	</table>
	<br>
	
	<c:url value="updateplayer.jsp" var="playupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="playerName" value="${playerName}"/>
		<c:param name="gmail" value="${gmail}"/>
		<c:param name="nationality" value="${nationality}"/>
		<c:param name="gender" value="${gender}"/>
		<c:param name="age" value="${age}"/>
		<c:param name="playerMode" value="${playerMode}"/>
		<c:param name="gameLevel" value="${gameLevel}"/>
		<c:param name="playerID" value="${playerID}"/>
		<c:param name="playerPassword" value="${playerPassword}"/>
	</c:url>
	
	<a href="${playupdate}">
	<input type="submit" name="update" value="Update My Data">
	</a>
	
	<br> <br>
	
	<c:url value="deleteplayer.jsp" var="playdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="playerName" value="${playerName}"/>
		<c:param name="gmail" value="${gmail}"/>
		<c:param name="nationality" value="${nationality}"/>
		<c:param name="gender" value="${gender}"/>
		<c:param name="age" value="${age}"/>
		<c:param name="playerMode" value="${playerMode}"/>
		<c:param name="gameLevel" value="${gameLevel}"/>
		<c:param name="playerID" value="${playerID}"/>
		<c:param name="playerPassword" value="${playerPassword}"/>
	</c:url>
	<a href="${playdelete}">
	<input type="submit" name="delete" value="Delete My Account">
	</a>
	<br><br>
	<a href="success.jsp">
	<input type="submit" name="Play" value="Play Game">
	</div>
	</center>
	
	</body>

</body>
<br><br><br><br>

<hr>

<footer>
  <p>Copyright &copy; 2021 All Rights Reserved by <br>
  <a href="https://www.miniclip.com/games/en/#privacy-settings">miniclip games.com</a></p>
</footer>

</html>