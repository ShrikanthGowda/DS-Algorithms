package algorithms.search;

public class LinearSearch {

  private void findElement(int[] arr, int ele) {
    int i;
    i = findHelper(arr, ele);
    if(i!=-1)
      System.out.println("Element Found");
    else
      System.out.println("Element Not Found");

  }

  private int findHelper(int[] arr, int ele) {

    for(int i=0; i<arr.length; i++) {
      if(arr[i] == ele) {
        return 1;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    int a[] = {10, 20, 15, 50, 5, 7};
    LinearSearch linearSearch = new LinearSearch();
    linearSearch.findElement(a,7);
  }
}
