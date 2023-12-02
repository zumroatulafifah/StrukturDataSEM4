package Praktikum5;

public class binaryTree {
    public node root;
    public void NewNode(int data){
        root = NewNode(root, new node(data));
    }

    private node NewNode (node root, node newData){
        if (root == null){
            root = newData;
            return root;
        }
        if(newData.data < root.data){
            root.left = NewNode(root.left, newData);
        }else{
            root.right = NewNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(node node){
        if(node != null){
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data + " ");
        }
    }
}
