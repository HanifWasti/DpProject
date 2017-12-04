package com.dp.project;

import java.util.ArrayList;

public class Player implements IPlayer {

	Profile playerProfile;
	ArrayList<Career> career = new ArrayList<Career>();
	static ArrayList<Player> players = new ArrayList<Player>();

	String playerName;
	String role;

	private Player(String playerName, String role, Profile prof, Career... careers) {
		this.playerName = playerName;
		this.role = role;
		this.playerProfile = prof;
		for (Career career : careers) {
			this.career.add(career);
		}
		
	}

	public static IPlayer createPlayer(String player, String role, Profile prof,Career...careers) {
		if (searchPlayer(player)) {
			players.add(new Player(player, role, prof,careers));
			return getPlayer(player);
		}
		return new PlyerIsSelected(player);
	}

	public static Player getPlayer(String playerName) {
		for (Player player : players) {
			if (player.playerName.equalsIgnoreCase(playerName)) {
				return player;
			}
		}
		return null;
	}

	private static boolean searchPlayer(String playerName) {
		for (Player player : players) {
			if (player.playerName.equalsIgnoreCase(playerName)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void availability() {
		// TODO Auto-generated method stub
		System.out.println(playerName + " is available for your team");

	}

}
