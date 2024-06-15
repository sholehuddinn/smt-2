public class prak2_tgs {

  private int[] queue;
  private int size;
  private int front;
  private int rear;
  private int qty;

  public prak2_tgs(int qty) {
    this.qty = qty;
    queue = new int[qty];
    size = 0;
    front = 0;
    rear = 0;
  }

  public void add(int val) {
    if (size == qty) {
      System.out.println(" Antrean Penuh");
    } else {
      queue[rear] = val;
      rear = (rear + 1) % qty;
      size++;
    }
  }

  public int poll() {
    if (size == 0) {
      System.out.println(" Antrean Kosong");
      return -1;
    } else {
      int hasil = queue[front];
      queue[front] = 0;
      front = (front + 1) % qty;
      size--;
      return hasil;
    }
  }

  public int peek() {
    if (size == 0) {
      System.out.println(" Antrean Kosong");
      return -1;
    } else {
      return queue[front];
    }
  }

  public void print() {
    for (int i = 0; i < qty; i++) {
        System.out.print(" | " + queue[i]);
    }
    System.out.print(" |\n");
  }

  public static void main(String[] args) {
    prak2_tgs antre = new prak2_tgs(6);
    
    antre.add(5);
    antre.add(3);
    antre.add(2);
    antre.print();
    antre.add(11);
    antre.add(37);
    antre.add(97);
    antre.print();
    antre.poll();
    antre.print();
    antre.poll();
    antre.print();
    antre.peek();
    antre.print();
    antre.add(51);
    antre.print();
  }
}
