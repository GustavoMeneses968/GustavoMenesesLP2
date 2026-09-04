public class Ex5 extends Ex1{
    public static void main(String[] args) {
        int[][] ma = new int[6][6];
        int menorElemento = ma[0][0];

        lerMatriz(ma);
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                if (ma.length == j - i - 1) {
                    if (ma[i][j] < menorElemento) {
                        menorElemento = ma[i][j];
                    }
                }
                
            }
        }
        
                System.out.println(menorElemento);
            }
        }
    
