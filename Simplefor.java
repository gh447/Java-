public class Simplefor {
    public static void main(String[] args) {
        char ch = 'A';
        int StartNum = ch;

        for (int i = 0; i < 26; i++) {
            System.out.println((StartNum + i) + "\t" + (char) (StartNum + i));
        }
    }
}

