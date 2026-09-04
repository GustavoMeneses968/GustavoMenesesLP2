import java.util.Scanner;

public class Ex8 extends Ex1{

    final static Scanner LER = new Scanner(System.in);

    static void lerMatriz(double[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = LER.nextDouble();
            }
        }
    }
    public static void main(String[] args) {
        double[][] ma = new double[6][6];
        double valorAMutiplicar = 36;
        double[] vet = new double[36];
        lerMatriz(ma);
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                vet[i] = ma[i][j] * valorAMutiplicar;
            }
        }
    }
}
