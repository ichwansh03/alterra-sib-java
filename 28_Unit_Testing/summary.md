# Summary Unit Testing

## Resume
1. Apa itu Unit Testing
2. Concern Unit Testing
3. Unit Testing Benefits
4. F.I.R.S.T Principle of Testing

### Apa itu Unit Testing
Unit testing adalah tingkatan dari proses pengujian software dari unit individu ataupun komponen dari sebuah software atau sistem yang diuji. Unit adalah bagian terkecil yang dapat diuji dari aplikasi. Tujuannya adalah untuk memvalidasi bahwa setiap unit software yang berfungsi seperti yang dirancang.

### Concern Unit Testing
* Kebenaran dan kelengkapan fungsional
* Error handling (penanganan masalah)
* Memeriksa nilai input (parameter)
* Kebenaran dari data output (pengembalian nilai)
* Optimasi algoritma dan performa

### Unit Testing Benefits
* Kualitas kode
* Menemukan bug software lebih awal
* Kecepatan pengembangan
* Desain lebih baik
* Mengurangi biaya

### F.I.R.S.T Principle of Testing
1. Fast (Cepat)
Unit test adalah potongan kecil kode yang melakukan satu tugas spesifik karena kecilnya unit test dan tidak seperti integration testing, unit test tidak berkomunikasi melalui jaringan dan tidak melakukan kinerja database.
2. Isolated/Independent (Terpencil)
Unit test harus independen satu sama lain. Satu unit test tidak boleh bergantung pada hasil yang dihasilkan oleh unit test yang lain. pada kenyataannya, sebagian besar unit test waktu dijalankan dalam sebuah urutan acak.
3. Repeatable (dapat diulang)
Unit test harus dapat diulang dan jika dijalankan beberapa kali harus menghasilkan result yang sama. jika unit test dijalankan di komputer yang berbeda harus menghasilkan result yang sama.
4. Self Validating (validasi sendiri)
Untuk mengetahui apakah unit test telah lulus atau tidak, developer tidak boleh melakukan pemeriksaan manual tambahan seleteh test selesai
5. Thorough (teliti)
Buat beberapa unit test untuk menguji fungsi yang menerim parameter input yang berbeda, valid dan tidak valid.

## Task
[!Tugas Section 28](https://docs.google.com/document/d/12TeIket8AmG-joEkbP69t7BurbQqIFA8Vf1hIaMu2P8/edit)

## Hasil
[!Unit Tests](https://github.com/sholihin030401/javaspringboot_ichwan-sholihin/blob/main/28_Unit_Testing/praktikum/nosql/nosql/src/test/java/com/ichwan/nosql/ProductTest.java)
