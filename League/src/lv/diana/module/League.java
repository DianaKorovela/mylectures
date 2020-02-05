package lv.diana.module;

import java.util.ArrayList;

public class League {
	
	private String name;
	private ArrayList<Team> nameOfTeams;

	public League(String leagueName){
		this.name = leagueName; 
		this.nameOfTeams = new ArrayList <>(); 
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Team> getNameOfTeams() {
		return nameOfTeams;
	}
	public void setNameOfTeams(ArrayList<Team> nameOfTeams) {
		this.nameOfTeams = nameOfTeams;
	}
	
	public void recordWinAndLoss(Team winner, Team loser){
		winner.setWins(1);
		loser.setLoses(1); 
	}

	@Override
	public String toString() {
		return "League [name=" + name + ", nameOfTeams=" + nameOfTeams + "]";
	} 
	
	

}
