## Relasi Class
| Pertemuan 10  |  Pemrograman Berorientasi Objek  
|-------|---------
| NIM   | 312310576
| Nama  | Taufik Hidayat
| Kelas | TI.23.A6

## Latihan

![gambar](ss6/latihan.png)

### Diagram Class

![image](ss6/diagramclass_praktimu6.png)

Hasilnya akan menggambarkan hubungan komposisi antara Motor dan Mesin:


Diagram menunjukkan:

- Motor adalah kelas utama.
- Mesin adalah bagian tak terpisahkan dari Motor.
- Relasi komposisi digambarkan dengan rombongan hitam antara Motor dan Mesin.

### Class Mesin

![image](ss6/mesin.png)

Deskripsi
- Kelas Mesin merepresentasikan bagian internal dari Motor. Objek Mesin tidak dapat berdiri sendiri, melainkan selalu terhubung dengan objek Motor.

Atribut:
- tipeMesin: Jenis mesin yang digunakan, misalnya "Honda GTR150".
- kapasitas: Kapasitas mesin dalam cc, misalnya 150 cc.

Metode:
- start(): Menyalakan mesin.
- run(): Menjalankan mesin.
- stop(): Mematikan mesin.

### Class Motor

![image](ss6/motor.png)

