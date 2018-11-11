/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStart.HW1;

/**


Make a Min heap from the first element of each k sorted array.
* On heapifying pop the head element and put it in the first position of the resultant array of size (k×n). 
Take the next element from the array (among the k sorted array) where the head of the heap came from. 
* Insert it into the Min heap. Heapify it and pop the head to the next position of the resultant array.
Repeat until all the elements of the k arrays are consumed and kept in the proper position in the resultant array.
 time to heapify = O(log k)
 * O(n log k)
 */
public class AnotherWayUsingMinHeap {
    int arr, index, value;
    public AnotherWayUsingMinHeap(int arr, int index, int value) {
        this.arr = arr;
        this.index = index;
        this.value = value;
    }
    static swap()
    
}
