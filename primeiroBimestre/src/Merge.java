import java.util.Scanner;

public class Merge {

    final static Scanner SCANNER = new Scanner(System.in);

    public static void lerVerInt(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = SCANNER.nextInt();
        }
    }

    public static int[] dividir(int gap, int[] vetor) {
        int ponteiro = gap / 2;
        int aux = 0;

        if (gap >= vetor.length) {
            return vetor;
        }

        // ordena
        for (int i = 0; i <= gap / 2;) {

            if (vetor[i] > vetor[ponteiro]) {
                aux = vetor[ponteiro];
                vetor[ponteiro] = vetor[i];
                ponteiro++;
                vetor[i] = aux;
            } else {
                i++;
            }
        }
        return dividir(gap * 2, vetor);
    }

    public static void receMetade(int[] vet, int[] vetAux, int inicio){
        for (int i = 0; i < vet.length / 2; i++) {
            vetAux[i] = vet[inicio + i];
        }
    }

    public static void imprimirVet(int[] vetAux1){
        for(int i = 0; i < vetAux1.length;i++){
            System.out.printf("%d ", vetAux1[i]);
        }
    }

    public static void juntarVetores(int[] vet,int[] vetAux1, int[] vetAux2){
        for (int i = 0; i < vet.length; i++) {
            //
        }
    }

    public static void main(String[] args) {
        int tam = SCANNER.nextInt();
        int[] vet = new int[tam];
        int tamAux = vet.length / 2;
        int tamAux2 = vet.length - tamAux;
        int[] vetAux1 = new int[tamAux];
        int[] vetAux2 = new int[tamAux2];

        lerVerInt(vet);
        receMetade(vet, vetAux1,0);
        receMetade(vet, vetAux2, vet.length / 2);
        vetAux1 = dividir(1, vetAux1);
        imprimirVet(vetAux1);
        System.out.println();
        vetAux2 = dividir(1, vetAux2);
        imprimirVet(vetAux2);

    }

}