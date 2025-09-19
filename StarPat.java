public class StarPat {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == n - i || j == 1 || j == n - j)
                    System.out.println(" ");
                }
                System.out.println("*");

        }
        System.out.println("");
    }
    
}
