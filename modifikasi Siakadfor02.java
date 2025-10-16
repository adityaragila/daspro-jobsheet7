public import java.util.Scanner;

public class Siakadfor02 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        
        int lulus = 0;      // untuk menghitung mahasiswa yang lulus (nilai >= 60)
        int tidakLulus = 0; // untuk menghitung mahasiswa yang tidak lulus (nilai < 60)

        for (int i = 1; i <= 10; i++) {
            System.out.println("Memasukkan nilai ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
        
            if (nilai >= 60) {
                lulus++;        // tambah counter lulus
            } else {
                tidakLulus++;   // tambah counter tidak lulus
            }
        }
        
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        // OUTPUT TAMBAHAN untuk menampilkan hasil kelulusan:
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
    }
} {
    
}
