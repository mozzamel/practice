package restApi;

public class PracticeString {
    public static void main(String[] args) {
        // string class object can define in two ways;
        //String str ="payment $100 paid";
        //String str = new String();
        String  str = "payment $100 paid";
        String str1= "payment $600 will be paid";
        System.out.println(str.charAt(8));
        System.out.println(str1.isEmpty());
        System.out.println(str1.indexOf("w"));
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(8));

    }
}
