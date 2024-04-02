class Solution
{
    public:
    int prev = -1;
    int ans = INT_MAX;
    
    int absolute_diff(Node* root) {
        // Your code here
        solve(root);
        return ans;
    }
    
    void solve(Node* root) {
        if (root == nullptr) {
            return;
        }
        solve(root->left);
        if (prev == -1) {
            prev = root->data;
        }
        else {
            ans = std::min(ans, root->data - prev);
            prev = root->data;
        }
        solve(root->right);
    }

};
