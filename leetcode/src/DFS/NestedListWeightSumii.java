/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class NestedListWeightSumii {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        int weighted = 0;
        int unweighted = 0;
        while(!nestedList.isEmpty()){
            List<NestedInteger> nextLevel = new ArrayList<>();
            for(NestedInteger ni : nestedList){
                if(ni.isInteger()){
                    unweighted += ni.getInteger();
                } else {
                    nextLevel.addAll(ni.getList());
                }
            }
            weighted += unweighted;
            nestedList = nextLevel;
        }
        return weighted;
    }
    public static void main(String[]args){
        List<NestedInteger> nestedList = new ArrayList<NestedInteger>();
    }
}
