package timBuchanka;

public class IfElseStatement {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 700;
        if (score <= 5000 && score >3000) {
            System.out.println("this is final value");
        }else if (score>30000){
            System.out.println("print hasmi name");
        }else {
            System.out.println("print buchalka");
        }
    }
}
/**/