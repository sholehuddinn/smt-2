public class tugas8 {

  public void selectionShort(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++) {
          int min_idx = i;
          for (int j = i + 1; j < n; j++)
              if (arr[j] < arr[min_idx])
                  min_idx = j;
          int temp = arr[min_idx];
          arr[min_idx] = arr[i];
          arr[i] = temp;
      }
  }

  public void shelShort(int arr[]) {
      int n = arr.length;
      for (int gap = n / 2; gap > 0; gap /= 2) {
          for (int i = gap; i < n; i++) {
              int temp = arr[i];
              int j;
              for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                  arr[j] = arr[j - gap];
              arr[j] = temp;
          }
      }
  }

  public void quickShort(int arr[]) {
      quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int arr[], int low, int high) {
      if (low < high) {
          int pi = partition(arr, low, high);
          quickSort(arr, low, pi - 1);  
          quickSort(arr, pi + 1, high); 
      }
  }

  private int partition(int arr[], int low, int high) {
      int pivot = arr[high];
      int i = (low - 1); 
      for (int j = low; j < high; j++) {
          if (arr[j] <= pivot) {
              i++;
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
      }
      int temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;

      return i + 1;
  }

  public void print(int arr[]) {
      for (int array : arr) {
          System.out.print(" | " + array);
      }
      System.out.print(" |\n");
  }

  public static void main(String[] args) {
      tugas8 tugas8 = new tugas8();

      int arr[] = {23, 78, 15, 685, 145, 154};
      tugas8.print(arr);
      tugas8.selectionShort(arr);
      tugas8.print(arr);
      
      int arr2[] = {23, 78, 15, 685, 145, 154};
      tugas8.print(arr2);
      tugas8.quickShort(arr2);
      tugas8.print(arr2);

      int arr3[] = {23, 78, 15, 685, 145, 154};
      tugas8.print(arr3);
      tugas8.shelShort(arr3);
      tugas8.print(arr3);
  }
}
