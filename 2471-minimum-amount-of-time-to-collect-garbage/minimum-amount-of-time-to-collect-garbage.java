class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
      int cnt = 0;
        // Process 'G'
        int gind = 0;
    
        for (int i = 0; i < garbage.length; i++) {
           
                if (garbage[i].contains("G")) {
                    int occr = fun(garbage[i], 'G');
                    cnt += occr;
                    gind = i;
                }
        }
        if(gind>0)
        {
            int travelg = funn(travel,gind);
            cnt+=travelg;
        }
       
        // Process 'P'
        int pind = 0;
        for (int i = 0; i < garbage.length; i++) {
            
                if (garbage[i].contains("P")) {
                    int occr = fun(garbage[i], 'P');
                    cnt += occr;
                    pind = i;
                }
        }
        if(pind>0)
        {
            int travelg = funn(travel,pind);
            cnt+=travelg;
        }

        // Process 'M'
        int mind = 0;
        for (int i = 0; i < garbage.length; i++) {
            
                if (garbage[i].contains("M")) {
                    int occr = fun(garbage[i], 'M');
                    cnt += occr;
                    mind = i;
                }
        }
        if(mind>0)
        {
            int travelg = funn(travel,mind);
            cnt+=travelg;
        }

        return cnt;
    }

    public int fun(String s, char c) {
        int tempcnt = 0;
        char[] charArray = s.toCharArray();

        for (char ch : charArray) {
            if (ch == c) {
                tempcnt++;
            }
        }

        return tempcnt;
    }
    public int funn(int [] arr,int ind)
    {
        int tcnt = 0;
        for(int i = 0;i<ind;i++)
        {
            tcnt+=arr[i];

        }
        return tcnt;
    }
}