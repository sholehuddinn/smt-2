package src;

import java.util.*;

public class prak1_tgs4 {
  
  public static int scan() {
    Scanner in  = new Scanner(System.in);
    System.out.print("Masukkan Bilangan Decimal : ");
    return in.nextInt();
  }

  public static String binary(int n) {
    Stack stack = new Stack();
    String inv = "";
    while (n > 0) {
      stack.push(n % 2);
      n /= 2;
    }
    while (!stack.isEmpty()) {
      inv += stack.pop();
    }
    return inv;
  }

  public static String octal (int n) {
    Stack stack = new Stack();
    String inv = "";
    while (n > 0) {
      stack.push(n % 8);
      n /= 8;
    }
    while (!stack.isEmpty()) {
      inv += stack.pop();
    }
    return inv;
  }

  public static String hex (int n) {
    Stack stack = new Stack();
    String hasil = "";
    char digit[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    while (n > 0) {
      stack.push(digit[n % 16]);
      n /= 16;
    }
    while (!stack.isEmpty()) {
      hasil += stack.pop();
    }
    return hasil;
  }

  static void out (int n,String biner, String octal, String hexa) {
    String jenis[] = {"Biner", "Octal", "Hexadecimal"};
    String hasil[] = {biner, octal, hexa};
    for(int i = 0; i < 3; i++) {
      System.out.println("Bilangan " + jenis[i] + " Dari " + n + " : " + hasil[i]);
    }
  };

  public static void main(String[] args) {
    
    int angka = scan();
    out(angka, binary(angka), octal(angka), hex(angka));
  }
}