package ds.queue;

public class QueueArray {

  private int data[] = null;
  private int counter = 0;

  QueueArray(int eleLimit) {
    data = new int[eleLimit];
  }

  private void enqueue(int ele) {
    if(counter == data.length) {
      System.out.println("Queue Overflow");
      return;
    }
    data[counter++] = ele;
  }

  private void dequeue() {
    if(counter <= 0) {
      System.out.println("Queue Underflow");
      return;
    }
    System.out.println("Dequed ele : " + data[0]);
    for(int i=0; i<counter-1; i++) {
      data[i] = data[i+1];
    }
    counter--;
  }

  private void printElements() {
    for(int i=0; i<counter; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }


  public static void main(String args[]) {

    QueueArray queueArray = new QueueArray(5);
    queueArray.enqueue(10);
    queueArray.enqueue(8);
    queueArray.enqueue(6);
    queueArray.enqueue(4);
    queueArray.enqueue(2);
    queueArray.enqueue(0);

    queueArray.printElements();

    System.out.println("-----------------------------------------");

    queueArray.dequeue();
    queueArray.enqueue(007);
    queueArray.printElements();
    System.out.println("-----------------------------------------");


    queueArray.dequeue();
    queueArray.dequeue();
    queueArray.dequeue();
    queueArray.dequeue();
    queueArray.dequeue();
    queueArray.dequeue();
    queueArray.printElements();
    System.out.println("-----------------------------------------");

    queueArray.enqueue(100);
    queueArray.enqueue(200);
    queueArray.printElements();
  }
}
