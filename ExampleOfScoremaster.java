import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class ExampleOfScoremaster {
    public static void main(String[] args) {
        int yuWenIndex = 0;
        int shuXueIndex = 1;
        int waiYUIndex = 2;
        int wuLiIndex = 3;
        int huaXueIndex = 4;
        int shengWuIndex = 5;

        int totalScoreCount = 6;
        String[] names = new String[totalScoreCount];
        names[yuWenIndex] = "语文";
        names[shuXueIndex] = "数学";
        names[waiYUIndex] = "外语";
        names[wuLiIndex] = "物理";
        names[huaXueIndex] = "化学";
        names[shengWuIndex] = "生物";

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入共有多少年的成绩");

        int yearCount = scanner.nextInt();

        double[][] scores = new double[yearCount][totalScoreCount];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = 80 + 20 * Math.random();
                System.out.println("第" + (i + 1) + "年" + names[j] + "的成绩是" + scores[i][j]);
            }
        }
        while (true) {
            System.out.println("请输入要进行操作的编号");
            System.out.println("1:求某年最好成绩\n" + "2:求某年平均成绩\n" + "3:求所有年份最好成绩\n" + "4:求某门课历年最好成绩");

            int oprtId = scanner.nextInt();

            int year = 0;
            switch (oprtId) {
                case 1:
                    System.out.println("请输入要求第几年的最好成绩");
                    year = scanner.nextInt()-1;
                    if (year > yearCount || year < 0) {
                        System.out.println("非法的年份");
                        break;
                    }
                    int bestScoreId = 0;
                    for (int i = 0; i < scores[year].length; i++) {
                        if (scores[year][bestScoreId] < scores[year][i]) {
                            scores[year][bestScoreId] = scores[year][i];
                        }
                    }
                    System.out.println("第" + (year + 1) + "年的最好成绩是" + names[bestScoreId] + scores[year][bestScoreId]);
                    break;
                case 2:
                    year = 0;
                    System.out.println("请输入要求哪一年的平均成绩");
                    year = scanner.nextInt();

                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }


    }
}
