package algorithms.list;

public class Node<T>{	  
	Node<T> next;
	T value;
	 
    Node(T value){
	  this.value = value;
	}
}
 
class Llist<T>{

  Node<T> head;

  Llist(){
    this.head= null;
  }
  
  void print(){
	  
   Node<T> n=head;
   
   while(n!=null){
    System.out.println(n.value);
    n=n.next;

   }
  }

  Node<T> iterate(){
   Node<T> n =this.head;
   while(n.next!=null){  
	   n=n.next;
   }
   return  n;
  }
  void add(T n){

    if(this.head==null){
     Node<T> node = new Node<T>(n);
     head =node;
     return;
    }
    Node<T> last = iterate();
    Node<T> node = new Node<>(n);
    last.next = node;
  }
}
