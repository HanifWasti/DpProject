package com.dp.project;

public class Profile {
	
	
	public Profile(String majorTeams,  String battingStyle, String bowlingStyle, String bornDate) {
	
		this.majorTeams = majorTeams;
		
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
		this.bornDate = bornDate;
	}
	String majorTeams;
	public String getMajorTeams() {
		return majorTeams;
	}
	
	public String getBattingStyle() {
		return battingStyle;
	}
	public String getBowlingStyle() {
		return bowlingStyle;
	}
	public String getBornDate() {
		return bornDate;
	}
	
	
	String battingStyle;
	String bowlingStyle;
	String bornDate;

}
