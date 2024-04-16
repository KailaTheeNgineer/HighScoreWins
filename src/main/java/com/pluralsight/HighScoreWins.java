package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a score: ");
        // Home:Visitor|21:9 format
        String score = myScanner.nextLine();
        String[] breakdown = score.split(Pattern.quote("|"));

        String teamName = breakdown[0];
        String scoreBreakdown = (breakdown[1]);

        String[] teams = teamName.split(Pattern.quote(":"));

        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        String[] teamScores = scoreBreakdown.split(Pattern.quote(":"));

         int homeScore = Integer.parseInt(teamScores[0]);
         int visitorScore = Integer.parseInt(teamScores[1]);

         if (homeScore > visitorScore) {
             System.out.println("The winner is: " + homeTeam);}
         else if (homeScore < visitorScore) {
             System.out.println("The winner is:" + visitorTeam);
         }












    }



}
