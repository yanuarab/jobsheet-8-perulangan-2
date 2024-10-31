import java.util.Scanner;

public class RataNilai25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1; 
        int j;
        float totalNilai;
        float nilaiMHS;
        float rataRata;

        while (i <= 5) { 
            System.out.println("Input Nilai Mahasiswa ke-" + i); 
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + "= ");
                nilaiMHS = sc.nextInt();
                totalNilai += nilaiMHS;
            }
            rataRata = totalNilai / 5;
            System.out.println("Rata-rata nilai Mahasiswa ke-" + i + " adalah " + rataRata);
            i++; 
        }

        sc.close();
    }
}