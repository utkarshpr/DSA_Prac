class Solution {
    public String decodeString(String s) {
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<s.length();i++)
            q.add(s.charAt(i));
         return helper(q);   
    }
    private static String repeat(String s, int n) {
		StringBuilder sb = new StringBuilder();
	    while (n-- > 0) sb.append(s);
	    return sb.toString();
	}
    public String helper(Queue<Character> q){
         StringBuilder sb=new StringBuilder();
         int n=0;
         while(!q.isEmpty())
         {
             char ch=q.poll();
             if(Character.isDigit(ch))
             {
                 n=n*10+ch-'0';
             }
             else if(ch=='[')
             {
                 String ss=helper(q);
                 sb.append(repeat(ss,n));
                 n=0;
             }
             else if(ch==']')
                break;
             else
                sb.append(ch);   

         }
         return sb.toString();
    }
}