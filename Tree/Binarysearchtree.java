package Tree;

public class Binarysearchtree {
    // Node class represents each individual node of the tree
    static class Node {
        int data;
        Node left, right;

        // Constructor to create a new node
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Root of the tree
    Node root;

    // Constructor
    public Binarysearchtree() {
        root = null;
    }

    // Insert a new node in the BST
    void insert(int data) {
        root = insertRec(root, data);
    }

    // A recursive function to insert a new node
    Node insertRec(Node root, int data) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        // return the (unchanged) node pointer
        return root;
    }

    // Search for a value in the BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    // A recursive function to search for a key in the BST
    boolean searchRec(Node root, int key) {
        // Base Cases: root is null or key is present at the root
        if (root == null || root.data == key)
            return root != null;

        // Key is greater than root's data
        if (key > root.data)
            return searchRec(root.right, key);

        // Key is smaller than root's data
        return searchRec(root.left, key);
    }

    // Inorder traversal of the tree (Left, Root, Right)
    void inorder() {
        inorderRec(root);
    }

    // A recursive function to do inorder traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    void preorder() {
        preorderRec(root);
    }

    // A recursive function to do inorder traversal
    void preorderRec(Node root) {
        if (root != null) {
        
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void postorder() {
        postorderRec(root);
    }

    // A recursive function to do inorder traversal
    void postorderRec(Node root) {
        if (root != null) {
        
            
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
 

    public static void main(String[] args) {
        Binarysearchtree tree = new Binarysearchtree();

        // Insert values into the BST
        tree.insert(90);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print inorder traversal ( print the numbers in sorted order)
       System.out.println("Inorder traversal:");
       tree.inorder();
       // System.out.println("preorder traversal:");
       // tree.preorder();
       // System.out.println("postorder traversal:");
        //tree.postorder();
        
        // Search for a value in the tree
        System.out.println("\nSearch for 40: " + tree.search(40));  //  return true
        System.out.println("Search for 100: " + tree.search(100));  // Should return false
    
    }
}

