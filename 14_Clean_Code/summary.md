# Summary Clean Code

## Resume
* Apa itu Clean Code?
* Karakteristik Clean Code
* Clean Code Principle

### Apa itu Clean Code
Clean code adalah istilah untuk kode yang mudah dibaca, difahami dan diubh oleh programmer.

### Karakteristik Clean Code
* Mudah difahami
* Penamaan variable/method/class mudah dieja dan dicari
* Singkat namun mendeskripsikan konteks
* Konsisten dalam penamaan
* Hindari penambahan konteks yang tidak perlu
* Komentar untuk menjelaskan struktur dan alur program
* Good function
* Gunakan konvensi
* Formatting

### Clean Code Principle
* KISS (Keep It So Simple) : Hindari membuat fungsi yang dibuat untuk melakukan A, sekaligus memodifikasi B, mengecek C, dst.
- Fungsi dibuat untuk melakukan 1 task saja.
- Tidak menggunakan argumen terlalu banyak
- Harus diperhatikan untuk mencapai kondisi yang seimbang, kecil dan jumlahnya minimal.

* DRY (Don't Repeat Yourself) : Duplikasi code terjadi karena sering copy-paste. Untuk menghindari dupliksi code buatlah fungsi yang dapat digunakan secara berulang-ulang.

* Refactoring : proses restrukturisasi kode yang dibuat dengan cara mengubah struktur internal tanpa mengubah perilaku eksternal. Teknik mengimplementasikan refactoring adalah:
- Membuat sebuah abstarksi
- Memecah kode dengan fungsi/class
- Perbaiki penamaan dan lokasi kode
- Deeksi kode yang memiliki duplikasi