/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStart.HW1;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 *
 * @author nandini
 */

//MERGE K ARRAYS
//this is going to be able to compare itself other  queue nodes
public class QueueNode implements Comparable<QueueNode> {
    int array, index, value;
    public QueueNode(int array, int index, int value) {
        this.array = array;
        this.index = index;
        this.value = value;
    }
    //compare nodes
    public int compareTo(QueueNode n) {
        if(value > n.value) {
            return 1;
        }
        if(value < n.value) {
            return -1;
        }
        return 0;
    }
    public static int[] merge(int [][] arrays) {
        PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();
        int size = 0;
        for(int i = 0; i < arrays.length; i++) { //getting the size of all arrays and 
            //add it to previous size of an array, adding to a priority is log n *k, always length k
            //removing and add it to priority queue is log k so total is kn log(k)
            size += arrays[i].length;
            System.out.println("size is:" + size);
            if(arrays[i].length > 0) { //getting all the arrays and add it to priority queue
                System.out.println("arrays value: " + Arrays.toString(arrays[i]));
                pq.add(new QueueNode(i, 0, arrays[i][0]));

            }
        }
        int [] result = new int[size]; //keep adding element until priority queue ended
        for(int i = 0; !pq.isEmpty(); i++) {
            QueueNode n = pq.poll(); //return the head value and remove the value from the list
            result[i] = n.value;
            System.out.println("result is : " + result[i] );
            int newIndex = n.index + 1;
            System.out.println("new index is :"  + newIndex);
            if(newIndex < arrays[n.array].length) {
                System.out.println("new index after iteration is :"  + newIndex);
                pq.add(new QueueNode(n.array, newIndex, 
                        arrays[n.array][newIndex]));
                System.out.println("n array is : " + n.array + " "+ newIndex + " "+ arrays[n.array][newIndex]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] arr3 = { 0, 9 };
 
		int[] result = merge(new int[][] { arr1, arr2, arr3 });
                System.out.println(Arrays.toString(result));
    }
}
