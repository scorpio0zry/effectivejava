package util;

/**
 * Created by lizichen1 on 9/28/16.
 */
public class Printer {

    public static String printIntArray(int arr[]){
        String returnValue = "";
        for (int i:arr) {
            returnValue += (i+" ");
        }
        return returnValue;
    }

    public static String printIntArray(int arr[], int endIndex){
        String returnValue = "";
        for (int i=0;i<=endIndex;i++) {
            returnValue += (arr[i]+" ");
        }
        return returnValue;
    }
}
