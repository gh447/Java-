public class MultiDimensionArray {
    public static void main(String[] args) {
        //创建一个double类型的二维数组
        double[][] multiDimensionArr = new double[3][5];

        //循环查看每个数组元素的值，在给数组元素赋值之前，数组元素的值其实都是每种元素的初始值
        for (int i = 0; i < multiDimensionArr.length; i++){
            for(int j = 0 ;j<multiDimensionArr[i].length;j++){
                System.out.println("multiDimensionArr["+i+"]["+j+"]="+multiDimensionArr[i][j]);

                            }
        }

    }
}
  