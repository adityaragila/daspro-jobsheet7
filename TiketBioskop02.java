import java.util.Scanner;

public class TiketBioskop02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int totalTiketTerjual = 0;
        int totalPendapatan = 0;
        int hargaTiket = 50000;
        int jumlahTiket;
        
        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        System.out.println("Harga tiket: Rp " + hargaTiket);
        System.out.println("Diskon: >4 tiket = 10%, >10 tiket = 15%");
        System.out.println("Masukkan jumlah tiket (0 untuk selesai):");
        
        
        while (true) {
            System.out.print("Jumlah tiket: ");
            jumlahTiket = scanner.nextInt();
            
          
            if (jumlahTiket == 0) {
                break;
            }
            
            
            if (jumlahTiket < 0) {
                System.out.println("Error: Jumlah tiket tidak boleh negatif!");
                continue; 
            }
            
           
            int subtotal = jumlahTiket * hargaTiket;
            double diskon = 0;
            
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }
            
            int jumlahDiskon = (int) (subtotal * diskon);
            int totalBayar = subtotal - jumlahDiskon;
            
         
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalBayar;
            
            
            System.out.println("Subtotal: Rp " + subtotal);
            if (diskon > 0) {
                System.out.println("Diskon " + (diskon * 100) + "%: Rp " + jumlahDiskon);
            }
            System.out.println("Total bayar: Rp " + totalBayar);
            System.out.println("---------------------------");
        }
        
       
        System.out.println("\n=== LAPORAN PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
        
    }
}