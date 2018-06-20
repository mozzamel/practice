package restApi;

public class ReverseString {
    public static void main(String[] args) {
        String str = "a lazy brown fox jump over deer";
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev =rev+(str.charAt(i));
        }
        System.out.println(rev);
    }
}