/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author nandini
 */
public class SearchInASortedArrayUnknownSize {
    /*
        public int search(ArrayReader reader, int target) {
            int high = 1;
            int low = 0;
            while(reader.get(high) < target) {
                high = high * 2;
                low = high / 2;
            }
            while(low <= high) {
                int mid = low + (high - low) /2;
                int v = reader.get(mid);
                if(v == target) {
                    return mid;
                } 
                if(v < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;

        }*/
     static int findPos(int arr[],int key)    
    {
        int l = 0, h = 1;
        int val = arr[0];
  
        // Find h to do binary search
        while (val < key)
        {
            l = h;        // store previous high
            h = 2*h;      // double high index
            val = arr[h]; // update new val
        }
  
        // at this point we have updated low
        //  and high indices, thus use binary 
        // search between them
        return binarySearch(arr, l, h, key);
    }
     static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }

        public static void main(String[] args) {
            int arr[] = new int[]{3, 5, 7, 9, 10, 90, 
                             100, 130, 140, 160, 170};
        int ans = findPos(arr,10);
         
        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }
            
        
    
}
