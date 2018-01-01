package algorithms.list;

public class LinkedListOperations {
	
 public static void main(String[] args) {  
   
   System.out.println("Integer linked list");
   Llist<Integer> l1 =new Llist<>();
   l1.add(1);
   l1.add(2);
   l1.add(3);
   l1.add(4);
   l1.add(5);
   l1.print();
   
   System.out.println("After performing deletion of node");
   l1.delete("1");
   l1.print();
   
   System.out.println("\nString linked list");
   Llist<String> l2 =new Llist<>();
   l2.add("asd");
   l2.add("b");
   l2.add("nh");
   l2.add("jh");
   l2.add("cvf");
   l2.print();
   System.out.println("After performing deletion of node");
   l2.delete("nh");
   l2.print();
 }  

} 