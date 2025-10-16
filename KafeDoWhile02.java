import java.util.Scanner;

public class KafeDoWhile02 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
       
        int kopi, teh, roti;
        String namaPelanggan;
        
       
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        
        
        do {
            
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            
            // Cek jika ingin membatalkan
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            
            // Input jumlah item
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            
            
            sc.nextLine();
            
            
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            
           
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            System.out.println();

        } while (true);
        
       
        System.out.println("Semua transaksi selesai.");
        
       
    }
}