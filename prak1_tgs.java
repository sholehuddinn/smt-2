package src;

import java.util.*;

public class prak1_tgs{

  public static int scan () {
    Scanner in =  new Scanner(System.in);

    System.out.println("Masukkan Bilangan yang Ingin Di Konversi");
    System.out.print("=> ");
    return in.nextInt();
  }

  static void binary (int n) {
    System.out.println("Bilangan Binary Dari " + n + "\t: " + Integer.toBinaryString(n));
  };

  static void octal (int n) {
    System.out.println("Bilangan Octal Dari " + n + "\t: " + Integer.toOctalString(n));
  };

  static void hexa (int n) {
    System.out.println("Bilangan Hexa Dari " + n + "\t: " + Integer.toHexString(n));
  };
  
  public static void main(String[] args) {
    
    int angka = scan();
    binary(angka);
    octal(angka);
    hexa(angka);

    // var coba = Integer.toBinaryString(angka);
    // System.out.println(coba.getClass().getName());
    
  }
}
