public class MyLinkedList{
 private int size;
 private Node start,end;

 public int size() {
   return size;
 }
 public boolean add(int value) {
   if( size == 0) {
     Node n = new Node(value,null,null);
     start = n;
     end =n;
   }
   if( size >= 1) {
     Node n = new Node(value, null, end);
     n.prev().setNext(n);
     end =n;
   }
   return true;
 }

 public String toString() {
  String output = "[";
  Node n = start;
  while(n != end) {
    output += n.getData() +", ";
    n = n.next();
  }
  return output + n.getData() + "]";
 }

 private Integer get(int index) {
   Node current = start;
   for( int i = 0; i < index; i++) {
     current = current.next();
   }
   return current.getData();
}

 public MyLinkedList(){
   start = null;
   end = null;
   size = 0;
}
}
