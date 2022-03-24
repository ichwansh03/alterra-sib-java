# Summary Introduction REST API

## Resume
1. Apa itu API
2. REST
3. HTTP Response Code
4. REST API Design
5. Open API

### Apa itu API
API (Application Programming Interface) adalah sebuah kumpulan dari fungsi/prosedur yang mengizinkan aplikasi dapat mengakses fitur atau data dari sistem operasi atau service lainnya. API bekerja secara side by side dimana client dapat memberikan request ke server dan server dapat memberikan response sesuai dengan permintaan client.

### REST (Representational State Transfer)
REST API dapat diintegrasikan dengan banyak service front end dengan hanya satu back end sebagai manajemen database/business logic nya.
* HTTP request method:
- GET (mengambil data)
- POST (membuat data)
- PUT (mengubah data)
- DELETE (menghapus data)

* Request & response format:
- JSON
- XML
- SOAP


### HTTP Response Code
- 200 OK (diberikan ketika request berhasil)
- 201 Created 
- 400 Bad Request (terjadi kegagalan ketika request)
- 404 Not Found (URL/resource tidak ditemukan)
- 401 Unauthorized (belum melakukan autentikasi ketika request)
- 405 Method Not Allowed
- 500 Internal Server Error

* API Testing Tools (HTTP Client yang dapat digunakan untuk testing web services)
- Katalon
- Apache JMeter
- Postman
- SoapUI
- Insomnia

### Best Practice REST API Design
- Disarankan menggunakan kata benda ketimbang kata kerja : GET/addBook123 -> GET/books/123
- Penamaan menggunakan kata jamak
- Resource nesting untuk menunjukan relasi atau hierarcy : /users/123/orders/0001 <- spesific order for spesific user
- Handle trailing slashes gracefully
- Membuat versioning

### Open API
[Open API Github](https://github.com/public-apis/public-apis)
