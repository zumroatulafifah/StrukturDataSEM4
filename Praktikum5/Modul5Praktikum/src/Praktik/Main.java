package Praktik;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            BinaryTree<Object> binaryTree = new BinaryTree<>();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan data : ");
            //buat spasi
            String input = scanner.nextLine();

            String[] data = input.split(" ");
            for (String item : data) {
                binaryTree.insert(item);
            }

            binaryTree.preorder();
            binaryTree.inorder();
            binaryTree.postorder();
        }
    }

