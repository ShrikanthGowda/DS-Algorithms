package Algorithms.Sort;

public class QuickSort {

  private int[] arr;

  public QuickSort(int[] arr) {
    this.arr = arr;
  }

  private void sortHelper(int low, int high) {

    if(high > low) {
      int pIndex = partitionHelper(low, high);
      sortHelper(low, pIndex-1);
      sortHelper(pIndex+1, high);
    }
  }

  private int partitionHelper(int low, int high) {

    int pivot = arr[high];
    int i = low - 1;
    for(int j=low; j<high; j++) {
      if(arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return i+1;
  }

  private void printElement() {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int[] arr = {10, 7, 11, 1, 31, 35, 16};
    QuickSort quickSort = new QuickSort(arr);
    System.out.println("Before sort");
    quickSort.printElement();
    System.out.println("--------------------------------");
    quickSort.sortHelper(0, arr.length-1);
    System.out.println("After sort");
    quickSort.printElement();
  }
}
