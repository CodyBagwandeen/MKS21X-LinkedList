public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
      start = null;
      end = null;
      size = 0;
  }

  public int size() {
    return size;
  }
  public boolean add(int value) {
    if( size == 0) {
      Node n = new Node(value,null,null);
      start = n;
      end = n;
    }
    if( size >= 1) {
      Node n = new Node(value, null, end);
      n.prev().setNext(n);
      end = n;
    }
    size++;
    return true;
  }

  public String toString() {
   if( size == 0)
    return "[]";
    String output = "[";
    Node n = start;
    while(n != end) {
      output += n.getData() +", ";
      n = n.next();
    }
    return output + n.getData() + "]";
  }

  public Integer get(int index) {
   Node current = start;
   for( int i = 0; i < index; i++) {
     current = current.next();
    }
    return current.getData();
  }

  public Integer set(int index, Integer value) {
    if( index < 0 || index > size)
    throw new IndexOutOfBoundsException("Index must be within list");
    Node current = start;
    for( int i = 0; i < index; i++) {
      current = current.next();
    }
    Integer temp = current.getData();
    current.setData(value);
    return temp;
  }

  public boolean contains( Integer value){
    Node current = start;
    while( current != null) {
      if ( current.getData() == value)
      return true;
      current = current.next();
    }
    return false;
    }

  public int indexOf(Integer value){
    if(contains(value)) {
      Node current = start;
      int index = 0;
      while( current.getData() != value) {
        index++;
        current = current.next();
      }
      return index;
    }
    return -1;
  }

  public void add(int index, Integer value){
    if( index < 0 || index > size)
    throw new IndexOutOfBoundsException("Index must be within list");
    Node n = new Node(value,null,null);
    Node current = start;
    for( int i = 0; i < index; i++) {
      current = current.next();
    }
    current.prev().setNext(n);
    current.setPrev(n);
    n.setPrev(current.prev());
    n.setNext(current);
    size++;
  }
}
