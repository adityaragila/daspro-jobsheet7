import java.util.Scanner;

public class Square02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        for(int iouter = 1; iouter <= N; iouter++) {
            for(int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.print ("");
        }
    }
}

 