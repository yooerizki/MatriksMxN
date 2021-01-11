import java.util.Scanner;


public class Perkalian {                                                // membuat kelas penjumlahan
    void perkalian(){                                                   // pembuatan method untuk bisa di panngil di main clas
        int i, j, k, m, n, p, q, jumlah = 0;                            // mendeklarasikan variable i, j, k, m, n, p, q, jumlah, dimana variable i digunakan untuk perulangan baris, variable j untuk perulangan kolom, variable k untuk perulangan operasi perkalian, variable m untuk jumlah baris matriks1, variable n untuk jumlah kolom matriks pertama, variable p untuk jumlah baris matriks kedua, variable q untuk jumlah kolom matriks kedua, dan variable jumlah untuk nilai hasil operasi perkalian
        int matriks1[][] = new int[10][10];                             // mendeklarasikan variable matriks1[10][10], matriks2[10][10], dan hasil[10][10], yang merupakan array dua dimensi yang memiliki maksimal panjang atau ukurun array baris dan kolom sebanyak 10
        int matriks2[][] = new int[10][10];     
        int hasil[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);                          // variabel scan sebagai inputab

        System.out.print("Masukkan jumlah baris matriks pertama: ");
        m = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks pertama: ");    /* menginputkan nilai ke dalam variable pertamas m dan n */
        n = scan.nextInt();

        System.out.print("Masukkan jumlah baris matriks kedua: ");
        p = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks kedua: ");      /* menginputkan nilai ke dalam variable kedua p dan q */
        q = scan.nextInt();

        if (n != p) {
            System.out.println("Matriks tidak dapat dikalikan satu sama lain.\n"); /* mengecek kondisi jika variable n (jumlah kolom matriks pertama) tidak sama dengan variable p (jumlah baris matriks kedua) maka akan menampilkan pesan tidak dapat melakukan perkalian matriks */
        } else {
        System.out.println("Masukkan elemen matriks pertama: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {                                   /* melakukakan perulangan m (baris) dan n (kolom) untuk menginputkan elemen matriks di variable matriks pertama */
                matriks1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks kedua: ");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {                                   /* melakukakan perulangan m (baris) dan n (kolom) untuk menginputkan elemen matriks di variable matriks kedua */
                matriks2[i][j] = scan.nextInt();
            }
        }

        for (i = 0; i < m; i++) {
            for (j = 0; j < q; j++) {
                for (k = 0; k < p; k++) {
                    jumlah = jumlah + matriks1[i][k] * matriks2[k][j];  /* melakukan perulangan i (baris matriks 1) sebanyak jumlah m (kolom matriks 1), lalu didalamnya melakukan perulangan j (baris matriks 2) sebanyak jumlah q (kolom matriks 2), kemudian didalamnya melakukan perulangan k (operasi perkalian) sebanyak p (jumlah matriks) dimana varible jumlah diisikan nilai hasil operasi perkalian. setelah perulangan k maka variable hasil[i][j] diisikan dengan nilai variable jumlah dan variable jumlah di set ulang menjadi nol */
                }
                hasil[i][j] = jumlah;
                jumlah = 0;
            }
        }

        System.out.println("Hasil perkalian matriks: ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {                               /* melakukakan perulangan sebanyak jumlah m (baris) dan n (kolom) untuk menampilkan nilai hasil operasi perkalian matriks */
                    System.out.print(hasil[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

}
