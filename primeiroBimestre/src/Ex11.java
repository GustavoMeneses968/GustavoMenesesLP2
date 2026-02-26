public class Ex11 extends Ex1{
    public static void main(String[] args) {
        int[][] ma = new int[6][6];
        int diagnal = ma.length;
        
        lerMatriz(ma);
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                ma[i][j] *= ma[diagnal][j];
                diagnal--;
            }
        }
    }
}
