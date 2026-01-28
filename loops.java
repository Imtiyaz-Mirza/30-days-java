public class loops {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 1; k <= 4; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
