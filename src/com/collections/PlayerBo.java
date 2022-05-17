package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class PlayerBo {
	
	Set<Player> setOfPlayer = new TreeSet<>();
	
	public void addPlayer(Player player) {
		setOfPlayer.add(player);
	}
	
	public Set<Player> getAllPlayer() {
		return setOfPlayer;
	}

}

