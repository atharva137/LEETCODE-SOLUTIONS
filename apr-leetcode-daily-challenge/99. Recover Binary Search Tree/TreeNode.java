
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
    private TreeNode prev;
    private TreeNode first;
    private TreeNode middle;
    private TreeNode last;
    public void recoverTree(TreeNode root) {
        
       prev = first = middle = last =  null;
        
        inorder(root);
        
        if(first!=null && last!=null){ 
            int t = first.val;
            first.val = last.val;
            last.val = t;
        }else {
            int t = first.val;
            first.val = middle.val;      
            middle.val = t;
            
        }
        
        
    }
    
    public void inorder(TreeNode root){
        
        if(root==null) return ;
        
        inorder(root.left);
        
        
        if(prev!=null && root.val < prev.val){
            if(first==null){
                first = prev;
                middle = root;
            }else{
                last = root;
            }
        }
        
        
        
        prev = root;
        
        inorder(root.right);
        
    }
}