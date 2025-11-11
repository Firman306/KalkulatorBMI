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

        //Menampilkan Hasil
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
