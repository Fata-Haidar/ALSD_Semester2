
|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020108|
| Nama |  Fata Haidar Aly |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Fata-Haidar/ALSD_Semester2) |

# JOBSHEET 2

# Labs #1 Tinjauan Dasar Pemrograman

## 2.1.1 Solusi Deklarasi Class, Atribut dan Method 

Solusi ini diimplementasikan dalam Mahasiswa09.java, dan berikut ini adalah tangkapan layar hasilnya.

![Screenshot](img/m1.png)

**Penjelasan singkat:** class Mahasiswa09 memiliki 4 atribut dan 4 method:

 Atribut:
1. nim: String 
2. nama: String  
3. kelas: String 
4. ipk: double

Method:
1. tampilkanInformasi(): void 
2. ubahKelas(kelasBaru: String): void 
3. updateIpk(ipkBaru: double): void  
4. nilaiKinerja(ipk: double): String

**Jawab Pertanyaan**
1. Encapsulation dan Inheritance

    a.  Encapsulation: Data dan metode yang berkaitan dikelompokkan dalam satu class untuk menjaga keamanan data.

    b. Inheritance: Class dapat mewarisi atribut dan metode dari class lain untuk menghindari duplikasi kode

2. Terdapat 4 atribut berupa: nim, nama, kelas, dan ipk.
3. Terdapat 4 Method berupa: tampilkanInformasi(), ubahKelas(String kelasBaru), updateIpk(double ipkBaru), dan nilaiKinerja().
4. From
![Screenshot](img/m3.png)

    To
![Screenshot](img/m2.png)
5. Method ini mengevaluasi kinerja mahasiswa berdasarkan nilai IPK dan mengembalikan kategori penilaian sebagai String. Cara kerjanya:

    a. Jika IPK ≥ 3.5 → mengembalikan "Sangat Baik".

    b. Jika IPK ≥ 3.0 dan < 3.5 → mengembalikan "Baik".

    c. Jika IPK ≥ 2.5 dan < 3.0 → mengembalikan "Cukup".

    d. Jika IPK < 2.5 → mengembalikan "Kurang".

6. Commit dan push kode program ke Github.

## 2.1.2. Solusi Instansiasi Object, serta Mengakses Atribut dan Method 

Solusi ini diimplementasikan dalam MahasiswaMain09.java, dan berikut ini adalah tangkapan layar hasilnya.

![Screenshot](img/m5.png)

**Penjelasan singkat:** Ada 5 langkah utama:
1. Intansiasi object (mhs1) dengan constructor default Mahasiswa09().
2. Mengakses atribut nama, nim, kelas, ipk.
3. Mengubah kelas dengan megakses Method ubahKelas().
4. Memperbarui IPK dengan megakses Method updateIPK().
5. Menampilkan Informasi mahasiswa atau object.

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







