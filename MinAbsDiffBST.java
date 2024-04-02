class Solution {
    int prev = -1;
    int minAns = Integer.MAX_VALUE;
    
    public int absolute_diff(Node root) {
        // Call helper method to traverse the tree and calculate the minimum absolute difference
        helper(root);
        return minAns;
    }
    
    void helper(Node root) {
        if (root == null) {
            return;
        }
        
        // Traverse left subtree
        helper(root.left);
        
        // Update minAns if needed
        if (prev != -1) {
            minAns = Math.min(minAns, Math.abs(root.data - prev));
        }
        prev = root.data;
        
        // Traverse right subtree
        helper(root.right);
    }
}
