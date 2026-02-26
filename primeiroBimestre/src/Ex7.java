public class Ex7 extends Ex1{
    public static void main(String[] args) {
        int[][] ma = new int[4][6];
        int[][] mb = new int[6][4];
        int[][] mc = new int [ma.length][mb[0].length];
        int colunas = 0;
        int colunaA = ma[0].length;
        int colunab = mb[0].length;
        lerMatriz(ma);
        lerMatriz(mb);
        for (int i = 0; i < mc.length; i++) {
            for (int j = 0; j < mc.length; j++) {
                mc[i][colunas] += ma[i][j] + mb[j][colunas];

                if (j == colunaA && colunas < colunab - 1) {
                    j = -1;
                    colunas++;
                }
            }
            colunas = 0;
        }
    }
}
