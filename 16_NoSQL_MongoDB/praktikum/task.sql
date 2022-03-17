/*menampilkan data buku dari author id 1 dan 2*/
 db.Books.find({authorID: { $in: [1,2]}})

 /*menampilkan daftar buku dan harga dengan author id = 1*/
 db.Books.find({authorID: 1},{price: 1, title: 1, _id : 1})

 /*total jumlah halaman buku author id = 2*/
 db.Books.find({authorID: 2},{stats:{page:1}})

 /*menampilkan semuua field Books dan Authors terkait*/
db.Authors.aggregate([{ $lookup: {from: "Books", localField: "_id", foreignField: "_id", as: "books"}}])
db.Books.aggregate([{ $lookup: {from: "Authors", localField: "authorID", foreignField: "_id", as: "authors"}}])

/*menampilkan semua field Books, Auhors dan Publishers terkait*/
db.Books.aggregate([{ $lookup:{from: "Authors", localField: "authorID", foreignField: "_id", as: "authors"}},{ $lookup:{from: "Publishers", localField:"publisherID", foreignField: "_id", as: "publishers"}}])

