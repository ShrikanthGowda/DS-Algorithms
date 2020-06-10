package Algorithms.Sort;

public class BubbleSort {

  private void sortElement(int[] arr) {

    for(int i=0; i < arr.length; i++) {
      for(int j=0; j<arr.length-i-1; j++) {

        if(arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }


  private void printElement(int[] arr) {
    for(int i=0; i<arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }


  public static void main(String args[]) {

    BubbleSort bubbleSort = new BubbleSort();
    int[] arr = {4, 3, 5, 2, 1};
    bubbleSort.sortElement(arr);
    bubbleSort.printElement(arr);
  }
}
