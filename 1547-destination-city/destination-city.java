class Solution {
    public String destCity(List<List<String>> paths) {
       HashMap<String,String> hm=new HashMap<>();
       for(int i=0;i<paths.size();i++){
           hm.put(paths.get(i).get(0),paths.get(i).get(1));
       }
       boolean flag=false;
        String key="";
       for(int i=0;i<paths.size();i++)
       {
           key=paths.get(i).get(0);
           while(hm.containsKey(key))
           {
               flag=true;
               key=hm.get(key);

           }
           if(flag != false)
           {
               break;
           }
       }
       return key;
    }
}