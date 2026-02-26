public class Ex10 extends Ex1{
    public static void main(String[] args) {
        int[][] ma = new int[9][9];
        int somatoria = 0;
        lerMatriz(ma);
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                if (i % 2 == 0) {
                somatoria = ma[i][j] + somatoria;
            }
         }
        }
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                System.out.println(ma[i][j]);
            }
        }
    }
}
