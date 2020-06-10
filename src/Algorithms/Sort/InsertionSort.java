package Algorithms.Sort;

public class InsertionSort {

  private void sortElement(int[] arr) {

    for(int i=1; i<arr.length; i++) {

      for(int j=i; j>0; j--) {

        if(arr[j] < arr[j-1]) {
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
        else
          break;
      }
    }
  }

  private void printElement(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }


  public static void main(String args[]) {

    int[] arr = {4, 3, 5, 1, 2};
    InsertionSort insertionSort = new InsertionSort();
    insertionSort.sortElement(arr);
    insertionSort.printElement(arr);
  }
}
