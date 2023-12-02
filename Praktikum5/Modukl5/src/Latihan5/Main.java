package Latihan5;

public class Main {
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.println("\nIn Order : "); //L R Ri
        pohon.inOrder(pohon.root);
        System.out.println("\nPre Order : "); //R L Ri
        pohon.preOrder(pohon.root);
        System.out.println("\nPost Order : "); //L Ri R
        pohon.postOrder(pohon.root);
    }
}
