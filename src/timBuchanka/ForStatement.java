package timBuchanka;

public class ForStatement {
    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " +calculateInterest(10000.00,2.0));
        for (int i=8;i>2;i--){
            System.out.println("Calculate interest Rate of = " +i+calculateInterest(10000.00,i));
        }

    }
        public static double calculateInterest(double amount, double interestRate){
            return (amount*(interestRate/100));
    }
}
