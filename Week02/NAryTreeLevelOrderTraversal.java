/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class NAryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        withDepth(root,0, res);
        return res;
    }

    public void withDepth(Node root, int depth, List<List<Integer>> res){
        if(depth+ 1 >res.size()){
            List<Integer> levelList = new ArrayList<>();
            res.add(levelList);
        }

        res.get(depth).add(root.val);
        for(Node node: root.children){
            withDepth(node, depth + 1, res);
        }


    }
}
