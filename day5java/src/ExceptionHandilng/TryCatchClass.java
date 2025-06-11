package ExceptionHandilng;

import java.util.Arrays;

public class TryCatchClass {
	
     public static void main(String[] agrs) {
    	 int[] arr = new int[5];
    	 System.out.println(Arrays.toString(arr));
    	 try {
    		 arr[10] = 12;
    	 }catch (Exception e) {
    		 System.out.println("Enter the index");
    	 }finally {
    	 System.out.println(Arrays.toString(arr));
     }
     }
}

