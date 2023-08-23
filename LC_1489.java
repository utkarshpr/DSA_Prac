package com.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class LC_1489 {
	public static void main(String[] args) {
		int n = 8, m = 2, group[] = { -1, -1, 1, 0, 0, 1, 0, -1 },
				dataSet[][] = { {}, { 6 }, { 5 }, { 6 }, { 3, 6 }, {}, {}, {} };
		List<List<Integer>> beforeItems = Arrays.stream(dataSet)
				.map(internalArray -> Arrays.stream(internalArray).boxed().collect(Collectors.toList()))
				.collect(Collectors.toList());
		System.out.println(sortItems(n, m, group, beforeItems));
	}

	public static int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
		int res[]=new int[n];
		int group_id=m;
		for(int i=0;i<n;i++)
		{
			if(group[i]==-1)
			{
				group[i]=group_id;
				group_id++;
			}
		}
		
		Map<Integer, List<Integer>> itemGraph = new HashMap<>();
		Map<Integer, List<Integer>> groupGraph = new HashMap<>();
		int[] itemIndegree = new int[n];
		int[] groupIndegree = new int[group_id];
		for(int i=0;i<n;i++)
		{
			itemGraph.put(i, new ArrayList<>());
		}
		for(int i=0;i<group_id;i++)
		{
			groupGraph.put(i, new ArrayList<>());
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j :beforeItems.get(i))
			{
				itemGraph.get(j).add(i);
				itemIndegree[i]++;
				
				
				if(group[i] != group[j])
				{
					groupGraph.get(group[j]).add(group[i]);
					groupIndegree[group[i]]++;
				}
					
			}
		}
		List<Integer> itemOrder = topologicalSort(itemGraph, itemIndegree);
        List<Integer> groupOrder = topologicalSort(groupGraph, groupIndegree);
			
        if (itemOrder.isEmpty() || groupOrder.isEmpty()) {
            return new int[0];
        }
        
        Map<Integer, List<Integer>> orderedGroups = new HashMap<>();
        for (Integer item : itemOrder) {
            orderedGroups.computeIfAbsent(group[item], k -> new ArrayList<>()).add(item);
        }
       // System.out.println(itemOrder +"  "+ orderedGroups);
        
        // Concatenate sorted items in all sorted groups.
        // [group 1, group 2, ... ] -> [(item 1, item 2, ...), (item 1, item 2, ...), ...]
        List<Integer> answerList = new ArrayList<>();
        for (int groupIndex : groupOrder) {
            answerList.addAll(orderedGroups.getOrDefault(groupIndex, new ArrayList<>()));
        }
			
 		
		return answerList.stream().mapToInt(i->i).toArray();
	}

	private static List<Integer> topologicalSort(Map<Integer, List<Integer>> graph, int[] indegree) {
		List<Integer> visited = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (Integer key : graph.keySet()) {
            if (indegree[key] == 0) {
                stack.add(key);
            }
        }
        
        while (!stack.isEmpty()) {
            Integer curr = stack.pop();
            visited.add(curr);
            
            for (Integer prev : graph.get(curr)) {
                indegree[prev]--;
                if (indegree[prev] == 0) {
                    stack.add(prev);
                }
            }
        }

        return visited.size() == graph.size() ? visited : new ArrayList<>();
    }
		
	
}
