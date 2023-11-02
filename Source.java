class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }

  @Override
  public String toString() {
    return "Node{" +
            "val=" + val +
            ", next=" + next +
            '}';
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    // todo
    Node<Integer> curr = head;
    int sum = 0;
    while(curr !=null){
      sum += curr.val;
      curr = curr.next;
    }
    return sum;
  }
  public static int sumListRecursive(Node<Integer> head) {
    // todo
    if (head == null){return 0;};
    return head.val + sumListRecursive(head.next);
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    // 2 -> 8 -> 3 -> -1 -> 7
    
    System.out.println("Sum of my list: ");
    System.out.println(Source.sumListRecursive(a));
  }
}
