package inheritanceDemo;

public class ChildClassDemo extends parentClassDemo {
    public void engineColor(){
        System.out.println(color);
    }

    public static void main(String[] args) {
        ChildClassDemo obj = new ChildClassDemo();
        obj.engineColor();

    }

}
