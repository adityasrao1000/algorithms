package algorithms.ds.tree;

 
public class BSTkeyRange {
     
    static Node root;
     
    /* The functions prints all the keys which in the given range [k1..k2].
     The function assumes that k1 < k2 */
    void Print(Node node, int k1, int k2) {
         
       if(node==null) {
    	   return;
       }
       
       if(node.key> k1) {
    	   Print(node.left,k1,k2);
       }
       
       if(node.key>=k1 && node.key<=k2) {
    	   System.out.print(node.key+" ");
       }
       
       if(node.key< k2) {
    	   Print(node.right,k1,k2);
       }
    }
     
 
    @SuppressWarnings("static-access")
	public static void main(String[] args) {
    	BSTkeyRange tree = new BSTkeyRange();
        int k1 = 10, k2 = 25;
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
 
        tree.Print(root, k1, k2);
    }
}
