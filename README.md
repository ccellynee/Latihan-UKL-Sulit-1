# Latihan-UKL-Sulit-1

Bagian 1:

        Scanner input = new Scanner (System.in);

        System.out.println("-------- Rekapitulasi Nilai Ujian Produktif RPL --------");

        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();


Pada program 1 user dimminta untuk memasukkan jumlah siswa yang nilainya akan di rekap, kemudian di simpan pada variabel jumlahSiswa.

Bagian 2: 

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

Di bagian 2 terdapat variabel totalNilai untuk menyimpan nilai dari penjumlahan seluruh nilai yang di input. Kemudian terdapat perulangan for yang digunakan untuk mengulangi proses input nilai siswa sesuai jumlah siswa yang di input oleh user. Kemudian setiap nilai disimpan ke variabel nilai, setelah itu semua nilai dijumlahkan kemudian di masukkan ke dalam variabel totalnilai. 

Bagian 3:

        double rataRata = totalNilai/jumlahSiswa;

Pada bagian 3 program menghitung rata - rata nilai siswa dengan total nilai siswa dibagi jumlah siswa, kemudian hasilnya disimpan ke variabel rata - rata.

Bagian 4:

        System.out.println("============================");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Total nilai: " + totalNilai);
        System.out.println("Rata - rata nilai: "+ rataRata);

Program mengeluarkan ouput berupa jumlah siswa yang di input oleh user, total nilai seluruh siswa, dan rata - rata nilai seluruh siswa.


Screenshot hasil program:

<img width="1468" height="622" alt="Cuplikan layar 2025-11-05 082123" src="https://github.com/user-attachments/assets/4af3fa48-6735-49e3-abef-07c0e6825a3f" />

       
