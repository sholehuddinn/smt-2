import java.util.*;

public class App {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan Kata: ");
    String kata = in.nextLine();

    System.out.print("Geser Berapa Kali: ");
    int n = in.nextInt();

    String hb = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String hk = "abcdefghijklmnopqrstuvwxyz";
    String num = "0123456789";

    // Gabungkan semua karakter yang valid
    String allChars = hb + hk + num;

    // Ubah kata yang dimasukkan menjadi array karakter
    char[] mentah = kata.toCharArray();
    char[] rest = new char[mentah.length];

    // Proses pergeseran huruf
    for (int i = 0; i < mentah.length; i++) {
      char currentChar = mentah[i];
      int index = allChars.indexOf(currentChar);
      
      if (index != -1) { // Jika karakter ditemukan dalam allChars
        int newIndex = (index + n) % allChars.length();
        rest[i] = allChars.charAt(newIndex);
      } else { // Jika karakter tidak ditemukan, tetap gunakan karakter asli
        rest[i] = currentChar;
      }

      
    }

    // Cetak hasil
    System.out.println("Hasil Pergeseran: " + new String(rest));

    in.close();
  }
}
