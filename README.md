# 🌡️ Program Kalkulator BMI (Celsius → Fahrenheit & Kelvin)

## 👤 Identitas
- **Nama:** Firman Maulana 
- **NIM:** I.2510194 
- **Mata Kuliah:** Algoritma dan Pemrograman  

---

## 🧠 Deskripsi
Program ini dibuat untuk menghitung BMI menggunakan **JOptionPane** untuk input dan output.  
Langkah program:
1. Pengguna memasukkan berat badan(Kg)
2. Pengguna memasukkan Tinggi Badan(Cm)
3. Konversi tinggi badan Centimeter menjadi Meter
4. Program menghitung Nilai BMI dengan Rumus = Berat Badan(Kg) / (Tinggi badan(M)²)
5. Hasil ditampilkan dalam kotak dialog

---

## 💻 Cuplikan Kode
```java
import javax.swing.JOptionPane;

public class KalkulatorBMI {
    public static void main(String[] args) {
        //input berat badan
        String inputBerat = JOptionPane.showInputDialog("Masukkan berat badan Anda (kg):");
        double beratBadan = Double.parseDouble(inputBerat);

        //input tinggi badan
        String inputTinggi = JOptionPane.showInputDialog("Masukkan tinggi badan Anda (cm):");
        double tinggiBadan = Double.parseDouble(inputTinggi);

        // Konversi tinggi ke meter
        double tinggiMeter = tinggiBadan / 100;

        //Hitung BMI
        double nilaiBMI = beratBadan / (tinggiMeter * tinggiMeter);

        // Menentukan kategori BMI
        String kategori;
        if (nilaiBMI < 18.5) {
            kategori = "Kurus";
        } else if (nilaiBMI <= 24.9) {
            kategori = "Normal";
        } else if (nilaiBMI <= 29.9) {
            kategori = "Gemuk";
        } else {
            kategori = "Obesitas";
        }

        //Tampilan Hasil
        String hasil = String.format(
            "Hasil Perhitungan BMI Anda:\n\n" +
            "Berat Badan : %.1f kg\n" +
            "Tinggi Badan: %.1f cm\n" +
            "Nilai BMI   : %.2f\n" +
            "Kategori    : %s",
            beratBadan, tinggiBadan, nilaiBMI, kategori
        );

        JOptionPane.showMessageDialog(null, hasil, "Kalkulator BMI", JOptionPane.INFORMATION_MESSAGE);
    }
}

```

---

## Flowchart
![input Dialog](Flowchart.pdf)

---

## 🔍 Hasil Uji Coba

### 💡 Input
![Input Dialog](Sc(01).jpg)

### 📊 Output
![Output Dialog](Sc(02).jpg)

---

## ✅ Kesimpulan
Program berhasil dijalankan dan menampilkan hasil konversi dengan benar.  
Penggunaan **JOptionPane** mempermudah interaksi dengan pengguna tanpa console.

---
