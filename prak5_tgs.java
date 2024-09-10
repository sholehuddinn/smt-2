import java.util.Scanner;
public class prak5_tgs {

  // public static int factorial (int n) {
  //   if (n == 0 || n == 1) {
  //     return 1;
  //   } else {
  //     return n * factorial(n - 1);
  //   }
  // }

  // public static int factorialTail (int n, int tail) {
  //   if (n == 0 || n == 1) {
  //     return 1;
  //   } else {
  //     return n * factorialTail(n - 1, tail * n);
  //   }
  // }

  // public static int fibonacci (int n) {
  //   if (n <= 1) {
  //     return n;
  //   } else {
  //     return fibonacci(n - 1) + fibonacci(n - 2);
  //   }
  // }

  // public static int pangkat (int n, int pangkat) {
  //   if (pangkat == 0) {
  //     return 1;
  //   } else {
  //     return n * pangkat(n, pangkat - 1);
  //   }
  // }

  public static int find (int[] arr, int val, int index) {
    if (index >= arr.length) {
      return -1;
    }
    if (arr[index] == val) {
      return index;
    } else {
      return find(arr, val, index + 1);
    }
  }

  public static int find (int[] arr, int val){
    return find(arr, val, 0);
  }

  public static void main(String[] args) {

    // int n = 10;

    // System.out.println("Factorial (Iterative): " + factorial(n));
    // System.out.println("Factorial (Tail Recursion): " + factorialTail(n, 1));
    // System.out.println("Fibonacci: " + fibonacci(n));
    // int pangkat = 2;
    // System.out.println("Pangkat: " + pangkat(n, pangkat));

    Scanner in = new Scanner(System.in);
    int arr[] = {10, 11, 63, 71, 84, 95, 102};
    for(int array : arr){
      System.out.print(array + " ");
    }
    System.out.print("\nMasukkan Angka yang Ingin Di Cari: ");
    int f = in.nextInt();
    int res = find(arr, f);
    if (res == -1) {
      System.out.println("Hasil Pencarian " + f + " Tidak ada");
    } else {
      System.out.println("Hasil Pencarian " + f + " Ditemukan pada indeks " + res);
    }
  }
}
