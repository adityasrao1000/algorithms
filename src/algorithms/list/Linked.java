package algorithms.list;


public class Linked {
	
 public static void main(String[] args) {  
   
   System.out.println("Integer linked list");
   Llist<Integer> l1 =new Llist<>();
   l1.add(1);
   l1.add(2);
   l1.add(3);
   l1.add(4);
   l1.add(5);
   l1.print();
   
   System.out.println("Float linked list");
   Llist<Float> l =new Llist<>();
   l.add(1.2f);
   l.add(2.2f);
   l.add(3.2f);
   l.add(4.2f);
   l.add(5.2f);
   l.print();
   
   System.out.println("Character linked list");
   Llist<Character> l2 =new Llist<>();
   l2.add('a');
   l2.add('b');
   l2.add('c');
   l2.add('d');
   l2.add('e');
   l2.print();
   
   System.out.println("String linked list");
   Llist<String> l3 =new Llist<>();
   l3.add("abc");
   l3.add("bcd");
   l3.add("cde");
   l3.add("def");
   l3.add("efg");
   l3.print();
 }  

} 
