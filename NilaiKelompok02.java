import java.util.Scanner;

public class NilaiKelompok02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        double totalNilai = 0;
        double nilai;
        
        
        double rataTertinggi = 0;
        int kelompokTertinggi = 0;
        
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0; 
            
            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }
            
            double rataRata = totalNilai / 5;
            
            
            if (rataRata > rataTertinggi) {
                rataTertinggi = rataRata;
                kelompokTertinggi = i;
            }
            
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataRata);
            System.out.println();
            i++;
        }
        
        
        System.out.println("Kelompok dengan rata-rata tertinggi: Kelompok " + kelompokTertinggi);
        System.out.println("Dengan nilai rata-rata: " + rataTertinggi);
        
        sc.close();
    }
}