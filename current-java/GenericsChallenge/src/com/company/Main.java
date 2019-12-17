package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago");


        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
//        footballLeague.add(baseballTeam);
        footballLeague.showLeagueTable();
    }
}
