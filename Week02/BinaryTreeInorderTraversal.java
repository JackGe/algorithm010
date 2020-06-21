/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        List<Integer> leftResList = inorderTraversal(root.left);
        List<Integer> rightResList = inorderTraversal(root.right);
        res.addAll(leftResList);
        res.add(root.val);
        res.addAll(rightResList);
        return res;
    }
}
