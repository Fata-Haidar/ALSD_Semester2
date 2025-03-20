
|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020108|
| Nama |  Fata Haidar Aly |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Fata-Haidar/ALSD_Semester2) |

# JOBSHEET 4

# Labs #1 Tinjauan Dasar Pemrograman

## 3.2.1 Solusi Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer 

Solusi ini diimplementasikan dalam Faktorial09.java dan MainFaktorial09.java, dan berikut ini adalah tangkapan layar hasilnya.

![Screenshot](img/v2.png)

**Penjelasan singkat:** class Mahasiswa09 memiliki 4 atribut dan 4 method:

 Atribut:
1. nim: String 
2. nama: String  
3. kelas: String 
4. ipk: float

**Penjelasan singkat:** Ada 3 langkah utama:
1. Intansiasi object arrayOfMahasiswa09 dengan array Mahasiswa.
2. Mengakses atribut nama, nim, kelas, ipk.
3. Mencetak semua atribut dari objek arrayOfMahasiswa.

**Jawab Pertanyaan**
1. Dalam metode faktorialDC(int n), perbedaan utama antara bagian if dan else adalah:

if (n == 1) return n;
Ini adalah base case (kasus dasar) dalam rekursi. Ketika n sudah mencapai 1, fungsi berhenti dan mengembalikan nilai 1. Hal ini penting agar rekursi tidak berjalan tanpa batas (infinite recursion).

else { return n * faktorialDC(n - 1); }
Bagian ini adalah recursive case (kasus rekursif), di mana metode memanggil dirinya sendiri dengan nilai n-1 hingga mencapai base case. Setiap pemanggilan akan mengalikan nilai n dengan hasil rekursi dari faktorialDC(n-1).
2. Mengisntansiasi objek arrayOfMahasiswa09 dengan Mahasiswa09[], membuat atau deklarasi array bernama arrayOfMahasiswa09 yang akan menampung objek-objek dari class Mahasiswa09 dan mengalokasikan memori untuk array berukuran 3. Artinya, array ini dapat menampung hingga 3 objek Mahasiswa09.
3. fakto *= i; (pada metode faktorialBF())

Ini adalah operasi iteratif dalam loop.
Nilai fakto diperbarui secara bertahap dengan mengalikan i pada setiap iterasi.

int fakto = n * faktorialDC(n-1); (pada metode faktorialDC())

Ini adalah operasi rekursif yang mengandalkan pemanggilan fungsi secara berulang hingga mencapai base case.
4. Metode faktorialBF() lebih mudah dipahami dan lebih efisien dalam penggunaan memori karena menggunakan perulangan tanpa perlu memanggil fungsi berulang kali.

Metode faktorialDC() lebih elegan dan sesuai dengan konsep matematika, tetapi karena menggunakan rekursi, metode ini bisa menghabiskan lebih banyak memori dan menjadi lambat jika nilai n terlalu besar.

## 3.3.1 Solusi Menerima Input Isian Array Menggunakan Looping 

Solusi ini diimplementasikan dalam MahasiswaDemo09.java, dan berikut ini adalah tangkapan layar hasilnya.

![Screenshot](img/v1.png)

**Penjelasan singkat:** Ada 5 langkah utama:
1. Intansiasi object arrayOfMahasiswa09 dengan array Mahasiswa.
2. Mengakses atribut nama, nim, kelas, ipk.
3. Mencetak semua atribut dari objek arrayOfMahasiswa.

**Jawab Pertanyaan**
1. ![Screenshot](img/m5.png)
object yang dihasilkan adalah mhs1
2. Memanggil atribut dengan nama objek dan dihubungkan dengan operator titik(.).
![Screenshot](img/m7.png)
Memanggil method dengan nama objek dan dihubungkan dengan operator titik(.).
![Screenshot](img/m9.png)
3. * Pemanggilan pertama menampilkan data awal yang diinputkan ke objek mhs1.

    *  Setelah itu, atribut kelas diubah dengan ubahKelas("SI 2K") dan ipk diperbarui dengan updateIPK(3.60).

    * Pemanggilan tampilkanInformasi() kedua menampilkan perubahan tersebut, sehingga hasil outputnya berbeda.

## 2.1.3. Solusi Membuat Konstruktor 

Solusi ini diimplementasikan dalam MahasiswaMain09.java, dan berikut ini adalah tangkapan layar hasilnya.

![Screenshot](img/m8.png)

