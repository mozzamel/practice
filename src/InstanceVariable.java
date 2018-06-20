public class InstanceVariable {
    int player =90 ;

    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        System.out.println(obj.player);
        InstanceVariable obj2 = new InstanceVariable();
        obj2.player=600;
        System.out.println(obj2.player);
    }
}
