public class prak4_tgs {

  int data;
  prak4_tgs head;
  prak4_tgs prev;
  prak4_tgs next;

  prak4_tgs() {
      this.head = null;
  }

  prak4_tgs(int data) {
      this.head = null;
      this.data = data;
      this.prev = null;
      this.next = null;
  }

  void insertFront(int data) {
      prak4_tgs node = new prak4_tgs(data);

      if (head == null) {
          head = node;
      } else {
          node.next = head;
          head.prev = node;
          head = node;
      }
  }

  void insertAfter(prak4_tgs prevNode, int data) {
      if (prevNode == null) {
          System.out.println("!0");
          return;
      }

      prak4_tgs node = new prak4_tgs(data);
      node.next = prevNode.next;
      prevNode.next = node;
      node.prev = prevNode;

      if (node.next != null) {
          node.next.prev = node;
      }
  }

  void insertBefore(prak4_tgs nextNode, int data) {
      if (nextNode == null) {
          System.out.println("!0");
          return;
      }

      prak4_tgs node = new prak4_tgs(data);
      node.prev = nextNode.prev;
      nextNode.prev = node;
      node.next = nextNode;

      if (node.prev != null) {
          node.prev.next = node;
      } else {
          head = node;
      }
  }

  void deleteFirst() {
      if (head == null) {
          System.out.println("List kosong.");
          return;
      }

      head = head.next;

      if (head != null) {
          head.prev = null;
      }
  }

  void deleteLast() {
      if (head == null) {
          System.out.println("List kosong.");
          return;
      }

      if (head.next == null) {
          head = null;
          return;
      }

      prak4_tgs temp = head;
      while (temp.next != null) {
          temp = temp.next;
      }

      temp.prev.next = null;
  }

  void printFront() {
      if (head == null) {
          System.out.println("List kosong.");
          return;
      }

      prak4_tgs node = head;
      while (node != null) {
          System.out.print(node.data + " ");
          node = node.next;
      }
      System.out.println("");
  }

  void printBack() {
      if (head == null) {
          System.out.println("List kosong.");
          return;
      }

      prak4_tgs node = head;
      while (node.next != null) {
          node = node.next;
      }

      while (node != null) {
          System.out.print(node.data + " ");
          node = node.prev;
      }
      System.out.println("");
  }

  public static void main(String[] args) {
      prak4_tgs list = new prak4_tgs();

      list.insertFront(3);
      list.insertFront(2);
      list.insertFront(1);
      
      list.printFront();  

      list.insertAfter(list.head.next, 4);
      list.printFront();  

      list.insertBefore(list.head.next, 5);
      list.printFront();   

      list.deleteFirst();
      list.printFront();  

      list.deleteLast();
      list.printFront();  
  }
}
