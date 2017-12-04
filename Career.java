package com.dp.project;

public class Career {
	String careerName;
	int fifty,hundreds,avg,innings,runs,hisghScore,strikeRate;
	public Career(String careerName, int innings, int hisghScore, int runs, int strikeRate, int fifty,
			int hundreds) {
		super();
		this.careerName = careerName;
		this.innings = innings;
		this.hisghScore = hisghScore;
		this.runs = runs;
		this.strikeRate = strikeRate;
		this.fifty = fifty;
		this.hundreds = hundreds;
		this.avg=this.runs/this.innings;
	}
	public String getCareerName() {
		return careerName;
	}
	public int getFifty() {
		return fifty;
	}
	public int getHundreds() {
		return hundreds;
	}
	public int getAvg() {
		return avg;
	}
	public int getInnings() {
		return innings;
	}
	public int getRuns() {
		return runs;
	}
	public int getHisghScore() {
		return hisghScore;
	}
	public int getStrikeRate() {
		return strikeRate;
	}

}
