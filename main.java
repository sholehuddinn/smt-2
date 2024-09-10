

public class main {

  
  void shortName( String arr[]) {
    int n = arr.length;
    int i, j, index;
    for (i = 0; i < n - 1; i++) {
      index = i;
      for (j = i + 1; j < n ; j++) {
        if (arr[j].compareTo(arr[index]) < 0) {
          index = j;
        }
      }
      String temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }
  }

  void print( String arr[]) {
    int n = arr.length;
    for ( int i  = 0; i < n; i++ ) {
      System.out.println((i + 1) + ". " + arr[i]);
    }
  }



  
  public static void main(String[] args) {

    main str =  new main();

    String arr[] = {"Bagas", "Halim", "Pangeran", "Rosuli", "Wahyu", "Agung", "Indra", "Zidan", "Timothy"};

    str.print(arr);


    System.out.println("\n");

    str.shortName(arr);
    str.print(arr);

    
  }
}
