# Summary Problem Solving Paradigm

## Resume
1. Problem Solving Paradigm
2. Brute Force
3. Divide and Conquer
4. Greedy

### Problem Solving Paradigm
Paradigma pemecahan masalah atau problem solving paradigm adalah pendekatan yang biasa digunakan untuk memecahkan masalah menggunakan metode pemecahan algoritma seperti complete search/brute force, divide dan greedy.

### Brute Force/Complete Search O(n)
Brute force adalah metode dari pemecahan masalah dengan melintasi seluruh ruang pencarian untuk mendapatkan solusi yang diperlukan. Brute force terjadi ketika tidak ada algoritma lain yang tersedia namun kompleksitas waktunya terlalu lama karena brute force mencari nilainya satu persatu. (example case: find min and max value in array)

### Divide & Conquer/Binary Search O(log n)
Divide & Conquer menggunakan metode pembagian hingga ke bagian terkecil dengan cara:
* Divide : membagi masalah yang besar menjadi masalah yang lebih kecil
* Conquer : menyelesaikan masalah yang sudah diperkecil
* Combine : diperlukan untuk menggabungkan kembali masalah kecil menjadi solusi untuk masalah yg lebih besar. (example case: search element in array)

### Greedy
Suatu algoritma dikatakan greedy jika membuat pilihan optimal secara lokal pada setiap langkah dengan harapan pada akhirnya mencapai solusi optimal secara global/luas. dalam kasus yang sama, greedy bekerja dengan solusi yang ringkas dan berjalan secara efisien. Algoritma greedy yang lain seperti: Huffman Coding, Activity Selection, Djikstra dll.(example case: coin change)

## Task
* [Soal Latihan](https://docs.google.com/document/d/1T-xkJA_e4rfDdFTees5_RVmibvwtw8umT3v481OkqWc/edit)

## Hasil
* [Binary Search](./praktikum/BinarySearchApp.java)