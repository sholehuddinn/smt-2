package src;

import java.util.*;

public class prak1_tgs3 {
  
  public static String scan () {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan Kalimat\t: " );
    return in.nextLine();
  };

  public static String invers (String Kalimat) {
    Stack stack = new Stack();
    String inv = "";

    for (char st : Kalimat.toCharArray()) {
      stack.push(st);
    }
    while (!stack.isEmpty()) {
      inv += stack.pop();
    }
    System.out.println("Di Balik\t\t: " + inv);
    return inv;
  }

  static void hasil (String kalimat, String kalimatInv) {
    String pal = kalimat.equals(kalimatInv) ? "Palindrom" : "Bukan Palindrom";
    System.out.println("Hasil\t\t\t: " + pal);
  }

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
