import java.util.Scanner;
public class Pengurangan {
    void pengurangan(){
        int i, j, b, k;
        int matriks1[][] = new int[10][10];
        int matriks2[][] = new int[10][10];
        int hasil[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks: ");
        b = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        k = scan.nextInt();

        System.out.println("Masukkan elemen matriks pertama: ");
        for (i = 0; i < b; i++) {
            for (j = 0; j < k; j++) {
                matriks1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks kedua: ");
        for (i = 0; i < b; i++) {
            for (j = 0; j < k; j++) {
                matriks2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Hasil pengurangan matriks: ");
        for (i = 0; i < b; i++) {
            for (j = 0; j < k; j++) {
                hasil[i][j] = matriks1[i][j] - matriks2[i][j];  /* sama dengan penjumlahan tetapi hanaya simbol operasinya yang membedakn  */
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }  
}
