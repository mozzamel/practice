package oOpConcept;

public class Car {
    int speed;
    private int privateSpeedd =90;

    public int getPrivateSppeed() {
        return privateSppeed;
    }

    public void setPrivateSppeed(int privateSppeed) {
        this.privateSppeed = privateSppeed;
    }

    protected  int privateSppeed =89;
    int speedLimit =100;

    public Car(int startSpeed) {
        speed = startSpeed;
    }

    public int getPrivateSpeedd() {
        return privateSpeedd;
    }

    public void setPrivateSpeedd(int privateSpeedd) {
        this.privateSpeedd = privateSpeedd;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public void increaseSpeed(){
        speed++;
        System.out.println("increase speed ");

    }
    public void decreasedSpeed(){
        speed--;
        System.out.println("decrease the speed ");
    }
}
