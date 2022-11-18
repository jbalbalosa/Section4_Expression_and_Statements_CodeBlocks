public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("-- Udemy: Java Programming Masterclass --");
        System.out.println("-- Expressions and Statements          --");
        System.out.println("-- Code Blocks                         --");
        System.out.println("-----------------------------------------");

        boolean gameOver = true;
        int score = 999;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("You score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }
}