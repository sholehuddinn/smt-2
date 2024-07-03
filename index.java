public class index {
  
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

  public void bubleshort (int arr[]) {
    int n = arr.length;
    int temp;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < (n - i - 1); j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }


    public void insertionshort (int arr[]) {
      int n = arr.length;
      int temp;
      for (int i = 1; i < n; i++) {
        temp = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > temp) {
          arr[j + 1] = arr[j];
          j = j - 1;
        }
        arr[j + 1] = temp;
      }
    }


  public static void main(String[] args) {
    
    // int n = 10;

    // System.out.println("Factorial (Iterative): " + factorial(n));
    // System.out.println("Factorial (Tail Recursion): " + factorialTail(n, 1));
    // System.out.println("Fibonacci: " + fibonacci(n));
    // int pangkat = 2;
    // System.out.println("Pangkat: " + pangkat(n, pangkat));

    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    System.out.println("Array Sebelum Sorting:");
    for (int i=0; i<arr.length; ++i)
      System.out.print(arr[i] + " ");

    System.out.println("\n\nAfter Shorts");

    index a = new index();

    a.bubleshort(arr);
    for (int res  : arr) {
      System.out.print(res + " ");
    }

    System.out.println("");

    a.insertionshort(arr);
    for (int res : arr) {
      System.out.print(res + " ");
    }
  }
}
