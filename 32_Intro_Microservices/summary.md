# Summary Introduction Microservices

## Resume
1. Arsitektur Microservices
2. Arsitektur Monolith
3. Database per serivce dan shared database


### Arsitektur Microservices
* Aplikasi-aplikasi kecil yang saling bekerja sama 
* Fokus mengerjakan satu pekerjaan dengan baik
* Independent, dapat di deploy dan diubah tanpa bergantung dengan aplikasi lain
* Setiap komponen pada sistem dibuat dalam service
* Komunikasi antar service biasanya melalui network-call

- Kelebihan Arsitektur Microservices:
* Mudah dimengerti, karena ukuran service relative kecil
* Lebih mudah di develop, maintain, test dan di deploy
* Lebih mudah di scale sesuai kebutuhan

- Kelemahan Arsitektur Microservices:
* Komunikasi antar service rawan error
* Interaksi testing antar service lebih sulit

### Arsitektur Monolith
* Single Deployment Unit
* Semua fitur dibuat dalam aplikasi besar
* Pengembangannya yang simple, konsisten dan mudah untuk refactoring

### Database per serivce dan shared database
1) Database per service:
* Memastikan bahwa antar service tidak ketergantungan
* Tiap service bisa menggunakan aplikasi database sesuai dengan kebutuhan
* Service tidak perlu tahu kompleksitas internal database service lain

2) Shared Database:
* Shared database digunakan ketika melakukan transisi dari aplikasi monolith ke microservices
* Dapat memecahkan data antar service