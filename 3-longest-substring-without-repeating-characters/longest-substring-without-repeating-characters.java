class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
		int l = 0, r = 0;
		int max=0;
		while (r < s.length()) {
			hs.merge(s.charAt(r), 1, Integer::sum);
			if(r-l+1== hs.size())
			{
				max=Math.max(max, r-l+1);
				r++;
			}
			else if(r-l+1 < hs.size())
			{
				r++;
			}
			else {
				while(r-l+1>hs.size())
				{
					if(hs.get(s.charAt(l))>0)
					{
						hs.put(s.charAt(l), hs.getOrDefault(s.charAt(l), 0)-1);
					}
					if(hs.get(s.charAt(l))==0)
					{
						//System.out.println(hs);
						hs.remove(s.charAt(l));
						//System.out.println(hs);
					}
					l++;
				}
				if(r-l+1== hs.size())
				{
					max=Math.max(max, r-l+1);
					r++;
				}
			}
			
		}
		return max;
    }
}