public class Ex6 extends Ex1{
    public static void main(String[] args) {
        int[][] ma = new int[6][6];
        int[][] mb = new int[6][6];
        double [][] mc = new double[6][6];
        int maiorelemento = mb[5][5];

        lerMatriz(ma);
        lerMatriz(mb);
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                if (mb.length == j - i - 1) {
                    if (mb[i][j] < maiorelemento) {
                        maiorelemento = mb[i][j];
                    }
                }
                
            }
        }
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
               mc[i][j] = ma[i][j] * maiorelemento;
            }
        }
        
    }
}
