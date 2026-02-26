import java.util.Scanner;

public class Ex1 {

    final static Scanner LER = new Scanner(System.in);
    
    public static void lerMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = LER.nextInt();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        int[][] ma = new int[5][5];
        int[][] mb = new int[5][5];

        lerMatriz(ma);
        lerMatriz(mb);
        for (int i = 0; i < mb.length; i++) {
            for (int j = 0; j < mb.length; j++) {
                mb[i][j] = ma[i][j];
            }
        }
        for (int i = 0; i < mb.length; i++) {
            for (int j = 0; j < mb.length; j++) {
                System.out.println(mb[i][j]);
            }
        }
    }
}
