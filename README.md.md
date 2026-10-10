# PBO - Inheritance And Polymorphism

## Identitas

| | |
|---|---|
| **Nama** | Hari Fitratullah |
| **NIM** | F1D02510008 |
| **Mata Kuliah** | Pemrograman Berorientasi Objek (PBO) |
| **Tugas** | Latihan 1, 2, dan 3 - Inheritance dan Polymorphism |

## Deskripsi Program

Program ini merupakan latihan Pemrograman Berorientasi Objek (PBO) menggunakan bahasa pemrograman Java. Program menerapkan konsep *inheritance* (pewarisan) untuk merepresentasikan beberapa bangun geometri, yaitu bentuk umum, bujur sangkar, lingkaran, dan silinder.

Class `Bentuk` menjadi class induk yang menyimpan informasi warna. Class `BujurSangkar` dan `Lingkaran` mewarisi class `Bentuk`, sedangkan class `Silinder` mewarisi class `Lingkaran`.

Program juga menggunakan konsep *method overriding* untuk menampilkan informasi sesuai dengan jenis bangun yang dibuat, serta menghitung luas bujur sangkar, luas lingkaran, dan volume silinder.

## Tujuan Pembelajaran

- Memahami konsep *class* dan *object* dalam Java.
- Memahami penerapan *inheritance* (pewarisan) menggunakan `extends`.
- Menggunakan constructor untuk menginisialisasi objek.
- Menggunakan `super()` untuk memanggil constructor class induk.
- Menerapkan *method overriding* menggunakan anotasi `@Override`.
- Menggunakan method getter dan setter untuk mengakses serta mengubah atribut.
- Menghitung luas bujur sangkar, luas lingkaran, dan volume silinder.

## Diagram Pewarisan

```
Bentuk
 ├── BujurSangkar
 └── Lingkaran
       └── Silinder
```

## Struktur File

| File | Fungsi |
|------|--------|
| `Bentuk.java` | Class induk yang menyimpan atribut `warna` dan method `printInfo()`. |
| `BujurSangkar.java` | Turunan `Bentuk`; menyimpan `sisi` dan menghitung luas bujur sangkar. |
| `Lingkaran.java` | Turunan `Bentuk`; menyimpan `radius` dan menghitung luas lingkaran (konstanta `PHI`). |
| `Silinder.java` | Turunan `Lingkaran`; menyimpan `tinggi` dan menghitung volume silinder. |
| `Main.java` | Class utama untuk membuat objek dan menjalankan program. |
| `HasilOutput.png` | Screenshot hasil output program. |

## Penjelasan Class

### Latihan 1 - `Bentuk` dan `BujurSangkar`

**Bentuk**
- Atribut: `warna`
- Constructor: `Bentuk(String warna)`
- Method: `getWarna()`, `setWarna(String warna)`, `printInfo()`
- `printInfo()` menampilkan: `Bentuk berwarna [warna]`

**BujurSangkar** (turunan `Bentuk`)
- Atribut: `sisi` (private)
- Constructor: `BujurSangkar(double sisi, String warna)`
- Method: `getSisi()`, `setSisi(double sisi)`, `hitungLuas()`, `printInfo()`
- `hitungLuas()` = sisi × sisi
- `printInfo()` menampilkan: `Bujursangkar berwarna [warna], luas = [luas]`

### Latihan 2 - `Lingkaran`

**Lingkaran** (turunan `Bentuk`)
- Atribut: `radius` (private) dan konstanta kelas `PHI = 3.14159`
- Constructor: `Lingkaran(double radius, String warna)`
- Method: `getRadius()`, `setRadius(double r)`, `hitungLuas()`, `printInfo()`
- `hitungLuas()` = PHI × radius × radius
- `printInfo()` menampilkan: `Lingkaran [warna], luas = [luas]`

### Latihan 3 - `Silinder`

**Silinder** (turunan `Lingkaran`)
- Atribut: `tinggi` (private)
- Constructor: `Silinder(double tinggi, double radius, String warna)`
- Method: `getTinggi()`, `setTinggi(double t)`, `hitungVolume()`, `printInfo()`
- `hitungVolume()` = luas alas × tinggi = `hitungLuas()` × tinggi
- `printInfo()` menampilkan: `Silinder warna [warna], volume = [volume]`

## Konsep PBO yang Digunakan

1. **Inheritance (Pewarisan)**: `BujurSangkar` dan `Lingkaran` mewarisi `Bentuk`; `Silinder` mewarisi `Lingkaran`. Pewarisan ditulis dengan kata kunci `extends`.
2. **Constructor dan `super()`**: constructor class turunan memanggil constructor class induk, misalnya `Silinder` memanggil `super(radius, warna)`.
3. **Method Overriding**: method `printInfo()` ditulis ulang di setiap class turunan agar menampilkan informasi sesuai jenis bangunnya.
4. **Encapsulation**: atribut `sisi`, `radius`, dan `tinggi` bersifat `private` dan diakses melalui getter dan setter.
5. **Konstanta Kelas**: nilai `PHI` pada class `Lingkaran` dideklarasikan dengan `private static final`.

## Alur Kerja Program

Program dijalankan melalui method `main()` pada class `Main`:

1. Membuat objek `Bentuk` dengan warna Merah.
2. Membuat objek `BujurSangkar` dengan sisi 5 dan warna Biru.
3. Membuat objek `Lingkaran` dengan radius 7 dan warna Hijau.
4. Membuat objek `Silinder` dengan tinggi 10, radius 7, dan warna Kuning.
5. Memanggil `printInfo()` pada setiap objek untuk menampilkan informasi dan hasil perhitungan.

## Hasil Program

Keluaran program:

```
Bentuk berwarna Merah
Bujursangkar berwarna Biru, luas = 25.0
Lingkaran Hijau, luas = 153.93791
Silinder warna Kuning, volume = 1539.3790999999999
```

Angka desimal pada volume silinder terlihat panjang karena hasil perhitungan menggunakan tipe data `double`, yang menyimpan bilangan desimal dengan pembulatan biner.


Perhitungan:
- Bujur sangkar: 5 × 5 = 25
- Lingkaran: 3.14159 × 7 × 7 = 153.93791
- Silinder: 153.93791 × 10 ≈ 1539.3791 (tampil sebagai 1539.3790999999999 karena pembulatan `double`)

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang.

1. Simpan kelima file Java dalam satu folder.
2. Buka terminal atau Command Prompt pada folder tersebut.
3. Kompilasi seluruh file:

```
javac Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java Main.java
```

4. Jalankan program:

```
java Main
```

## Kesimpulan

Program ini menunjukkan penerapan konsep dasar Pemrograman Berorientasi Objek menggunakan Java, khususnya *inheritance* dan *method overriding*. Melalui hubungan pewarisan antara class `Bentuk`, `BujurSangkar`, `Lingkaran`, dan `Silinder`, program dapat mengelola informasi warna serta menghitung luas dan volume sesuai jenis bangunnya.
