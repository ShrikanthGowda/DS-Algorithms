package DS.DoublyLinkedList;

public class LinkedList {

  private Node head = null;

  private LinkedList addElement(LinkedList list, int ele) {

    Node newNode = new Node(ele);
    if(list.head == null) {
      list.head = newNode;
      return list;
    }
    Node currentNode = list.head;
    while(currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(newNode);
    newNode.setPrevious(currentNode);
    return list;
  }


  private LinkedList removeElement(LinkedList list, int ele) {

    Node previous = null;
    Node next;
    Node current = list.head;
    while(current != null && current.getData() != ele) {
      previous = current;
      current = current.getNext();
    }
    if(current == null) {
      System.out.println(ele + " not found in list");
      return list;
    }
    previous.setNext(current.getNext());
    current.getNext().setPrevious(current.getPrevious());
    System.out.println(ele + " removed");
    return list;
  }

  private void printElementForward(LinkedList list) {

    Node currentNode = list.head;
    while(currentNode != null) {
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNext();
    }
    System.out.println();
  }

  private void printElementForwardBackward(LinkedList list) {

    Node currentNode = list.head;
    while(currentNode != null) {
      System.out.println("for element : " + currentNode.getData());
      if(currentNode.getNext() != null)
        System.out.print(currentNode.getNext().getData() + " ");
      else
        System.out.print(" NULL ");
      if(currentNode.getPrevious() != null)
        System.out.print(currentNode.getPrevious().getData() + " ");
      else
        System.out.print(" NULL ");
      currentNode = currentNode.getNext();
      System.out.println();
    }
  }


  public static void main(String args[]) {

    LinkedList linkedList = new LinkedList();
    linkedList.addElement(linkedList, 4);
    linkedList.addElement(linkedList, 1);
    linkedList.addElement(linkedList, 3);
    linkedList.addElement(linkedList, 8);

    linkedList.printElementForward(linkedList);
    linkedList.printElementForwardBackward(linkedList);

    System.out.println("--------------------------------------------");
    linkedList.removeElement(linkedList, 3);

    linkedList.printElementForward(linkedList);
    linkedList.printElementForwardBackward(linkedList);

    System.out.println("--------------------------------------------");
    linkedList.removeElement(linkedList, -3);
  }
}
