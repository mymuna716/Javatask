import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
public class Mergearray {


	   public static void main(String[] args) {
		   int arr1[ ]= { 5,17,2,9,3 };
		   int arr2[ ]= { 10,9,6,4,5 };
	      int[]result = new int[arr1.length+arr2.length];
	      int count = 0;

	      for(int i = 0; i<arr1.length; i++) {
	         result[i] = arr1[i];
	         count++;
	      }

	      for(int j = 0;j<arr2.length;j++) {
	         result[count++] = arr2[j];
	      }         
	      Arrays.sort(result);

	      for(int i = 0;i<result.length;i++) 
	    	  System.out.print(result[i]+" ");
	   }
}
