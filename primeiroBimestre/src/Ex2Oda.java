public class Ex2Oda {
    public static void main(String[] args) {
        double[][] ma = new double[10][10];

        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma.length; j++) {
             if (i + j % 2 == 0) {
                ma[i][j] = Math.pow(i, 2);
                ma[i][j] *= -1;
             }else{
                ma[i][j] = 2 * i * j;
             }
            }
        }
    }
}
