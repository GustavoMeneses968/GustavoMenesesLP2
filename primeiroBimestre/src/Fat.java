import java.util.Scanner;

public class Fat extends metodosFat{

   final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int fat = SCANNER.nextInt();
        fatComRecursividade(fat);
    }
}
