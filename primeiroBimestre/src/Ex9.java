public class Ex9 extends Ex1{
    public static void main(String[] args) {
        int[][] ma = new int[10][10];
        int[] auxiliar = new int[4];
        lerMatriz(ma);
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                    auxiliar[0] = ma[8][j];
                    ma[8][j] = ma[i][j];
                    ma[i][j] = auxiliar[0];
                
                    auxiliar[1] = ma[i][4];
                    ma[i][4] = ma[i][10];
                    ma[i][10] = auxiliar[1];
                
                    auxiliar[2] = ma[i][i];
                    ma[i][i] = ma[i][ma.length - 1 - i];
                    ma[i][ma.length - 1 -i] = auxiliar[2];

                    auxiliar[3] = ma[5][j];
                    ma[5][j] = ma[i][10];
                    ma[i][10] = auxiliar[3];
            }
        }
        for (int i = 0; i < auxiliar.length; i++) {
            for (int j = 0; j < auxiliar.length; j++) {
                System.out.println(ma[i][j]);
            }
        }
    }
}
