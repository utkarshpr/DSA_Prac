class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> hm=new HashMap<>();
        List<String> ans=new ArrayList<>();
        int i=0,j=0;
        String st="";
        while(j<s.length())
        {
        	st+=s.charAt(j);
        	if(j-i+1 ==  10)
        	{
        		hm.put(st, hm.getOrDefault(st, 0)+1);
        		j++;
        	}
        	else if(j-i+1 <10)
        	{
        		j++;
        	}
        	else {
        		st=st.substring(1);
        		i++;
        		if(j-i+1 ==  10)
            	{
            		hm.put(st, hm.getOrDefault(st, 0)+1);
            		
            	}
        		j++;
        	}
        }
        for( String  x: hm.keySet())
        {
        	if(hm.get(x) > 1)
        	{
        		ans.add(x);
        	}
        }
        return ans;

    }
}