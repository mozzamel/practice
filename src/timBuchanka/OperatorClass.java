package timBuchanka;




//  == equal,
// != is not equal;
// ||= or;
//
public class OperatorClass {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        result= result-2;
        System.out.println(result);
        boolean isAllien = false;
        if (isAllien==true)
            System.out.println("this is not allien");
        int topScore = 100;
        if (topScore<=100)
            System.out.println("this is another top scorer");
        int  secondTopScore =60;
        if (topScore>secondTopScore&&topScore<=100)
            System.out.println("greater than top score");

double myFirstValue =20;
double mySecondValue =80;
double mytotal =myFirstValue+ mySecondValue*25;
double reminder = mytotal%40;
if (reminder<=20)
    System.out.println("total was over the limit");

    }
}