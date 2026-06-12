## Deskripsi Project Miko:

## Pengendalian perilaku karakter game berbasis State
_Deskripsi Masalah:_
Dalam pengembangan sebuah game 2D Slide-Scroller, karakter utama (Miko) memiliki tiga kondisi status (state) dasar, yaitu: Bediri (Idle), Melompat (Jumping), dan Tiarap (Crouching). Karakter ini (Miko) merespons dua perintah/aksi utama dari pemain, yaitu tombol Atas (melompat) dan tombol Bawah (tiarap).
    1.	Saat karakter (Miko) dalam status “Berdiri”:
        -	Jika menerima perintah Melompat, karakter (Miko)  akan melakukan gerakan melompat dan statusnya berubah menjadi melompat.
        -	Jika menerima perintah Tiarap, karakter (Miko)  akan merunduk dan statusnya berubah menjadi tiarap.
    2.	Saat karakter  (Miko) dalam status “Melompat”:
        -	Karakter (Miko)  sedang berada di udara, sehingga jika menerima perintah tiarap, perintag tersebut diabaikan (karakter (Miko)  tidak bisa tiarap di udara). Karakter  (Miko) hanya bisa kembali ke status berdiri setelah menyentuh tanah kembali.
    3.	Saat karakter  (Miko) dalam status “Tiarap”:
        -	Jika menerima perintah melompat, karakter (Miko)  tidak langsung melompat tinggi, melainkan akan berdiri kembali terlebih dahulu (status berubah menjadi berdiri).

#### Tugas
Rancanglah Class Diagram, Sequence Diagram, dan program dari perangkat lunak untuk sistem kendali karakter tersebut menggunakan State Design Pattern guna menghindari penggunaan struktur percabangan (if-else / switch-case) yang kompleks dan kaku, serta menjaga agar kode program bersifat extensible (mudah ditambah status baru di masa depan).

<!-- btw untuk cara buka markdown preview nya klik ctrl+k v -->