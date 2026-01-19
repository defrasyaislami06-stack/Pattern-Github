public class PatternPiramidaAngka {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int spasi = n; spasi > i; spasi--) {
                System.out.print(" ");
            }
            for (int angka = 1; angka <= i; angka++) {
                System.out.print(angka + " ");
            }
            System.out.println();
        }
    }
}

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
