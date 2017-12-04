package com.dp.project;

public class PlyerIsSelected implements IPlayer {

	String playerName;
	public PlyerIsSelected(String playerName) {
		
		this.playerName = playerName;
		
	}
	@Override
	public void availability() {
		// TODO Auto-generated method stub
		System.out.println(playerName+ "is is not available");
		
	}
	
	
	

}
