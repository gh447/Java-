import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int gameStart = 30;
        int gameEnd = 50;
        int guessTotal = 5;
        int mod = gameEnd - gameStart;
        //游戏统计
        int totalgamecount = 0;
        int correctgamecount = 0;

        //是否结束游戏
        boolean exit = false;
        while (!exit) {
            if (gameStart < 0 || gameEnd <= 0) {
                System.out.println("开始和结束的数字必须是正数");
            }
            if (mod < 1) {
                System.out.println("非法的开始和结束,(" + gameStart + "," + gameEnd + ")");
            }
            double Num = Math.random();
            int NumberToGuess = (int) ((gameEnd * 1000 * Num) % mod) + gameStart;
            if (NumberToGuess <= gameStart) {
                NumberToGuess = gameStart + 1;
            } else if (NumberToGuess >= gameEnd) {
                NumberToGuess = gameEnd - 1;
            }
            //剩余的猜测次数
            int leftToGuess = guessTotal;

            boolean currentGsmrCount = false;
            boolean correctGuess = false;

            System.out.println("请输入猜测的数字，范围在（" + gameStart + "," + gameEnd + ")，输入负数表示结束游戏");
            while (leftToGuess > 0) {
                int guess = in.nextInt();
                if (guess < 0) {
                    exit = true;
                    System.out.println("用户选择退出游戏");
                    break;
                }
                if (!currentGsmrCount) {
                    totalgamecount++;
                    currentGsmrCount = true;
                }
                leftToGuess--;
                if (guess > NumberToGuess) {
                    System.out.println("输入的数字比目标数字大");
                } else if (guess < NumberToGuess) {
                    System.out.println("输入的数字比目标数字小");
                } else {
                    System.out.println("输入的数字正确！");
                    correctgamecount++;
                    correctGuess = true;
                    break;
                }
            }
            if (!correctGuess) {
                System.out.println("本次的目标数字是" + NumberToGuess);
            }
            System.out.println("共进行了" + totalgamecount + "次游戏，" + "其中正确" + correctgamecount + "次");


        }
    }
}
