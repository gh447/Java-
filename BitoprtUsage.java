public class BitoprtUsage {
    public static void main(String[] args){
        int base = 1;
        int is_student_mask = base;           //二进制 0001；
        int is_programmer_mask = base << 1;   //base左移一位 0010；
        int is_driver_mask = base << 2;       //base左移两位 0100；
        int is_painter_msak = base << 3;      //base左移三位  1000；

        int data = 5;                         //二进制是0101；

        boolean isStudent = (data & is_student_mask) != 0;
        //0101与0001按位并 =1；输出true
        System.out.println(isStudent);

        boolean isProgrammer = (data & is_programmer_mask) != 0;
        //0110与0010按位并 =0；输出false
        System.out.println(isProgrammer);

        boolean isDriver = (data & is_driver_mask) != 0;
        //0101与0100按位并 =1；输出true
        System.out.println(isDriver);

        boolean isPainter = (data & is_painter_msak) != 0;
        //0101与1000按位并 =0；输出false
        System.out.println(isPainter);
    }
}
