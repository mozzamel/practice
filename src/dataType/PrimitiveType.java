package dataType;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class PrimitiveType {
    static Byte myByte = -78;
    public static void main(String[] args) {


        // Byte = -128 to 127

        System.out.println("mybyte = "+ myByte);

        // Short =-32768  to 32768
        short myshort = 786;
        System.out.println( " myshort"+ myshort);
        // int = -2147483648 to 2147483648
        int myint = 768;
        System.out.println(myint);
        //long =8370000000
        //float = 0.0f
        // double = 89.00;
        boolean bool = true;
        System.out.println("this is the boolean value  "+ bool);
        char ch = '5';
        System.out.println(ch);


}
}