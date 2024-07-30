class Solution {
    public void flatten(TreeNode root) {
         Stack<TreeNode>stack = new Stack<>();
              if (root==null)
              {
                return ;
              }

              stack.push(root);
              while(!stack.isEmpty())
              {
                 TreeNode current = stack.pop();
                 if(current.right!=null)
                 {
                    stack.push(current.right);
                 }

                 if(current.left!=null)
                 {
                    stack.push(current.left);
                 }

                 if(!stack.isEmpty())
                 {
                    current.right=stack.peek();
                 }
                 current.left=null;

              }
            


    }
}
