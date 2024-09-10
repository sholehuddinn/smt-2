

public class main2 {

  void insertionshort(int arr[]) {
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

  void printFase(int arr[]) {
    int n = arr.length;

    int arr2[] = new int[n];
    
    for (int j = 0; j < n; j++) {
      arr2[j] = arr[j];
    }

    for (int i = 0; i < n; i++) {
      System.out.print("fase-" + (i + 1) + ": ");
      for(int j = 0; j <= i ; j++) {
        System.out.print(arr2[j] + ", ");
      }
      System.out.println("");
    }
  }

  void print(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print( arr[i] + " ");
    }
  }  



  public static void main(String[] args) {
    int arr[] = {19, 12, 78, 34, 23, 98};

    main2 obj = new main2();


    System.out.print("kondisi awal array: ");
    obj.print(arr);
    
    obj.insertionshort(arr);

    System.out.println("");
    obj.printFase(arr);




    System.out.print("kondisi akhir array: ");
    obj.print(arr);
  }
}
