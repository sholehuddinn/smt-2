public class Short {  
  // jika tidak pakai "static" maka harus di definisikan nama kelas nya 

  // public static void bubleshort (int arr[]) {
  public  void bubleshort (int arr[]) {
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

    // public  void insertionshort (int arr[]) {
    public  void insertionshort (int arr[]) {
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

    public void mergeshort(int arr[]) {
      if (arr.length < 2) {
        return;
      }
      int mid = arr.length / 2;
      int[] left = new int[mid];
      int[] right = new int[arr.length - mid];
  
      for (int i = 0; i < mid; i++) {
        left[i] = arr[i];
      }
    
      for (int i = mid; i < arr.length; i++) {
        right[i - mid] = arr[i];
      }
  
      mergeshort(left);
      mergeshort(right);
  
      merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right) {
      int i = 0, j = 0, k = 0;
      while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
          arr[k++] = left[i++];
        } else {
          arr[k++] = right[j++];
        }
      }
      while (i < left.length) {
        arr[k++] = left[i++];
      }
      while (j < right.length) {
        arr[k++] = right[j++];
      }
    }

    public  void print(int arr[]) {
      for (int res : arr) {
        System.out.print(" | " + res );
      }
      System.out.println(" |");
    }

  public static void main(String[] args) {
    
    Short arrays = new Short();

    int arr[] = {64, 34, 25, 12, 22, 11, 90};

    arrays.print(arr);
    arrays.bubleshort(arr);
    arrays.print(arr);  

    System.err.println("\n");

    int arr2[] = {26, 86, 165 ,45 ,56 ,15 ,87};
    arrays.print(arr2);
    arrays.insertionshort(arr2);
    arrays.print(arr2);

    System.out.println("\n");

    int arr3[] = {56, 89, 15, 61, 47, 17, 65};
    arrays.print(arr3);
    arrays.mergeshort(arr3);
    arrays.print(arr3);

    // System.out.print("Bubble Sort :");    => maka jadi function jika tanpa "static"
    // bubleshort(arr);
    // print(arr);

    // System.out.print("Insertion Sort :");
    // insertionshort(arr);
    // print(arr);
  }
}

