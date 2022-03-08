import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        //创建Scanner来读取用户键盘输入
        Scanner in = new Scanner(System.in);

        //游戏设置
        int rangeStart = 30;
        int rangeEnd = 50;
        int guessTotal = 5;
        //游戏统计
        int totalgamecount = 0;
        int correctGuessCount = 0;

        //是否结束游戏
        boolean gameEnd = false;
        while (!gameEnd) {
            //生成指定范围内的随机数
            int mod = rangeEnd - rangeStart;
            if (rangeStart < 0 || rangeEnd < 0) {
                System.out.println("开始和结束必须是正整数或0");
            }
            if (mod <= 1) {
                System.out.println("非法的数字范围：（" + rangeStart + "," + rangeEnd + ")");
            }
            int BigRandom = (int) (Math.random() * rangeEnd * 100);
            int numberToguess = (BigRandom % mod) + rangeStart;
            if (numberToguess <= rangeStart) {
                numberToguess = rangeStart + 1;
            } else if (numberToguess >= rangeEnd) {
                numberToguess = rangeEnd - 1;
            }
            //剩余的猜测次数
            int leftToguess = guessTotal;

            boolean currentGameCounted = false;
            boolean correctGuess = false;

            System.out.println("请输入猜测的数字，范围在（" + rangeStart + "," + rangeEnd + ")。输入-1代表结束游戏");
            while (leftToguess > 0) {
                System.out.println("剩余猜测次数" + leftToguess + "。请输入本次猜测的数字：");
                int guess = in.nextInt();
                if (guess < 0) {
                    gameEnd = true;
                    System.out.println("用户选择结束游戏");
                    break;
                }
                if (!currentGameCounted) {
                    totalgamecount++;
                    currentGameCounted = true;
                }
                leftToguess--;
                if (guess > numberToguess) {
                    System.out.println("输入的数字比目标数字大");
                } else if (guess < numberToguess) {
                    System.out.println("输入的数字比目标数字小");
                } else {
                    correctGuessCount++;
                    correctGuess = true;
                    System.out.println("输入的数字正确！");
                    break;
                }

            }
            if (!correctGuess) {
                System.out.println("本次的目标数字是" + numberToguess);
            }
            System.out.println("共进行了" + totalgamecount + "次游戏，其中正确了" + correctGuessCount + "次");
        }


    }

}
