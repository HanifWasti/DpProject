package com.dp.project;

import java.util.ArrayList;

public class MakeTeam {
	String teamName;
	ArrayList<IPlayer> teamPlayers=new ArrayList<IPlayer>();
	
	public MakeTeam(String teamName,IPlayer... players)
	{
		this.teamName=teamName;
		for (IPlayer player : players) {
			teamPlayers.add(player);
		}
		showTeamMembers();
	}
	
	public void showTeamMembers()
	{
		System.out.println("\nTeam Name "+teamName);
		for (IPlayer player : teamPlayers) {
			System.out.print("Team Members :");
			player.availability();
		}
	}

}
