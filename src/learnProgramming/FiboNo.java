package learnProgramming;

public class FiboNo {
    public static void main(String[] args) {
//011235

        int firstNo = 0;
        int secondNo = 1;
        int n= 40;
        int fiboNo= firstNo+secondNo;
        System.out.print(firstNo+" "+secondNo);
        for(int i =3;i<n;i++){
            fiboNo= firstNo+secondNo;
            System.out.print(" "+fiboNo);
            firstNo = secondNo;
            secondNo = fiboNo;

        }
    }
}