public class Driver{
  public static void main( String[] args) {
    Node n1 = new Node(50, null,null);
    Node n2 = new Node(123,null,null);
    Node n3 = new Node(3,null,null);

    System.out.println( n1.next());
    System.out.println( n2.next());
    System.out.println( n3.next());

    System.out.println("Should be null, null, null \n");

    n1.setNext(n2);
    n2.setNext(n3);

    System.out.println( n1.next());
    System.out.println( n2.next());
    System.out.println( n3.next());

    System.out.println("Should be 123, 3, null \n");

    n2.setPrev(n1);
    n3.setPrev(n2);

    System.out.println( n1.prev());
    System.out.println( n2.prev());
    System.out.println( n3.prev());

    System.out.println("Should be null, 50, 123 \n");

    System.out.println( n1.getData());
    System.out.println( n2.getData());
    System.out.println( n3.getData());

    System.out.println("Should be 50, 123, 3 \n");

    System.out.println( n1.setData(23));

    System.out.println("Should be 50 \n");

    System.out.println( n1.getData());

    System.out.println("Should be 23 \n");

    MyLinkedList L1 = new MyLinkedList();

    System.out.println(L1);

    System.out.println("Should be [] \n");

    L1.add(4);

    System.out.println(L1.get(0));

    System.out.println("Should be 4 \n");

    System.out.println(L1);

    System.out.println("Should be [4] \n");

    L1.add(2);

    System.out.println(L1.get(1));

    System.out.println("Should be 2 \n");

    System.out.println(L1);

    System.out.println("Should be [4, 2] \n");

    System.out.println(L1.set(1,1));

    System.out.println("Should be 2 \n");

    System.out.println(L1);

    System.out.println("Should be [4, 1] \n");

    System.out.println(L1.contains(1));

    System.out.println("Should be true \n");

    System.out.println(L1.contains(23));

    System.out.println("Should be false \n");

    System.out.println(L1.indexOf(1));

    System.out.println("Should be 1 \n");

    System.out.println(L1.indexOf(23));

    System.out.println("Should be -1 \n");

    L1.add(1,5);

    System.out.println(L1);

    System.out.println("Should be [4, 5, 1] \n" );

    System.out.println(L1.remove(1));

    System.out.println("Should be 5 \n");

    System.out.println(L1);

    System.out.println("Should be [4, 1] \n" );

    L1.add(1,123);

    System.out.println(L1);

    System.out.println("Should be [4, 123, 1] \n" );


  }
}
