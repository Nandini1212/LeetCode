package macysPrep;

public class maxiumElement {
    
    public static int maximumElement(int[] arr) {
        int maximum = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if(maximum < arr[index]) {
                maximum = arr[index];
            }
 
        }
        return maximum;
    }
    
    public static void main(String[] args) {
       int arr [] = {1,4,5,68,100, 1000};
       int max = maximumElement(arr);
       System.out.println("maximum element in an array is " + max);
    }
    
}