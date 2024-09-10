import java.util.*;

public class App2 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan Kata: ");
    String kata = in.nextLine();

    System.out.print("Render Berapa Kali: ");
    int n = in.nextInt();

    String hb = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String hk = "abcdefghijklmnopqrstuvwxyz";
    String num = "0123456789";

    // Gabungkan semua karakter yang valid
    String allChars = hb + hk + num;

    // Ubah kata yang dimasukkan menjadi array karakter
    char[] mentah = kata.toCharArray();

    // Proses pergeseran huruf
    for (int j = 1; j <= n; j++) {
      char[] rest = new char[mentah.length];
      
      for (int i = 0; i < mentah.length; i++) {
        char currentChar = mentah[i];
        int index = allChars.indexOf(currentChar);

        if (index != -1) { // Jika karakter ditemukan dalam allChars
          int newIndex = (index + j) % allChars.length();
          rest[i] = allChars.charAt(newIndex);
        } else { // Jika karakter tidak ditemukan, tetap gunakan karakter asli
          rest[i] = currentChar;
        }
      }
      
      System.out.println("Pergeseran Ke-" + j + ": " + new String(rest));
    }

    in.close();
  }
}
