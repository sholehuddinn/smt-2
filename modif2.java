public class modif2 {
  private int[] queue;
  private int front;
  private int back;
  private int size;
  private int capacity;

  public modif2(int capacity) {
      this.capacity = capacity;
      this.queue = new int[capacity];
      this.front = 0;
      this.back = 0;
      this.size = 0;
  }

  public void add(int value) {
      if (size == capacity) {
          throw new IllegalStateException("Queue is full");
      }
      queue[back] = value;
      back = (back + 1) % capacity;
      size++;
  }

  public int poll() {
      if (size == 0) {
          throw new IllegalStateException("Queue is empty");
      }
      int value = queue[front];
      front = (front + 1) % capacity;
      size--;
      return value;
  }

  public int peek() {
      if (size == 0) {
          throw new IllegalStateException("Queue is empty");
      }
      return queue[front];
  }

  public static void main(String[] args) {
      modif2 queue = new modif2(5);

      // Initial state of the queue
      queue.add(5);
      queue.add(3);
      queue.add(2);

      // Performing the operations
      queue.add(11);  // Add (11)
      queue.add(37);  // Add (37)
      queue.add(97);  // Add (97)

      System.out.println("Polled value: " + queue.poll());  // Poll ()
      System.out.println("Peeked value: " + queue.peek());  // Peek ()
      System.out.println("Polled value: " + queue.poll());  // Poll ()
      queue.add(51);  // Enqueue (51)
  }
}
