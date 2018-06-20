package conditionalStatement;

public class ClassDemo {
    public static void main (String []args){
        Car bmw = new Car();
        bmw.setMake("BMW");
        System.out.println(bmw.getMake());

        Car Toyota = new Car();
        Toyota.setMake("TOYOTA");
        System.out.println(Toyota.getMake());

    }
}
