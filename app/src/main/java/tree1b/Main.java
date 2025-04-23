package tree1b;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert values
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Print inorder traversal
        System.out.println("Inorder traversal:");
        bst.inorder();

        // Search for values
        System.out.println("Is 20 in the tree? " + bst.search(20));
        System.out.println("Is 100 in the tree? " + bst.search(100));

        // Delete a value and print again
        System.out.println("\nAfter deleting 20:");
        bst.delete(20);
        bst.inorder();

        System.out.println("After deleting 30:");
        bst.delete(30);
        bst.inorder();

        System.out.println("After deleting 50 (root):");
        bst.delete(50);
        bst.inorder();
    }
}