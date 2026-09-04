public class metodosFat {
    
     public static void fatSemRecursividade(int n){
        int fat = 1;
        for (int i = n; i > 0; i--) {
            fat *= n;
        }
        System.out.println(fat);
    }

    public static int fatComRecursividade(int n){
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fatComRecursividade(n-1);
    }
}
