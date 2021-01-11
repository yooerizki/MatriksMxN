
public class App {      /* clas app class utama */
    
    public static void main(String[] args) throws Exception {
                                                                
        Penjumlahan jumlah = new Penjumlahan();             /* membuat objek dari class lain dan memanggil method*/
        Pengurangan kurang = new Pengurangan();
        Perkalian kali = new Perkalian();

        System.out.println("Penjumlahan Matriks");          /* menampilkan method */
        jumlah.penjumlahan();                          
        System.out.println("Pengurangan Matriks");
        kurang.pengurangan();
        System.out.println("Perkalian Matriks");
        kali.perkalian();
















        /*switch () {
            case "Penjumlahan":
                jumlah.penjumlahan();
                break;
            
            case "Pengurangan":
                kurang.pengurangan(); 
                break;

            case "Perkalian":
                kali.perkalian();
                break;

            default:
                break;
        } 
        
        */
    }
    
}
