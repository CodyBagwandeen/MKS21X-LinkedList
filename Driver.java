public class Driver{
  public static void main( String[] args) {
    Node n1 = new Node( 50, null, null);
    Node n2 = new Node( 123, null, n1);
    Node n3 = new Node( 3, null, n2);

    System.out.println( n1.next());
    System.out.println( n2.next());
    System.out.println( n3.next());

    System.out.println("Should be null, null, null \n");

    n1.setNext(n2);
    n2.setNext(n3);

    System.out.println( n1.next());
    System.out.println( n2.next());
    System.out.println( n3.next());

    System.out.println("Should be the adresses for the Node1, Node2, null \n");

    n2.setPrev(n1);
    n3.setPrev(n2);

    System.out.println( n1.prev());
    System.out.println( n2.prev());
    System.out.println( n3.prev());

    System.out.println("Should be null, Node1, Node2 \n");

    System.out.println( n1.data());
    System.out.println( n2.data());
    System.out.println( n3.data());

    System.out.println("Should be 50, 123, 3 \n");

    MyLinkedList L1 = new MyLinkedList( n1, n2);

    System.out.println(L1);

    System.out.println("Should be [50, 123] \n");

    L1.add(4);

    System.out.println(L1);

    System.out.println("Should be [50, 123, 4] \n");


  }
}
