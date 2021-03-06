class Node/*#{ghost Object g}*/ {
  public Node/*#{g}*/ next;
  public int x /*#guarded_by g*/;
  
  Node(Node/*#{g}*/ next, int x) {
    this.next = next;
    this.x = x;
  }
}

public class Main {
  public static void main(String[] args) {
    new Main().go();
  }

  private Node/*#{this}*/ head = null;

  private synchronized void addNode(int x) {
    head = new Node(head, x);
  }

  private void go() {
    addNode(1);
    addNode(2);
    System.out.println(head.next.x);
  }
}
