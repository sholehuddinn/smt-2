// konstruktor
class node {
  int data;
  node next;
  node(int data) {
    this.data = data;
    this.next = null;
  }
}

class linkedList {
  node head;

  public linkedList() {
    this.head = null;
  }

  public void insertFront (int data) {
    node nwNode = new node(data);

    if (head == null) {
      head = nwNode;
    } else {
      nwNode.next = head;
      head = nwNode;
    }
  }

  public void insertBack (int data) {
    node nwNode = new node(data);

    if (head == null) {
      head = nwNode;
    } else {
      node temp = head;
      while (temp.next!= null) {
        temp = temp.next;
      }
      temp.next = nwNode;
    }
  }

  public void print() {
    if (head == null) {
      System.out.println("kosong");
    }else {
      node temp = head;
      while (temp != null) {
        System.out.print(" | " + temp.data);
        if (temp.next == null) {
          System.out.print(" |");
        }
        temp = temp.next;
      }
      System.out.println("");
    }
  }

  public void deleteFront() {
    if (head == null) {
      System.out.println("kosong");
    } else {
      head = head.next;
    }
  }

  public void deleteBack() {
    if (head == null) {
      System.out.println("kosong");
    } else {
      node temp = head;
      while (temp.next.next!= null) {
        temp = temp.next;
      }
      temp.next = null;
    }
  }

  public void find(int data) {
    if (head == null) {
      System.out.println("kosong");
    } else {
      node temp = head;
      while (temp!= null) {
        if (temp.data == data) {
          System.out.println("ada");
          return;
        }
        temp = temp.next;
      }
      System.out.println("tidak ada");
    }
  }

  public void delete(int data) {
    if (head == null) {
      System.out.println("kosong");
    } else {
      node temp = head;
      while (temp.next!= null) {
        if (temp.next.data == data) {
          temp.next = temp.next.next;
          return;
        }
        temp = temp.next;
      }
      System.out.println("Data " + data + " Berhasil Di Hapus");
    }
  }
}

public class prak3_tgs{
  public static void main(String[] args) {
    linkedList linked = new linkedList();

    linked.insertFront(11);
    linked.insertFront(12);
    linked.insertFront(13);
    linked.print();
    linked.deleteFront();
    linked.print();
    linked.deleteBack();
    linked.print();
    linked.find(12);
    linked.find(13);
    linked.insertBack(14);
    linked.insertBack(15);
    linked.print();
  }
}
