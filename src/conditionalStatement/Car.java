package conditionalStatement;

public class Car {
        private String color;
        private String make;
        private String model;

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }
        public void setMake(String mak){
                this.make=mak;
        }
        public String  getMake(){
                return this.make;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public static void  increaseSpeed(){
            System.out.println("Increasing speed");
        }

}
