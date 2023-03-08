package Homework6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode;
        treeNode = new TreeNode(1,null, new TreeNode(2,null,new TreeNode(3)));
        System.out.println(preorderTraversal(treeNode));

    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }
}
