import java.util.Scanner;

                                            // start
public class Penjumlahan {                  // membuat kelas penjumlahan
    void penjumlahan(){                     // pembuatan method untuk bisa di panngil di main clas
        int b, k, i, j;                     // mendeklarasikan variabel b sebagai masukan baris matriks, k sebagai masukan kolom matrik, variabel i untuk mengulang baris , variabel j untuk mengulang kolom 
        int matriks1[][] = new int[10][10]; /* mendeklarasikan variabel matriks1[10][10], matriks2[10][10], dan hasil[10][10] yang merupakan array dua dimensi yang memiliki maksimal panjang atau ukurun array baris dan kolom sebanyak 10. */
        int matriks2[][] = new int[10][10];  
        int hasil[][] = new int[10][10];
        Scanner scan = new Scanner(System.in); // scan sebagai variabel inputan

        System.out.println("Masukkan baris matriks : ");
        b = scan.nextInt();
        System.out.println("Masukkan kolom matriks : ");    /* input nilai ke dalam variabel  b dan k */
        k = scan.nextInt();

        System.out.println("Masukkan elemen matriks pertama : ");
        for (i = 0; i < b; i++) {
            for (j = 0; j < k; j++) {                               /* melakukakan perulangan b (baris) dan k (kolom) untuk menginputkan elemen matriks di variable matriks pertama */                   
                matriks1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks pertama : ");
        for (i = 0; i < b; i++) {
            for (j = 0; j < k; j++) {                               /* melakukakan perulangan b (baris) dan k (kolom) untuk menginputkan elemen matriks di variable matriks kedua */
                matriks1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Hasil penjumlahan matriks: ");
		for (i = 0; i < b; i++) {
			for (j = 0; j < k; j++) {                               /* melakukakan perulangan b (baris) dan k (kolom) untuk operasi penjumlahan variable matriks pertama dan ke dua dan hasilnya dimasukkan kedalam variable hasil serta menampilkan hasil operasi penjumlahan matriks. */
				hasil[i][j] = matriks1[i][j] + matriks2[i][j];
				System.out.print(hasil[i][j] + "\t");
			}
			System.out.println();
        }
    }
}