package com.dp.project;

public class TeamMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Career c1=new Career("ODI", 22, 134, 2000, 98, 4, 3);
		Career c2=new Career("TEST", 12, 200, 2500, 76, 2, 5);
		Career c3=new Career("T20I", 50, 97, 5000, 150, 16, 0);
		Profile p=new Profile("Pakistan,KKR,HBL,QGL", "Right Hand Bat", "Left Arm Fast", "31-dec-1997");
		
	    MakeTeam KKR=new MakeTeam("KKR", Player.createPlayer("Ahmed Shehzad", "Batsman", p, c1,c2,c3),Player.createPlayer("Sarfaraz Ahmed", "Batsman", p, c1,c2,c3),Player.createPlayer("Jaques Kallis", "Batsman", p, c1,c2,c3));
	    MakeTeam Sydney=new MakeTeam("SydneyThunders", Player.createPlayer("Harchelle Gibbs", "Batsman", p, c1,c2,c3),Player.createPlayer("Mike Hussey", "Batsman", p, c1,c2,c3),Player.createPlayer("Brenodn Taylor", "Batsman", p, c1,c2,c3));
		

	}

}
