class Solution {
public:
    bool isValid(string s) {
        stack<char> p;
        for (char c : s) {
            if (c == '(' || c == '[' || c == '{') {
                p.push(c);
            } else {
                if (p.empty()) return false;          // fix 1: nothing to match
                char top = p.top();
                if ((top == '(' && c == ')') ||
                    (top == '[' && c == ']') ||
                    (top == '{' && c == '}')) {
                    p.pop();
                } else {
                    return false;                       // fix 2: mismatch -> invalid
                }
            }
        }
        return p.empty();
    }
};