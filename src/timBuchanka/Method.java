package timBuchanka;

public class Method {
    public static void main(String[] args) {
        displayHighScorePositions("hamid",60);

    }
    public  static void displayHighScorePositions(String playerName , int  position){
        System.out.println(playerName+ "get in to the position"+ position);

    }
    public  static  int  calculateHighScorePosition(int playerScore){
        if (playerScore>1000){
            return 1;
        }else  if (playerScore>500&& playerScore<1000){
            return 2;

        }else {
            return 4;
        }

    }
}
