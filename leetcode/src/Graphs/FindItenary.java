/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 *
 * @author nandini
 * O(N), O(N)


 */
public class FindItenary {
    public static List<String> findItinerary(String[][] tickets) {
        HashMap<String, PriorityQueue<String>> map = new HashMap<>();
        for(String[] ticket: tickets){
            if(!map.containsKey(ticket[0])){
                PriorityQueue<String> queue = new PriorityQueue<String>();
                map.put(ticket[0], queue);
            }
            map.get(ticket[0]).add(ticket[1]);
        }
        List<String> route = new LinkedList<>();
        Stack<String> airport = new Stack<>();
        airport.push("JFK");
        
        while(!airport.isEmpty()){
            while(map.containsKey(airport.peek())
                    && !map.get(airport.peek()).isEmpty()){
                airport.push(map.get(airport.peek()).poll());
            }
            route.add(0, airport.pop());
        }
            return route;
    }
    
    public static void main(String[]args){
        String[][] graph = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
        System.out.println(findItinerary(graph));
    }
}
