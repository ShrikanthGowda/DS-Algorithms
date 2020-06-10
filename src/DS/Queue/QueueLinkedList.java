package DS.Queue;

public class QueueLinkedList {

  private Node front = null;
  private Node rear = null;
  private int eleLimit;
  private int counter = 0;

  QueueLinkedList(int eleLimit) {
    this.eleLimit = eleLimit;
  }

  private void enqueue(int ele) {

    if(counter == eleLimit) {
      System.out.println("Queue Overflow");
      return;
    }
    Node currentNode = new Node(ele);
    if(rear == null)
      front = rear = currentNode;
    else {
      rear.setNext(currentNode);
      rear = currentNode;
    }
    counter++;
  }

  private void dequeue() {

    if(counter <= 0) {
      System.out.println("Queue Underflow");
      return;
    }
    System.out.println("Dequeued ele : " + front.getData());
    if(front.getNext() != null)
      front = front.getNext();
    else
      front = rear = null;
    counter--;
  }

  private void printElements() {

    Node currentNode = front;
    while(currentNode != null) {
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNext();
    }
    System.out.println();
  }


  public static void main(String args[]) {

    QueueLinkedList queueLinkedList = new QueueLinkedList(5);
    queueLinkedList.enqueue(10);
    queueLinkedList.enqueue(8);
    queueLinkedList.enqueue(6);
    queueLinkedList.enqueue(4);
    queueLinkedList.enqueue(2);
    queueLinkedList.enqueue(0);

    queueLinkedList.printElements();

    System.out.println("-----------------------------------------");

    queueLinkedList.dequeue();
    queueLinkedList.enqueue(0);
    queueLinkedList.printElements();
    System.out.println("-----------------------------------------");


    queueLinkedList.dequeue();
    queueLinkedList.dequeue();
    queueLinkedList.dequeue();
    queueLinkedList.dequeue();
    queueLinkedList.dequeue();
    queueLinkedList.dequeue();
    queueLinkedList.printElements();
    System.out.println("-----------------------------------------");

    queueLinkedList.enqueue(100);
    queueLinkedList.enqueue(200);
    queueLinkedList.printElements();
  }
}
