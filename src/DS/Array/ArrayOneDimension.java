package DS.Array;
import java.util.Arrays;

public class ArrayOneDimension {

  static int counter = 0;
  static int arrlen = 0;
  static int[] addElement(int[] array, int index, int ele) {

    if(counter < arrlen) {
      if(index == array.length-1) {
        array[index] = ele;
        counter++;
        return array;
      }
      for(int i = array.length -1 ; i > index; i--) {
        array[i] = array[i-1];
      }
      array[index] = ele;
      counter++;
      return array;
    }
    else {
      int[] result = Arrays.copyOf(array, array.length+1);
      if(index == result.length-1) {
        result[index] = ele;
        return result;
      }
      for(int i = result.length-1; i > index; i--) {
        result[i] = result[i-1];
      }
      result[index] = ele;
      return result;
    }

  }

  static void printElements(int[] arr) {
    System.out.println(Arrays.toString(arr));
  }

  static int searchElement(int[] arr, int ele) {

    int searchEle = -1;
    for(int i=0; i<arr.length; i++) {
      if(arr[i] == ele) {
        searchEle = i;
      }
    }
    return searchEle;
  }


  static int[] removeElement(int[] arr, int ele) {
    int resultIndex = searchElement(arr, ele);
    if(resultIndex >= 0) {
      for(int i=resultIndex+1; i<arr.length; i++) {
        arr[i-1] = arr[i];
      }
      return Arrays.copyOf(arr, arr.length-1);
    }
    else
      return arr;
  }


  public static void main(String args[]) {

    int[] array = new int[5];
    arrlen = array.length;
    array = addElement(array, 0, 10);
    array = addElement(array, 1, 20);
    array = addElement(array, 2, 30);
    array = addElement(array, 3, 40);
    array = addElement(array, 4, 50);
    array = addElement(array, 5, 60);
    array = addElement(array, 4, -50);

    printElements(array);

    int result = searchElement(array, -50);
    array = removeElement(array, -50);

    printElements(array);
  }

}
