public class App {
    public static void main(String[] args) throws Exception {
        int angka[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        System.out.println("\t tentukan bilangan ganjil dan genap Data Array \n\n");

        System.out.print("\n bilagan genap :");

        for (int i = 0; i < 20; i++) {
            if (angka[i] % 2 == 0) {

                System.out.print(angka[i] + ",");

            }
        }

        System.out.print("\n Bilagan Ganjil :");

        for (int j = 0; j < 20; j++) {

            if (angka[j] % 2 != 0) {
                System.out.print(angka[j] + ",");
            }
        }

    }
}
