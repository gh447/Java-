public class BitCalc {
    public static void main(String[] args){
        //二进制的 1111 1000
        int a = 0xF8;
        //二进制的 1111 0100
        int b = 0xF4;
        //二进制的 1111 1111
        int c = 0xFF;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        System.out.println(~c);
    }

}
