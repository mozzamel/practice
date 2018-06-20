package timBuchanka;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    public void setModel(String model){
        String validmodel = model.toLowerCase();
        if (validmodel.equals("corolla")|| validmodel.equals("commondoor")){
            this.model= model;
        }else {
            this.model= "unknown";
        }
    }

public  String getModel(){
        return this.model;
}
}
