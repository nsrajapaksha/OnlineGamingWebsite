package com.player;

public class Player {
	private int id;
	private String playerName;
	private String gmail;
	private String nationality;
	private String gender;
	private String age;
	private String playerMode;
	private String gameLevel;
	private String playerID;
	private String playerPassword;
	
	public Player(int id, String playerName, String gmail, String nationality, String gender, String age, String playerMode,
			String gameLevel, String playerID, String playerPassword) {
		
		this.id = id;
		this.playerName = playerName;
		this.gmail = gmail;
		this.nationality = nationality;
		this.gender = gender;
		this.age = age;
		this.playerMode = playerMode;
		this.gameLevel = gameLevel;
		this.playerID = playerID;
		this.playerPassword = playerPassword;
	}

	public int getId() {
		return id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getGmail() {
		return gmail;
	}

	public String getNationality() {
		return nationality;
	}

	public String getGender() {
		return gender;
	}

	public String getAge() {
		return age;
	}

	public String getPlayerMode() {
		return playerMode;
	}

	public String getGameLevel() {
		return gameLevel;
	}

	public String getPlayerID() {
		return playerID;
	}

	public String getPlayerPassword() {
		return playerPassword;
	}

	
	
}
