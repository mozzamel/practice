package dataType;

public class CarClass {
    private  String color;
    private String make;
    private String model;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >2000) {
            this.year = year;
        }else {
            System.out.println("this is not valid year");
        }
    }


    public  void increaseSpeed(){
        System.out.println("car has dynamimc speed");
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getMake (){
        return this.make;
    }
}
