public class ScoreArrayMaxScore {
    public static void main(String[] args) {
        //声明6个变量，分别代表六门科目成绩的索引
        int yuwen = 0;
        int shuxue = 1;
        int waiyu = 2;
        int wuli = 3;
        int huaxue = 4;
        int shengwu = 5;

        int totalScoreCount = 6;
        //每门课的成绩
        double[] scores = new double[totalScoreCount];

        //每门课的名字
        String[] scoreNames = new String[totalScoreCount];
        scoreNames[yuwen] = "语文";
        scoreNames[shuxue] = "数学";
        scoreNames[waiyu] = "外语";
        scoreNames[wuli] = "物理";
        scoreNames[huaxue] = "化学";
        scoreNames[shengwu] = "生物";

        //用随机数给成绩赋值
        for (int i = 0; i < totalScoreCount; i++) {
            scores[i] = 80 + Math.random() * 20;
            System.out.println(scoreNames[i] + "的成绩是" + scores[i]);
        }

        double maxScore = 0;
        int maxScoreIndex = -1;
        for (int i = 0; i < totalScoreCount; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxScoreIndex = i;
            } 
        }
        System.out.println("最好成绩科目是" + scoreNames[maxScoreIndex] + ":" + maxScore);
    }
}
 