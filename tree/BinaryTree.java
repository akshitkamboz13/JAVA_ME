package tree;

import java.util.ArrayList;
import java.util.List;



public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BinaryTreeB {
        static int index = -1;

        public Node buildTree(int[] node) {
            index++;
            if (node[index] == -1) {
                return null;
            }
            Node newNode = new Node(node[index]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }

        public void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public void bfsTraversal(Node root) {
            List<Node> currentLevel = new ArrayList<>();
            currentLevel.add(root);
            int count = 0;
            int nodeCount = 1;

            while (!currentLevel.isEmpty()) {
                // Print current level
                for (Node node : currentLevel) {
                    System.out.print(node.data + " ");
                }
                System.out.println();

                // Get next level
                List<Node> nextLevel = new ArrayList<>();
                for (Node node : currentLevel) {
                    if (node.left != null) {
                        nodeCount++;
                        nextLevel.add(node.left);
                    }
                    if (node.right != null) {
                        nodeCount++;
                        nextLevel.add(node.right);
                    }
                }
                count++;
                currentLevel = nextLevel;
            }
            System.out.println("Number of nodes using in bsf : " + nodeCount);
            System.out.println("Height of the tree using in bsf : " + count);
        }

        public int heigth(Node root) {
            if (root == null) {
                return 0;
            }
            int left = 0;
            int right = 0;
            left = heigth(root.left);
            right = heigth(root.right);
            return Math.max(left, right) + 1;
        }

        public int nodeCount(Node root){
            if(root == null){
                return 0;
            }
            int left = nodeCount(root.left);
            int right = nodeCount(root.right);
            return (left + right + 1);
        }

        public int nodeSum(Node root){
            if(root == null){
                return 0;
            }
            int left = nodeSum(root.left);
            int right = nodeSum(root.right);
            return (left + right + root.data);
        }
        //diameter
        public int diameter(Node root){
            if(root == null){
                return 0;
            }
            int left = diameter(root.left);
            int right = diameter(root.right);
            int lh = heigth(root.left);
            int rh = heigth(root.right);
            return Math.max(lh+rh+1, Math.max(left, right));
        }
    }

    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreeB tree = new BinaryTreeB();
        Node root = tree.buildTree(node);
        System.out.println("Root Node : " + root.data);

        System.out.println("Preorder : ");
        tree.preorder(root);

        System.out.println("\nInorder : ");
        tree.inorder(root);

        System.out.println("\nPostorder : ");
        tree.postorder(root);

        System.out.println("\nBFS Traversal : ");
        tree.bfsTraversal(root);

        int hei = tree.heigth(root);
        System.out.println("Height of the tree : " + hei);

        int nodeCount = tree.nodeCount(root);
        System.out.println("Number of nodes : " + nodeCount);

        int nodeSum = tree.nodeSum(root);
        System.out.println("Sum of nodes : " + nodeSum);

        int diameter = tree.diameter(root);
        System.out.println("Diameter of the tree : " + diameter);
    }
}
