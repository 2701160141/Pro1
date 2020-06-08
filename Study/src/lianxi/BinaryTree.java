package lianxi;

import java.util.LinkedList;

class TreeNode {
    public int data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        TreeNode binaryTree = createBinaryTree(list);
        preOrderTravelTree(binaryTree);
        System.out.println();
        inOrderTravelTree(binaryTree);
        System.out.println();
        postOrderTravelTree(binaryTree);
    }

    public static TreeNode createBinaryTree(LinkedList<Integer> list) {
        TreeNode node = null;
        if (list == null || list.isEmpty()) return null;
        Integer data = list.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(list);
            node.rightChild = createBinaryTree(list);
        }
        return node;
    }

    public static void preOrderTravelTree(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderTravelTree(node.leftChild);
        preOrderTravelTree(node.rightChild);
    }

    public static void inOrderTravelTree(TreeNode node) {
        if (node == null) return;
        inOrderTravelTree(node.leftChild);
        System.out.print(node.data + " ");
        inOrderTravelTree(node.rightChild);
    }

    public static void postOrderTravelTree(TreeNode node) {
        if (node == null) return;
        postOrderTravelTree(node.leftChild);
        postOrderTravelTree(node.rightChild);
        System.out.print(node.data + " ");
    }
}
