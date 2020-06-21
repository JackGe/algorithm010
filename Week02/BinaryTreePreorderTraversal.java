/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
 List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        List<Integer> leftResList = preorderTraversal(root.left);
        List<Integer> rightResList = preorderTraversal(root.right);
        res.add(root.val);
        res.addAll(leftResList);
        res.addAll(rightResList);
        return res;
    }
}
