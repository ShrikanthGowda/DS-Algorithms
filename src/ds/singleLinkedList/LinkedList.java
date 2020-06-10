package ds.singleLinkedList;


public class LinkedList {

  private Node head = null;

  private LinkedList addElement(LinkedList list, int data) {

    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return list;
    }
    Node currentNode = head;
    while(currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    currentNode.setNext(newNode);
    return list;
  }


  private void printElement(LinkedList list) {

    Node currentElement = list.head;
    while(currentElement != null) {
      System.out.print(currentElement.getData() + " ");
      currentElement = currentElement.getNext();
    }
    System.out.println();
  }


  private LinkedList removeElement(LinkedList list, int ele) {

    Node previous = null;

    Node currentNode = list.head;
    while(currentNode != null && currentNode.getData() != ele) {
      previous = currentNode;
      currentNode = currentNode.getNext();
    }

    if(currentNode == null) {
      System.out.println(ele + " not found in list");
      return list;
    }

    previous.setNext(currentNode.getNext());
    System.out.println(ele + " removed");
    return list;
  }



  public static void main(String args[]) {

    LinkedList linkedList = new LinkedList();
    linkedList = linkedList.addElement(linkedList, 4);
    linkedList = linkedList.addElement(linkedList, 1);
    linkedList = linkedList.addElement(linkedList, 3);
    linkedList = linkedList.addElement(linkedList, 8);

    linkedList.printElement(linkedList);

    linkedList = linkedList.removeElement(linkedList, 3);

    linkedList.printElement(linkedList);

    linkedList = linkedList.removeElement(linkedList, -3);
  }
}
