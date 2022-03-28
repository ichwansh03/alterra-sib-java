# Summary Configure Swagger API Documentation Spring Boot

# Resume
1. API Documentation Definition
2. Swagger for API Documentation
3. Example Controller

### API Documentation Definition
API Documentation berisi konten teknis dari penggunaan dan pengintegrasian API secara efektif serta menyediakan pembaruan pada API lifecycle. Alasan besar mengapa API documentation sangat penting adalah untuk menambah adopsi API. Dokumentasi komprehensif tentang semua fungsi, cara menggunakan dan megintegrasikan secara efektif dan pembaruan pada API lifecycle untuk meningkatkan pengalaman pengguna API.

### Swagger for API Documentation
Swagger memiliki banyak fungsionalitas dan memiliki format standar seperti OpenAPI 4.0. Spesifikasi OpenAPI sendiri sebelumnya dikenal sebagai SwaggerAPI yang digunakan untuk menstandarisasi API yang akan di consume

### Example Controller
- @ApiOperation untuk mendeskripsikan informasi dari endpoint
- @ApiResponses untuk mendeskripsikan kapan mengembalikan nilai dari suatu kode seperti 200 return OK dll.
- @ApiModelProperty untuk memasukkan field endpoint pada contoh payload