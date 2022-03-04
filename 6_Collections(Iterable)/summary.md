# Summary Collection (Iterable)

## Resume
1. Iterable
2. Collection
3. List
4. Set
5. Sorted Set
6. Queue
7. Deque

### Iterable
Iterable adalah object interface dengan kumpulan nilai yang mampu me-return satu elemen pada satu waktu. Pada java, iterable memiliki object turunan seperti iterator, forEach dan spliterator.

### Collection
Collection adalah object interface yang dapat digunakan untuk menyimpan sekumpulan objek. Semua kelas yang mengimplementasikan Collection harus menyediakan 2 constructor standar; void constructor untuk mmembuat empty collection dan sebuah constructor dengan single argument bertipe Collection yang membuat Collection baru dengan elemen yang sama dengan argumennya.

### List
List adalah interface turunan Collection yang membolehkan adanya value duplicate atau nilai yang sama dalam index yang berbeda.

### Set
Set adalah jenis array yang tidak membolehkan adanya value duplicate, saat ada insert value yang sudah ada sebelumnya, maka value itu akan terotomatisasi dibuang salah satunya dan akhirnya value tersebut hanya tetap ada satu saja. Set juga memiliki beberapa fungsi yang cukup membantu, seperti clear(), add (Object e), remove(Object e) dan masih banyak lagi fungsi-fungsi lainnya jika teman-teman ingin lebih mengeksplorasi sendiri.

### Sorted Set
Interface SortedSet yang ada dalam package java.util memperluas interface Set yang ada dalam framework Collection. Ini adalah interface yang mengimplementasikan himpunan matematika. Interface ini berisi metode yang di-extend dari interface Set dan menambahkan fitur yang menyimpan semua element dalam interface untuk disimpan secara terurut.

### Queue
Queue pada Struktur Data atau antrian adalah sekumpulan data yang mana penambahan elemen hanya bisa dilakukan pada suatu ujung disebut dengan sisi belakang(rear), dan penghapusan(pengambilan elemen) dilakukan lewat ujung lain (disebut dengan sisi depan atau front).
Pada Stack atau tumpukan menggunakan prinsip“Masuk terakhir keluar pertama”atau LIFO (Last In First Out), Maka pada Queue atau antrian prinsip yang digunakan adalah “Masuk Pertama Keluar Pertama” atau FIFO (First In First Out).

### Deque
DEQUE adalah antrian dimana elemennya bisa masuk dan keluar lewat kedua ujungnya (berbeda dengan queue yang hany bisa masuk lewat ujung belakang dan keluar lewat ujung depan). Biasanya DEQUE disajikan dengan menggunakan Double link list yang memiliki dua buah pointer yang menunjuk ke posisi sebelumnya dan sesudahnya. Gambar 5.1 menunjukkan struktur umum dari sebuah DEQUE.

## Task
Soal (https://docs.google.com/document/d/1ouJHEhzwTEmM4-433bSe4yCUm4D5s0dP798t_rz4Xnc/edit)

## Hasil
