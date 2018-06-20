package interfaceDemo;

public class AustralianTrafic implements CentralTrafic,ContinentalInterface{
    public static void main(String[] args) {
        CentralTrafic obj = new AustralianTrafic();
        AustralianTrafic obj1 = new AustralianTrafic();
        ContinentalInterface obj2 = new AustralianTrafic();
obj.goGreen();
obj.slowYellow();
obj.stopRed();
obj1.importantInformation();
obj2.trainSymbol();

    }

    @Override
    public void goGreen() {
        System.out.println("move when light green");
    }

    @Override
    public void stopRed() {
        System.out.println("stop when light red");
    }

    @Override
    public void slowYellow() {
        System.out.println("move slow when light yellow");
    }


    public void importantInformation(){
        System.out.println("this information will be on the way to your home ");
    }

    @Override
    public void trainSymbol() {
        System.out.println("whenEver you see train station plese stop");

    }
}
