
//Question_1 :- Create an array with the values {1,2,3,4,5,6,7} and shuffle it.

import java.util.Arrays;
import java.util.Random;

public class Que1 {
    public static void shuffled(int arr[]){
        Random ran=new Random();
        for(int i=arr.length-1;i>0;i--){
            int index=ran.nextInt(i+1);
            //Now we swapping arr[i] and arr[index]

            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        shuffled(arr);
        System.out.println("Shuffled Array : "+Arrays.toString(arr));
    }
}
