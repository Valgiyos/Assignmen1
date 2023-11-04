# Assignment1

## Nomor 1

program Java yang mencetak deret angka dari 1 hingga 100 dengan output tertentu sesuai dengan aturan berikut:

Program dimulai dengan mendefinisikan kelas Java bernama "NumberList" menggunakan deklarasi **`public class NumberList {`**.

Metode **`public static void main(String[] args)`** adalah metode utama yang akan dieksekusi ketika program dijalankan. Itu adalah titik masuk utama untuk program Java.

Di dalam metode **`main`**, kita menggunakan perulangan **`for`** untuk mengulangi variabel **`i`** dari 1 hingga 100 dengan **`for (int i = 1; i <= 100; i++)`**.

Di dalam perulangan, ada pernyataan **`if-else`** yang memeriksa nilai **`i`**. Jika **`i`** kurang dari atau sama dengan 9 (yaitu, angka 1 hingga 9), program akan mencetak nilai **`i`** itu sendiri dengan **`System.out.println(i);`**.

Jika **`i`** lebih besar dari 9 (yaitu, angka 10 hingga 100), program akan mencetak "(Your Name)" sebagai penggantinya dengan **`System.out.println("M.D Valgiyos Aritonang");`**.

Hasil dari program ini adalah mencetak angka dari 1 hingga 9 secara berurutan, diikuti oleh pencetakan "(Your Name)" dari angka 10 hingga 100. Pada bagian **(M.D Valgiyos Aritonsng)`**, Anda seharusnya menggantinya dengan nama Anda atau teks lain yang sesuai. Jadi, program ini mencetak deret angka dengan sedikit variasi dalam output.

## Nomor 2
program Java yang memanfaatkan perulangan **`while`** untuk meminta pengguna memasukkan angka dari 0 hingga 4 dan memberikan output berdasarkan kondisi yang ditentukan. Berikut penjelasan langkah demi langkah:

1. Program dimulai dengan mengimpor pustaka **`java.util.Scanner`** yang digunakan untuk membaca input dari pengguna.
2. Kode selanjutnya mendefinisikan kelas Java dengan nama "WhileLoopExample" menggunakan deklarasi **`public class WhileLoopExample {`**.
3. Di dalam metode **`main`**, sebuah objek **`Scanner`** dengan nama **`scanner`** dibuat untuk membaca input dari pengguna. Kemudian, variabel **`number`** diinisialisasi dengan nilai 0. Variabel **`number`** akan digunakan untuk menyimpan angka yang dimasukkan oleh pengguna.
4. Selanjutnya, ada perulangan **`while`** yang akan terus berjalan selama **`number`** kurang dari 5. Ini berarti program akan terus meminta pengguna memasukkan angka hingga **`number`** mencapai atau melebihi 5.
5. Di dalam perulangan **`while`**, program mencetak pesan "Masukkan sebuah angka (0-4): " dan kemudian menggunakan **`scanner.nextInt()`** untuk membaca angka yang dimasukkan oleh pengguna dan menyimpannya dalam variabel **`number`**.
6. Setelah membaca angka, program melakukan beberapa pemeriksaan dengan pernyataan **`if-else`**:
    - Jika angka yang dimasukkan kurang dari 0 atau lebih besar dari 4, program mencetak pesan "Angka tidak valid, silakan coba lagi."
    - Jika angka tersebut genap (angka habis dibagi 2), program mencetak "Angka genap."
    - Jika angka tersebut ganjil, program mencetak "Angka ganjil."
7. Setelah memproses angka yang dimasukkan, program kembali ke awal perulangan **`while`** dan terus meminta pengguna memasukkan angka hingga **`number`** mencapai atau melebihi 5.
8. Setelah keluar dari perulangan, program menutup objek **`scanner`** dengan **`scanner.close()`** karena telah selesai menggunakan input dari pengguna.

Hasilnya adalah program akan terus meminta pengguna memasukkan angka dari 0 hingga 4, dan akan memberikan feedback apakah angka tersebut ganjil, genap, atau tidak valid. Program akan berhenti meminta input setelah **`number`** mencapai atau melebihi 5.

## Nomor 3
program Java yang memungkinkan pengguna memasukkan tanggal dan bulan lahir, dan kemudian menentukan zodiak berdasarkan tanggal lahir tersebut. Berikut penjelasan langkah demi langkah:

1. Program dimulai dengan mengimpor pustaka **`java.util.Scanner`** untuk membaca input dari pengguna.
2. Kemudian, program mendefinisikan kelas Java dengan nama "ZodiacSign" menggunakan deklarasi **`public class ZodiacSign {`**.
3. Di dalam metode **`main`**, sebuah objek **`Scanner`** dengan nama **`scanner`** dibuat untuk membaca input dari pengguna.
4. Program kemudian meminta pengguna memasukkan tanggal lahir dengan pesan "Masukkan tanggal lahir (contoh: 15): " dan membaca input tersebut sebagai integer yang disimpan dalam variabel **`day`**.
5. Selanjutnya, program meminta pengguna memasukkan bulan lahir dengan pesan "Masukkan bulan lahir (contoh: 3): " dan membaca input sebagai integer yang disimpan dalam variabel **`month`**.
6. Variabel **`zodiacSign`** digunakan untuk menyimpan nama zodiak yang akan ditentukan nanti.
7. Program menggunakan serangkaian pernyataan **`if-else`** untuk menentukan zodiak berdasarkan nilai **`day`** dan **`month`** yang dimasukkan pengguna. Setiap blok **`if`** memeriksa apakah tanggal lahir cocok dengan rentang tertentu yang sesuai dengan satu zodiak. Jika sesuai, program mengatur variabel **`zodiacSign`** dengan nama zodiak yang sesuai.
8. Jika tidak ada zodiak yang sesuai dengan tanggal lahir yang dimasukkan, program mencetak pesan "Tanggal lahir tidak valid." dan keluar dari program menggunakan pernyataan **`return`**.
9. Terakhir, program mencetak zodiak yang sesuai dengan pesan "Zodiak: " diikuti oleh nilai dari variabel **`zodiacSign`**.
10. Akhirnya, objek **`Scanner`** ditutup dengan **`scanner.close()`** karena telah selesai menggunakan input dari pengguna.

Hasilnya adalah program akan meminta pengguna memasukkan tanggal dan bulan lahir, kemudian menentukan zodiak yang sesuai berdasarkan tanggal lahir tersebut, dan mencetak zodiak tersebut sebagai output. Jika tanggal lahir tidak sesuai dengan zodiak apa pun, program akan memberikan pesan bahwa tanggal lahir tidak valid.

## Nomor 4
program Java yang membuat sebuah array of integer, dan kemudian menggunakan perulangan **`for`** untuk menampilkan semua nilai dalam array tersebut. Berikut penjelasan langkah demi langkah:

1. Program dimulai dengan mendefinisikan kelas Java dengan nama "ArrayExample" menggunakan deklarasi **`public class ArrayExample {`**.
2. Di dalam metode **`main`**, sebuah array of integer dengan nama **`numbers`** dibuat dan diinisialisasi dengan nilai-nilai, yaitu 1, 2, 3, 4, dan 5. Inisialisasi array dilakukan dengan sintaks **`{1, 2, 3, 4, 5}`**.
3. Kemudian, program menggunakan perulangan **`for`** untuk mengiterasi melalui semua elemen dalam array **`numbers`**. Perulangan ini dilakukan dengan menginisialisasi variabel **`i`** dengan nilai 0, dan selanjutnya program akan menjalankan perulangan selama **`i`** kurang dari panjang array **`numbers`** (diwakili oleh **`numbers.length`**).
4. Di dalam setiap iterasi perulangan, program mencetak nilai dari array **`numbers`**. Pada baris ini, pernyataan **`System.out.println`** digunakan untuk mencetak pesan yang mencakup nilai elemen array dan indeksnya. **`"Nilai ke-" + i`** digunakan untuk menunjukkan indeks elemen dalam pesan, dan **`numbers[i]`** digunakan untuk mencetak nilai elemen array pada indeks **`i`**.

Hasilnya adalah program akan mengiterasi melalui semua elemen dalam array **`numbers`** dan mencetak setiap nilai beserta indeksnya. Output dari program ini akan menampilkan setiap nilai dengan pesan "Nilai ke-i: nilai", di mana "i" adalah indeks elemen dalam array dan "nilai" adalah nilai sesuai dengan indeks tersebut.
