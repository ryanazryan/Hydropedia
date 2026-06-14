
# 🌱 Hydropedia

Sistem Manajemen, Monitoring, dan Notifikasi Tanaman Hidroponik Berbasis Spring Boot.

## 📖 Deskripsi

Hydropedia merupakan aplikasi yang dirancang untuk membantu pengguna dalam mengelola data tanaman hidroponik, melakukan monitoring kondisi tanaman berdasarkan parameter pH dan nutrisi, serta memberikan notifikasi apabila kondisi tanaman berada di luar rentang ideal.

Proyek ini dikembangkan sebagai Tugas Besar Mata Kuliah Pemrograman Berorientasi Objek.

---

## ✨ Fitur

* Registrasi dan Login Pengguna
* CRUD Data Jenis Tanaman
* CRUD Data Tanaman
* Monitoring Kondisi Tanaman
* Monitoring Nilai pH
* Monitoring Nilai Nutrisi
* Notifikasi Kondisi Tanaman
* Manajemen Data Tanaman Hidroponik

---

## 🏗️ Struktur Proyek

```text
src/main/java/com/hydropedia/hydropedia

├── config
├── controller
├── dto
├── model
├── repository
├── service
└── util
```

---

## 🛠️ Teknologi

* Java 17
* Spring Boot 3.5.x
* Maven
* SQLite
* Git & GitHub

---

## 📊 Class Diagram

Class diagram terdiri dari:

* User
* ManajemenTanaman
* JenisTanaman
* Tanaman
* Sensor
* SensorPH
* SensorNutrisi
* Notifikasi
* KelolaData

---

## 👥 Tim Pengembang

| Nama               | Tanggung Jawab                      |
| ------------------ | ----------------------------------- |
| Naufal Faiq Azryan | ManajemenTanaman & Integrasi Sistem |
| Nadila Zari Fani   | Tanaman & JenisTanaman              |
| Lela               | Sensor, SensorPH, SensorNutrisi     |
| Hermawan           | Notifikasi                          |
| Erza               | User & KelolaData                   |

---

## 🚀 Menjalankan Proyek

Clone repository:

```bash
git clone https://github.com/USERNAME/Hydropedia.git
```

Masuk ke folder project:

```bash
cd Hydropedia
```

Jalankan aplikasi:

```bash
mvn spring-boot:run
```

---

## 📄 Lisensi

Digunakan untuk keperluan akademik dan pembelajaran.
