package timBuchanka;

public class SwitchCase {
    public static void main(String[] args) {
        int value = 9;
        if (value == 1) {
            System.out.println("print my name");
        } else if (value == 3) {
            System.out.println("print your name");
        } else {
            System.out.println("print their name");
        }


        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("value was find ");
            case 2:
                System.out.println("value was find ");
            case 3: case 4:
                System.out.println("value was find ");
        }
        char switchValues = 'A';
        switch (switchValues){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("A was not  found");
                break;
        }
        String month = "January";
        switch (month){
            case "anuary":
                System.out.println("looking for january");
                break;
            case "february":
                System.out.println("looking for Feb");
                break;
        }

    }
}