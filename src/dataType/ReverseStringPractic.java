package dataType;

public class ReverseStringPractic {
    public static void main(String[] args) {

        String str = " a lazy dog jump over the cow";
        String Rev ="";
        for(int i =str.length()-1; i>=0;i--){
            Rev = Rev+(str.charAt(i));
        }
        System.out.println(Rev);
    }
}
