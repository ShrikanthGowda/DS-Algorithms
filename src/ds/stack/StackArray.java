package ds.stack;

public class StackArray {

  private int[] data = null;
  private int counter = 0;

  StackArray(int ele) {
    data = new int[ele];
  }

  private void push(int ele) {
    if(counter == data.length) {
      System.out.println("Stack Overflow");
      return;
    }
    data[counter++] = ele;
  }


  private void pop() {
    if(counter <= 0) {
      System.out.println("Stack Underflow");
      return;
    }
    System.out.println("poped ele : " + data[--counter]);
  }


  private void printElement() {
    for(int i=0; i<counter;i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }


  public static void main(String args[]) {

    StackArray stackArray = new StackArray(5);
    stackArray.push(10);
    stackArray.push(8);
    stackArray.push(6);
    stackArray.push(4);
    stackArray.push(2);
    stackArray.push(0);

    stackArray.printElement();

    stackArray.pop();
    stackArray.push(0);

    stackArray.printElement();

    stackArray.pop();
    stackArray.pop();
    stackArray.pop();
    stackArray.pop();
    stackArray.pop();
    stackArray.pop();

    stackArray.printElement();
  }
}
