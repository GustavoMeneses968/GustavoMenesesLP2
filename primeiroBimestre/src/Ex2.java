public class Ex2 extends Ex1{
    public static void main(String[] args) {
        int[][] ma = new int[6][6];
        int somatoria = 0;

        lerMatriz(ma);
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                if(i == j){
                     somatoria = ma[i][j] + somatoria;
                }else{
                    somatoria = 0;
                }
               
            }
        }
      
            }
        }