**Penjelasan singkat:** Ada 6 langkah utama:
1. Intansiasi object (mhs1) dengan constructor default Mahasiswa09().
2. Intansiasi object (mhs2) dengan constructor berparameter Mahasiswa09(nama, nim, ipk, kelas).
3. Mengakses atribut nama, nim, kelas, ipk.
4. Mengubah kelas dengan megakses Method ubahKelas().
5. Memperbarui IPK dengan megakses Method updateIPK().
6. Menampilkan Informasi mahasiswa atau object.

**Jawab Pertanyaan**
1. Baris kode yang digunakan untuk mendeklarasikan konstruktor berparameter dalam class Mahasiswa09 adalah: 
![Screenshot](img/m10.png)
Konstruktor ini memungkinkan pembuatan objek mhs2 dengan parameter yang diberikan.
2. * Membuat objek baru mhs2 dari class Mahasiswa09.
    * Memanggil konstruktor berparameter yang mengisi atribut nama, nim, ipk, dan kelas dengan nilai:

        nama = "Annisa Nabila"

        nim = "2141720160"

        ipk = 3.25

        kelas = "TI 2L"
3. ![Screenshot](img/m11.png)
hasilnya akan terjadi error, karena tidak ada lagi konstruktor default dalam class Mahasiswa09. Java. Karena Java tidak secara otomatis menyediakan konstruktor default jika ada konstruktor berparameter yang dideklarasikan. Jika ingin tetap menggunakan objek mhs1, kita harus menambahkan kembali konstruktor default atau selalu menggunakan konstruktor berparameter.
4. Tidak harus secara berurutan. Dalam OOP (Object-Oriented Programming), method dalam suatu class bisa dipanggil kapan saja selama objek sudah dibuat dan method yang dipanggil tersedia.
5. Objek (mhsFata)ini dibuat dengan menggunakan konstruktor berparameter, lalu method tampilkanInformasi() dipanggil untuk menampilkan detailnya.

![Screenshot](img/m12.png)

![Screenshot](img/m13.png)

## 2.1.4. Solusi Tugas 1

Solusi ini diimplementasikan dalam MataKuliah09.java dan MataKuliahMain09, dan berikut ini adalah tangkapan layar hasilnya.

![Screenshot](img/m14.png)

**Penjelasan singkat:** class Mahasiswa09 memiliki 4 atribut dan 4 method:

 Atribut:
1. kodeMK: String 
2. nama: String  
3. sks: int 
4. jumlahJam: int

Method:
1. tampilkanInformasi(): void 
2. ubahSKS(sksBaru: int): void 
3. tambahJam(jam: int): void  
4. kurangiJam(jsm: int): void

Ada 6 langkah utama:
1. Intansiasi object (mhs1) dengan constructor default MataKuliah09().
2. Intansiasi object (mhs2) dengan constructor berparameter MataKuliah09(kMk, nm, sks, jJ).
3. Mengakses atribut kodeMK, nama, sks, jumlahJam.
4. Mengubah sks dengan megakses Method ubahSKS(5).
5. Menambah jumlah jam dengan megakses Method tambahJam(2).
6. Menambah jumlah jam dengan megakses Method kurangiJam(3) dan kurangiJam(10) .
6. Menampilkan Informasi matakuliah atau object.



## 2.1.5. Solusi Tugas 2

Solusi ini diimplementasikan dalam Dosen09.java dan DosenMain09, dan berikut ini adalah tangkapan layar hasilnya.

![Screenshot](img/m15.png)

**Penjelasan singkat:** class Mahasiswa09 memiliki 4 atribut dan 4 method:

 Atribut:
1. idDosen: String 
2. nama: String  
3. statusAktif: boolean 
4. bidangKeahlian: String

Method:
1. tampilInformasi(): void  
2. setStatusAktif(status: boolean): void   
3. hitungMasaKerja(thnSkrg: int): int  
4. ubahKeahlian(bidang: String): void 

Ada 6 langkah utama:
1. Intansiasi object (dosen1) dengan constructor default MataKuliah09().
2. Intansiasi object (dosen2) dengan constructor berparameter MataKuliah09(idD, nm, sA, thnGB).
3. Mengakses atribut idDosen, nama, statusAktif, bidangKeahlian.
4. Mengubah bidangKeahlian dengan megakses Method ubahKeahlian("Sistem Operasi") dan ubahKeahlian("Kecerdasan Buatan").
5. Menampilkan masa kerja dosen berdasarkan tahun saat ini (2025) dikurangi tahun mulai bekerja.
6. Merubah statusAktif dengan method setStatusAktif(false).
7. Menampilkan Informasi Dosen atau object.







