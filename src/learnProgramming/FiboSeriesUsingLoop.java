package learnProgramming;

public class FiboSeriesUsingLoop {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int fibo;
        System.out.println(a);
        System.out.println(b);
                      for (int i=3; i <10;i++){
                           fibo = a+b;
                          System.out.println(fibo);
                          a =b;
                          b= fibo;
                      }

        }

      }


