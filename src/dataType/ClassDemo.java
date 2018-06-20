package dataType;

public class ClassDemo {
    public static void main(String[] args) {
        CarClass obj = new CarClass();
        obj.setMake("Toyota camry");
        System.out.println(obj.getMake());
        obj.setModel("C300");
        System.out.println(obj.getModel());
        obj.setYear(1998);
        System.out.println(obj.getYear());
    }
}