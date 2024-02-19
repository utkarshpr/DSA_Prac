class Solution {
    public int findCircleNum(int[][] isConnected) {
         ArrayList<ArrayList<Integer> > adj = new ArrayList<>();
       for(int i=0;i<isConnected.length;i++)
		{
			adj.add(new ArrayList<>());
		}
       for(int i=0;i<isConnected.length;i++)
       {
           for(int j=0;j<isConnected.length;j++)
           {
               if(isConnected[i][j]==1 && i!=j){
                   adj.get(i).add(j);
                   adj.get(j).add(i);
               }
           }
       }   
        System.out.println(adj);
              
       
        return(numProvinces(adj,adj.size()));
    }

    private static int numProvinces(ArrayList<ArrayList<Integer>> adjLs, int n) {
       
        int visited[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i] ==0)
                {
                    dfs(i,adjLs,visited);
                    c++;
                }
        }
        return c;
    }

    private static void dfs(int i, ArrayList<ArrayList<Integer>> adj,int visited[]) {
        visited[i]=1;

        for(Integer x:adj.get(i)){
            if(visited[x]==0)
                { dfs(x, adj, visited);}
        }
    }
}
