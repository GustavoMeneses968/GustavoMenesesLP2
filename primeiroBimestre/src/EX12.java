public class EX12 extends Ex1{
    public static void main(String[] args) {
        int[][] ma = new int[12][12];
        int somatoria = 0;
        double media;
        int cont = 0;
        lerMatriz(ma);
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma.length; j++) {
                if (i > j) {
                    somatoria = ma[i][j];
                    cont++;
                }
            }
        }
        media = (double) (somatoria/cont);
    }
}
