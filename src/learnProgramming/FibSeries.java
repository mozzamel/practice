package learnProgramming;

public class FibSeries {
    public static void main(String[] args) {
        int a =0;
        int b= 1;
        int fibonacci =a+b;

        System.out.println(fibonacci);
        while (fibonacci<=90){
            a =b;
            b =fibonacci;
            fibonacci = a+b;
            System.out.println(fibonacci);
        }
    }
}
