package com.collections;

import java.util.Scanner;
import java.util.Set;

class TestSetDemo {
	
	public static void main(String[] args) {
		PlayerBo pbo = new PlayerBo();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Enter player id");
			int id = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter player name");
			String pName = scanner.nextLine();
			System.out.println("Enter player skill");
			String pSkill = scanner.nextLine();
			
			Player p =new Player(id, pName, pSkill);
			pbo.addPlayer(p);
			
			Set<Player> player = pbo.getAllPlayer();
			player.forEach(n->System.out.println(n.getPlayerId() + " " + n.getPlayerName() + " " + n.getPlayerSkill()));
		}
	}
}
