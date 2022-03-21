# Summary System Design

## Resume
1. Diagram
2. Distributed System
3. Job Queue, Monolithic & Microservice
4. SQL & NoSQL
5. Caching & Indexing

### Diagram
* Flowchart : representasi dari 1 proses yg terdiri dari bagian process, decision, dan terminator. 
* Use Case Diagram : ringkasan dari detail sistem yang dikembangkan.
* ERD (Entity Relationship Diagram) : pengimplementasian table dari database menggunakan ilustrasi yang dikenal dengan 'entitas'.
* HLA (High Level Architecture) : Gambaran besar alur teknologi yang digunakan dalam pengembangan sistem.

### Distributed System
* Scalability : Kapabilitas dari sebuah sistem, proses atau jaringan untuk mengembangkan dan mengelola peningkatan permintaan (increase demand) dalam suatu sistem. Duplikasi server untuk increase demand disebut horizonal scale, peningkatan server untuk menambah scaling disebut vertical scale.
* Reliability : Keandalah dari sistem untuk menghindari kegagalan dalam service.
* Availability : Ketersedian dari sistem untuk dapat diakses secara realtime dan fulltime.
* Efficiency : Efisiensi server menerima respons dalam waktu yang singkat 
* Serviceability/Manageability : Kemudahan dan kecepatan dalam sistem untuk perbaikan dan pengelolaan.

### Job Queue, Monolithic & Microservice
* Job Queue adalah data terstruktur yang dikelola oleh software scheduler berisi jobs/pekerjaan untuk dijalankan secara asynchronous.
* Load Balancing adalah salah satu komponen terpenting dalam sistem terdistribusi untuk membantu menyebarkan traffic di seluruh cluster menuju server dengan mengingkatkan responsive dan ketersedian app, website atau database.
* Monolithic diilustrasikan seperti semua service yang disimpan dalam satu server.
* Microservices diilustrasikan seperti service yang ada pada sistem dipecah-pecah menjadi bagian tersendiri melalui repo, server dll.

### SQL & NoSQL
* SQL adalah sebuah relational database yg memiliki entity saling terhubung dan terstruktur diawal (statis) -> RDBMS (Relational Database Management System).
* NoSQL adalah sebuah relational database yg memiliki entity saling terhubung namun tidak terstruktur (dinamis) -> DBMS (Database Management System).

### Caching & Indexing
* Cache adalah penyimpanan data sementara untuk data yang berulang (RAM).
* DB Redudancy adalah duplikasi komponen atau fungsi penting dari suatu sistem dengan tujuan untuk meningkatkan keandalan, biasanya dalam bentuk cadangan dari fail-safe atau untuk meningkatkan kinerja sistem yang sebenarnya.
* Indexing adalah metode untuk mengoptimasi database ketika melakukan pencarian ataupun proses lainnya.
