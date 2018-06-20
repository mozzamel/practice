package dataType;

public class StringMethods {
    public static void main(String[] args) {


        String str = "this is  a test string ";
        String str1= "hello";
        String str2 = "hello";
        String str3 = "welcome";
        String str4 = "";
        String str5 = "   spaces all around";

        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.concat("this is the another string"));
        System.out.println(str.contains("is"));// is will return true and false if string are in a code
        System.out.println(str.startsWith("this"));
        System.out.println(str.endsWith("this"));
        System.out.println(str.endsWith("string"));
        System.out.println(str1.equals(str2));
        System.out.println(str.indexOf('e'));
        System.out.println(str.isEmpty());
        System.out.println(str4.isEmpty());
        System.out.println(str5.trim());
        System.out.println(str.replaceAll("test","hello"));
        System.out.println(str.replace("a", " "));
        System.out.println(str.substring(5));
        char [] chArray = str.toCharArray();
        for (int i =0;i<chArray.length;i++){
        System.out.println("index  "+i +"= "+chArray[i]);
        }
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}