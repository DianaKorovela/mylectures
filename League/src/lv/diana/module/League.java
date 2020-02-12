package lv.diana.module;

import java.util.ArrayList;

public class League {
	
	private String nameOfLeague;
	private ArrayList<Team> nameOfTeams;

	public League(String leagueName){
		this.nameOfLeague = leagueName; 
		this.nameOfTeams = new ArrayList <>(); 
		
	}
	
	public String getNameOfLeague() {
		return nameOfLeague;
	}
	
	public void setName(String nameOfLeague) {
		this.nameOfLeague = nameOfLeague;
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
		return "League [nameOfLeague=" + nameOfLeague + ", nameOfTeams=" + nameOfTeams + "]";
	} 
	
	

}
