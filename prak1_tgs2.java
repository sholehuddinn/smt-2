package src;

import java.util.*;

public class prak1_tgs2 {

  public static String scan () {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan Kalimat\t: " );
    return in.nextLine();
  };

  public static String invers (String kalimat) {
    String kalimatInv = "";
    int kal = kalimat.length() - 1;
    for (int i = kal; i >= 0; i--) {
      kalimatInv += kalimat.charAt(i);
    }
    System.out.println("Di Balik\t\t: " + kalimatInv);
    return kalimatInv;
  };

  static void hasil (String kalimat, String kalimatInv) {
    String pal = kalimat.equals(kalimatInv) ? "Palindrom" : "Bukan Palindrom";
    System.out.println("Hasil\t\t\t: " + pal);
  };

  public static void main(String[] args) {

    String kalimat = "";

    while (!kalimat.equals("0")) {
      kalimat = scan();
      String kalimatInv = invers(kalimat);
      hasil(kalimat, kalimatInv);
      System.out.println("");
    }

  }
}
