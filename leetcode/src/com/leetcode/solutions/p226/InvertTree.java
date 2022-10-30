package p226;

import classes.TreeNode;

/**
 * @author mengyuantan
 * @date 2022/10/30 23:45
 */
public class InvertTree {

    static class Solution {
        public static TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }

            final TreeNode left = root.left;

            root.left = root.right;
            root.right = left;

            if (root.left != null) {
                invertTree(root.left);
            }

            if (root.right != null) {
                invertTree(root.right);
            }

            return root;
        }
    }

    public static void main(String[] args) {

    }
}
