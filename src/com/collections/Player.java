package com.collections;

//  using Set

public class Player implements Comparable<Player>  {
	
	private int playerId;
	private String playerName;
	private String playerSkill;
	public Player(int playerId, String playerName, String playerSkill) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerSkill = playerSkill;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerSkill() {
		return playerSkill;
	}
	public void setPlayerSkill(String playerSkill) {
		this.playerSkill = playerSkill;
	}
	@Override
	public int compareTo(Player o) {
		if(o.playerId > this.playerId) {
			return 1;
		}
		return -1;
	}
	
	

}
