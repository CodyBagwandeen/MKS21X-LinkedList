public class MyLinkedList{
 private int size;
 private Node start,end;

 public int size() {
   return size;
 }
 public boolean add(int value) {
   Node n = new Node( value, null, end);
   end.setNext(n);
   size++;
   end = n;
   return true;
 }

 public String toString() {
  String output = "";
  Node n = start;
  while(n.next() != null) {
    output += n.data();
    n = n.next();
  }
  return output;
 }
}
