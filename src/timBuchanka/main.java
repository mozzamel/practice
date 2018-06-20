package timBuchanka;

public class main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println("model id "+ porsche.getModel());
        porsche.setModel("911");
        System.out.println(porsche.getModel());


    }
}
