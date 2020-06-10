package Algorithms.Sort;

public class MergeSort {

  int[] arr = {10, 6, 5, 4};
  int[] tempArr = new int[arr.length];

  private void sortElement() {

    divideElement(0, arr.length-1);
  }

  private void divideElement(int low, int high) {

    if(high > low) {
      int mid = (low + high) / 2;
      divideElement(low, mid);
      divideElement(mid+1, high);
      conquerElement(low, mid, high);
    }
  }


  private void conquerElement(int loww, int middle, int high) {

    int low=loww;
    int j=low;
    int tempMiddle = middle+1;
    while(low <= middle && tempMiddle <= high) {
      if(arr[low] > arr[tempMiddle]) {
        tempArr[j++] = arr[tempMiddle];
        ++tempMiddle;
      }
      else {
        tempArr[j++] = arr[low];
        ++low;
      }
    }

    while(low <= middle) {
      tempArr[j++] = arr[low];
      ++low;
    }

    while(tempMiddle <= high) {
      tempArr[j++] = arr[tempMiddle];
      ++tempMiddle;
    }

    for(int k=loww; k<=high; k++) {
      arr[k] = tempArr[k];
    }

  }


  private void printElement() {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }


  public static void main(String args[]) {

    MergeSort mergeSort = new MergeSort();
    System.out.println("Before Sort ");
    mergeSort.printElement();
    System.out.println("------------------------------------- ");
    mergeSort.sortElement();
    System.out.println("After Sort ");
    mergeSort.printElement();
    System.out.println("------------------------------------- ");
  }
}
