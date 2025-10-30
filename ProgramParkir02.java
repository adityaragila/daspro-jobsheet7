import java.util.Scanner;

public class ProgramParkir02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenis, durasi, total = 0;
        
        System.out.println("=== PROGRAM PERHITUNGAN BIAYA PARKIR ===");
        
        do {
            // Input jenis kendaraan
            System.out.println("\nMasukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
            System.out.print("Jenis kendaraan: ");
            jenis = scanner.nextInt();
            
            // Keluar jika input 0
            if (jenis == 0) {
                break;
            }
            
            // Validasi jenis kendaraan
            if (jenis == 1 || jenis == 2) {
                // Input durasi parkir
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = scanner.nextInt();
                
                // Hitung biaya parkir berdasarkan kondisi
                if (durasi > 5) {
                    // Tarif tetap jika durasi > 5 jam
                    total += 12500;
                    System.out.println("Biaya parkir: Rp 12.500 (tarif tetap >5 jam)");
                } else {
                    // Tarif normal berdasarkan jenis kendaraan
                    if (jenis == 1) {
                        int biaya = durasi * 3000;
                        total += biaya;
                        System.out.println("Biaya parkir: " + durasi + " jam x Rp 3.000 = Rp " + biaya);
                    } else if (jenis == 2) {
                        int biaya = durasi * 2000;
                        total += biaya;
                        System.out.println("Biaya parkir: " + durasi + " jam x Rp 2.000 = Rp " + biaya);
                    }
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid! Masukkan 1 (Mobil) atau 2 (Motor)");
            }
            
        } while (jenis != 0);  // Perulangan selama bukan 0
        
        // Output total pembayaran
        System.out.println("\n=== TOTAL PEMBAYARAN ===");
        System.out.println("Total yang harus dibayar: Rp " + total);
        System.out.println("Terima kasih!");
        
        scanner.close();
    }
}