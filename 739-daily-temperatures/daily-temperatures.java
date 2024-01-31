class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int an[]=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                int prevIndex = st.pop();
                an[prevIndex] = i - prevIndex;
            }
            st.push(i);
        }


        return an; 
    }
}