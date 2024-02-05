class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character,Integer> hm=new HashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            hm.merge(ch[i],1,Integer::sum);
        }
        for(int i=0;i<ch.length;i++)
        {
            if(hm.get(ch[i])==1)
                return i;
        }
        return -1;
    }
}