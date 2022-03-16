# Introduction NoSQL & MongoDB

## Resume
1. Pengenalan NoSQL & MongoDB
2. NoSQL
3. Kategori NoSQL

### Pengenalan NoSQL & MongoDB
NoSQL termasuk Relational DB yang dirancang untuk segala keperluan. SQL memiliki standar yang jelas dan memiliki banyak tool (administrasi, reporting, framework). Berikut beberapa benefit pada relational DB:
* Atomicity : transaksi terjadi semua atau tidak sama sekali
* Consistency : data tertulis merupakan data valid yang ditentukan berdasarkan aturan tertentu
* Isolation : pada saat terjadi request yang bersamaan (concurrent) memastikan bahwa transaksi dieksekusi seperti dijalankna secara sekuensial
* Durability : jaminan bahwa transaksi yang telah tersimpan, tetap tersimpan.

### NoSQL
DBMS NoSQL menyediakan mekanisme yang lebih fleksibel dibandingkan dengan model RDBMS (sifat ACID). Kelebihan dari DBMS NoQSL yakni schema less, fast development, support big size file dan support cluster.

### Kategori DBMS NoSQL
* Key/Value : tipe yang paling simple dan setiap key adalah unik (Hash table)
* Column-family (penyimpanan data per-kolom untuk pencarian yang kompleks)
* Graph (memodelkan sruktur relasi dari data)
* Document-based (menyimpan informasi sebagai dokumen)
* Others geospatial file-system object