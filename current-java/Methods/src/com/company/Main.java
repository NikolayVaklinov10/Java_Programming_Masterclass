package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore =  calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore =  calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        // calling the two methods
        int highScorePosition = calculateHighScorePosition(1500);
        displayScorePosition("Nick", highScorePosition);



        highScorePosition = calculateHighScorePosition(900);
        displayScorePosition("Didi", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayScorePosition("Ani", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayScorePosition("Ralitsa", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayScorePosition("Kristina",highScorePosition);


    }

    //the challenge
    public static void displayScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        }else if(playerScore >= 500){
//            return 2;
//        }else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;
        int position = 4; // assuming position 4 will be returned

        if(playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >= 100){
            position = 3;
        }
        return position;
    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;

        }
        return -1;
    }

}
