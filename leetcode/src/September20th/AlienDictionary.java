/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September20th;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author nandini
 */
public class AlienDictionary {
    static String find_order(String[] words) {
        HashMap<Character, Integer> charToId = new HashMap<Character, Integer>(); 
        HashMap<Integer, Character> idToChar = new HashMap<Integer, Character>(); 
	assignIds(words, charToId, idToChar); 

	int numNodes = idToChar.keySet().size(); 
        int[][] graph = new int[numNodes][numNodes]; 
	constructGraph(words, charToId, graph);
        return getCharOrder(graph, idToChar);
    }
    public static void assignIds(String[]words, HashMap<Character, Integer> charToId, 
                                    HashMap<Integer,Character> idToChar){
        int id = 0;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(!charToId.keySet().contains(word.charAt(i))){
                    charToId.put(word.charAt(i), id);
                    idToChar.put(id, word.charAt(i));
                    id++;
                }
            }
        }
    }
    public static void constructGraph(String[]words, HashMap<Character, Integer> charToId,
            int [][]graph){
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                addEdge(words[i], words[j], charToId, graph);
            }
        }
    }
    public static void addEdge(String first, String second,
                                HashMap<Character,Integer> charToId, 
                                int[][]graph){
        int len = Math.min(first.length(), second.length());
        for(int i = 0; i < len; i++){
            if(first.charAt(i) != second.charAt(i)){
                int headId = charToId.get(first.charAt(i));
                int tailId = charToId.get(second.charAt(i));
                graph[headId][tailId] = 1;
                break;
            }
        }
    }
    
    protected static String getCharOrder(int[][] graph, HashMap<Integer, Character> idToChar){
		
		Stack<Integer> vertexes = new Stack<Integer>();
		topologicalSort(graph, vertexes); 
		
		StringBuilder builder = new StringBuilder();
		while(!vertexes.isEmpty()){
			builder.append( idToChar.get(vertexes.pop())); 
		}
		return builder.toString(); 
	}
    protected static void topologicalSort(int[][]graph,Stack<Integer> stack){
        int numOfVertexes = graph.length;
        boolean [] visited = new boolean[numOfVertexes];
        for(int i = 0; i < numOfVertexes; i++){
            visited[i] = false;
        }
        for(int i = 0; i < numOfVertexes; i++){
            if(!visited[i]){
                topologicalSort(graph, i, visited, stack);
            }
        }
    }
    protected static void topologicalSort(int[][] graph, int currVertex, boolean[] visited, 
			Stack<Integer> vertexes){
        visited[currVertex] = true;
        for(int i = 0; i < graph.length; i++){
            if(graph[currVertex][i] != 0 && !visited[i]){
                topologicalSort(graph, i, visited, vertexes);
            }
        }
        
        vertexes.push(currVertex);
    }

}
