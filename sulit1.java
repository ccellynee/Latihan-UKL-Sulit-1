import java.util.Scanner;

public class sulit1 {
    public static void main(String[] args) {
         
        Scanner input = new Scanner (System.in);

        System.out.println("-------- Rekapitulasi nilai ujian Produktif RPL --------");

        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalnilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalnilai += nilai;
        }

        double rataRata = totalnilai/jumlahSiswa;

        System.out.println("============================");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Total nilai: " + totalnilai);
        System.out.println("Rata - rata nilai: "+ rataRata);
    }
}
