package macysPrep;

class secondLargest {
    
    public static int secondLargest(int[] arr) {
        
        int largest = arr[0];
        int secondLargest = arr[1];
        
        if(arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
        } else {
            secondLargest = arr[0];
            largest = arr[1];            
        }
        
        for(int index = 2; index < arr.length; index++) {
            if (arr[index] < largest && arr[index] >= secondLargest) {
                secondLargest = arr[index]; 
            }
            if(arr[index] > largest) {
                secondLargest = largest;
                largest = arr[index];                
            }
        }
        return secondLargest;
       
    }
    
    public static void main(String args[]) {
        int[] arr = {1,1,1,1,1,1,1,1};
        int secondlargest = secondLargest(arr);
        System.out.println(secondlargest);
    }
    
}
