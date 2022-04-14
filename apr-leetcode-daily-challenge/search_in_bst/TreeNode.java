
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root == null){
            return null;
        }
        if(root.val==val){      
            return root;
        }
        
        TreeNode left = searchBST(root.left,val);
        if(left!=null&&left.val==val){
            return left;
        }
        TreeNode right = searchBST(root.right,val);
        if(right!=null&&right.val == val) return right;
        
        return null;
    }
    
}