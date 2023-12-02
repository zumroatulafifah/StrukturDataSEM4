package Praktikum5;

import Latihan5.BinaryTree;

public class main {
    public static void main(String[] args) {
        binaryTree pohon = new binaryTree();

        pohon.NewNode('A'); //90
        pohon.NewNode('B'); //85
        pohon.NewNode('C'); //82
        pohon.NewNode('D'); //77
        pohon.NewNode('E');//79
        pohon.NewNode('F');
//        pohon.NewNode('A');
//        pohon.NewNode('T');
//        pohon.NewNode('U');
//        pohon.NewNode('L');

        System.out.println("\nIn Order : "); //L R Ri
        pohon.inOrder(pohon.root);
        System.out.println("\nPre Order : "); //R L Ri
        pohon.preOrder(pohon.root);
        System.out.println("\nPost Order : "); //L Ri R
        pohon.postOrder(pohon.root);
    }
}
