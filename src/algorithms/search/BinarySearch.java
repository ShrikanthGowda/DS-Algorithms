package algorithms.search;

public class BinarySearch {

  private void findElement(int[] arr, int ele) {

    int result = findHelper(arr, ele, 0, arr.length-1);
    if(result != -1)
      System.out.println("Element Found");
    else
      System.out.println("Element Not Found");
  }

  private int findHelper(int[] arr, int ele, int start, int end) {

    if(end>=start) {
      int mid = (start + end) / 2;

      if(ele == arr[mid])
        return 1;

      if(ele < arr[mid])
        return findHelper(arr, ele, start, mid-1);

      if(ele > arr[mid])
        return findHelper(arr, ele, mid+1, end);
    }

    return -1;
  }

  public static void main(String[] args) {

    int a[] = {10, 13, 15, 17, 21, 23};
    BinarySearch binarySearch = new BinarySearch();
    binarySearch.findElement(a, 7);

  }
}
