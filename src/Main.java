public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("-- Udemy: Java Programming Masterclass --");
        System.out.println("-- Expressions and Statements          --");
        System.out.println("-- Code Blocks                         --");
        System.out.println("-----------------------------------------");

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

/*        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("You score was less than 1000");
        } else {
            System.out.println("Got here");
        }*/

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Game Over");
            System.out.println("Your final score was " + finalScore);
        }

        System.out.println("Second Game!");
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Game Over");
            System.out.println("Your second final score was " + finalScore);
        }
    }
}