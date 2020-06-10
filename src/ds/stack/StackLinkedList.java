package ds.stack;

public class StackLinkedList {

  private Node top = null;
  private int itemsSize;
  private int counter;

  StackLinkedList(int itemsSize) {
    this.itemsSize = itemsSize;
  }

  private void push(int ele) {
    if(counter == itemsSize) {
      System.out.println("Stack overflow");
      return;
    }
    Node currentNode = new Node(ele);
    currentNode.setNext(top);
    top = currentNode;
    counter++;
  }


  private void pop() {
    if(counter<=0) {
      System.out.println("Stack underflow");
      return;
    }
    top = top.getNext();
    counter--;
  }


  private void printElements() {
    Node currentNode = top;
    while(currentNode!=null) {
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNext();
    }
    System.out.println();
  }


  public static void main(String args[]) {

    StackLinkedList stackLinkedList = new StackLinkedList(5);
    stackLinkedList.push(10);
    stackLinkedList.push(8);
    stackLinkedList.push(6);
    stackLinkedList.push(4);
    stackLinkedList.push(2);
    stackLinkedList.push(0);

    stackLinkedList.printElements();

    stackLinkedList.pop();
    stackLinkedList.push(0);

    stackLinkedList.printElements();

    stackLinkedList.pop();
    stackLinkedList.pop();
    stackLinkedList.pop();
    stackLinkedList.pop();
    stackLinkedList.pop();
    stackLinkedList.pop();

    stackLinkedList.printElements();

  }
}
