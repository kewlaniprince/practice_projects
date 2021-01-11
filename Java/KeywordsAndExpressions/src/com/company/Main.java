package com.company;

public class Main {

    public static void main(String[] args) {

        int finalScore = calculate_score(true, 800, 5, 100);
        System.out.println("Your final score was = " + finalScore);

        finalScore = calculate_score(true, 10000, 8, 200);
        System.out.println("Your final score was = " + finalScore);

    }

    public static int calculate_score(boolean gameOver, int Score, int levelCompleted, int bonusSet) {

        if (gameOver) {
            int finalScore = Score + (levelCompleted * bonusSet);
            finalScore += 2000;
            return finalScore;
        } else {
            return 1;
        }
    }
}


//To get playerName and rank


//    public static String displayHighScorePosition(String playerName, char rank) {
//        System.out.println(playerName + " managed to get into position" + rank + " on the high score table");
//
//        public static int calculateRank; ( int Score){
//            if (Score > 1000) {
//                return 1;
//            } else if (Score > 100 && Score < 1000) {
//                return 2;
//            } else {
//                return 3;
//            }
//        }
//    }
//
//}