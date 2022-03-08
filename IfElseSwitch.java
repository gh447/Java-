public class IfElseSwitch {
    public static void main(String[] args) {
        int n = 10;
        String ret = n + "对应的汉字是";

        switch (n) {
            case 1:
                ret += "壹";
                break;
            case 2:
                ret += "贰";
                break;
            case 3:
                ret += "叁";
                break;
            case 4:
                ret += "肆";
                break;
            case 5:
                ret += "伍";
                break;
            case 6:
                ret += "陆";
                break;
            case 7:
                ret += "柒";
                break;
            case 8:
                ret += "捌";
                break;
            case 9:
                ret += "玖";
                break;

            default:
                System.out.println("超出范围");
        }
        System.out.println(ret);

    }
}
