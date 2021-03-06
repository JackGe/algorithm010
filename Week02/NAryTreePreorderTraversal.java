
// Definition for a Node.
/*class Node {
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


class NAryTreePreorderTraversal {
    List<Integer> res = new ArrayList<>();

    public List<Integer> preorder(Node root) {

      if(root != null){
        res.add(root.val);
      }else{
          return res;
      }
       List<Node> children = root.children;

        if(children.size() > 0){
            for (Node n: children){
                preorder(n);
            }
        }
        return res;
    }
}
