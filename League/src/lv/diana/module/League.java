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
	
	public void recordWinAndLoss(String winnerName, String loserName){ 
		
		Team winner;
		Team loser; 
		
		winner = this.teamWithName(winnerName);
		loser = this.teamWithName(loserName);
		
		winner.wins++;
		loser.loses++;
		
//		winner.setWins(i++);
//		loser.setLoses(i++); 
	}
	
	public void recordTies(Team a, Team b) {

		a.ties++;
		b.ties++;
	}
	
	public Team teamWithName(String nameToLookFor){
		Team teamCreated = null;
		for(Team team : this.nameOfTeams){
		if(team.name.equals(nameToLookFor));
		teamCreated = team;

		}
		return teamCreated;
	}

	
	@Override
	public String toString() {
		return "League [name=" + name + ", nameOfTeams=" + nameOfTeams + "]";
	} 
	
	

}
