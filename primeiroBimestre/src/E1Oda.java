import java.util.Scanner;

public class E1Oda {

    final static Scanner LER = new Scanner(System.in);

   
    public static void main(String[] args) {
        double[][] matriz = new double[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 2 * i + Math.pow(j, 2);
            }
        }
    }
}
