package macysPrep;

public class ShiftChars {
    public static void shiftChars(String str, int numOfChars) {
        char [] strToChar = str.toCharArray();
        String result = "";
        
        for(int index = 0; index < numOfChars; index++) {
            char first = strToChar[index];
            char num = strToChar[numOfChars];
            strToChar[index]= strToChar[numOfChars + index];
            strToChar[numOfChars + index] = first;
            

            //System.out.println(index);
            //System.out.println(strToChar[numOfChars + index]);
            System.out.println(strToChar[index]);           
            
        }
           System.out.println(str.substring(numOfChars+numOfChars));

    }
    public static void main(String [] args) {
        String str = "abcedflmn";
        shiftChars(str, 3);
    }
}