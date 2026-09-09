class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> s = new Stack<>();

        int i = 0;
        int j = 0;

        while(i < pushed.length) {

            if(!s.isEmpty() && s.peek() == popped[j]) {
                s.pop();
                j++;
            }
            else {
                s.push(pushed[i]);
                i++;
            }
        }

        while(!s.isEmpty() && j < popped.length) {
            if(s.peek() == popped[j]) {
                s.pop();
                j++;
            }
            else {
                return false;
            }
        }

        return true;
    }
}