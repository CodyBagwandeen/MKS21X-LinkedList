public class Node{
 private int data;
 private Node next,prev;

 public int data() {
   return data;
 }

 public Node next() {
   return next;
 }

 public Node setNext( Node val) {
   next = val;
 }

 public Node prev() {
   return prev;
 }

 public Node set( Node val) {
   prev = val;
 }

 public Node( int value, Node Next, Node previous) {
   data = value;
   next = Next;
   prev = previous;
 }
}
