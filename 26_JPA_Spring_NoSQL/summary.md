# Summary JPA (Spring Database No SQL)

## Resume
1. Dependencies yang dibutuhkan
2. Struktur Folder MVC
3. Konfigurasi JPA NoSQL

### Dependencies yang dibutuhkan
* Spring Web : Mengembangkan web, termasuk RESTful, aplikasi yang menggunakan Spring MCV, penggunaan Apache Tomcat sebagai container bawaan
* Spring Data MongoDB : Menyimpan data secara flexible
* Lombok : library Java annotation untuk membantu mengurangi boilerplate

### Struktur Folder MVC
* Controller : sebagai kumpulan routing Rest API atau sering disebut endpoint
* Model : sebagai bentuk dasar dari business model, POJO (Plain Old Java Object)
* Repository : sebagai interface yang berhubungan langsung dengan database
* Service : kumpulan interface digunakan untuk business process/rules/logic

### Konfigurasi JPA NoSQL
* Class model berisikan atribut/properties yang digunakan
* Interface repository adalah bagian dari Domain-Driver Design. Sebuah mekanisme encapsulation untuk akses database.
* Interface service digunakan sebagai blueprint proses bisnis dan proses nya dilakukan di class service